package com.model2.mvc.web.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model2.mvc.common.Page;
import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;



//==> 회원관리 Controller
@RestController
@RequestMapping("/product/*")
public class ProductRestController {

    ///Field
    @Autowired
    @Qualifier("productServiceImpl")
    private ProductService productService;
    //setter Method 구현 않음

    public ProductRestController(){
        System.out.println(this.getClass());
    }

    @Value("${pageUnit}")
    int pageUnit;

    @Value("${pageSize}")
    int pageSize;


    @PostMapping(value="json/addProduct")
    public Product addProduct( @RequestBody Product product) throws Exception {

        System.out.println("/addProduct.do");
        //Business Logic

        return product;
    }

    @RequestMapping(value="json/getProduct")
    public Map<String, Object> getProduct(int prodNo, String menu, HttpServletRequest request) throws Exception {

        System.out.println("/getProduct.do");
        //Business Logic
        Product product = productService.getProduct(prodNo);

        String cookieValue = "";
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for(Cookie c : cookies) {
                if(c.getName().equals("history")) {
                    cookieValue = c.getValue();
                }
            }
        }
        cookieValue += "/" + product.getProdNo();

        Map<String, Object> map = new HashMap<>();
        map.put("menu", menu);
        map.put("product", product);
        map.put("cookie", cookieValue);

        return map;
    }

    @RequestMapping(value="json/listProduct")
    public List<Product> listProduct(@RequestBody Search search	) throws Exception {

        search.setPageSize(pageSize);


        Map<String,Object> map = productService.getProductList(search);

        // Business logic 수행
        return (List<Product>)map.get("list");
    }

    @GetMapping(value="json/updateProduct")
    public Product updateProductView(int prodNo) throws Exception{
        Product product = productService.getProduct(prodNo);
        return product;
    }

    // 여기부터 안함
    @PostMapping(value="json/updateProduct")
    public String updateProduct( @ModelAttribute("product") Product product , Model model) throws Exception{
        productService.updateProduct(product);
        return "forward:/product/getProduct?prodNo="+product.getProdNo();
    }

    @PostMapping(value="json/listProductName")
    public List<String> listProductName() throws Exception{
        List<String> list = productService.getProductListName();
        return list;
    }


}