package com.model2.mvc.mapper;

import com.model2.mvc.entity.ProductEntity;
import com.model2.mvc.service.domain.Product;
import java.sql.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-18T19:48:55+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 17.0.8.1 (JetBrains s.r.o.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productEntityToProduct(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.manuDate( dateToString( entity.getManuDate() ) );
        product.fileName( entity.getFileName() );
        product.price( entity.getPrice() );
        product.prodDetail( entity.getProdDetail() );
        product.prodName( entity.getProdName() );
        product.prodNo( entity.getProdNo() );
        if ( entity.getRegDate() != null ) {
            product.regDate( new Date( entity.getRegDate().getTime() ) );
        }
        product.views( entity.getViews() );
        product.stock( entity.getStock() );

        return product.build();
    }

    @Override
    public ProductEntity productToProductEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity.ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.manuDate( stringToDate( product.getManuDate() ) );
        productEntity.prodNo( product.getProdNo() );
        productEntity.prodName( product.getProdName() );
        productEntity.prodDetail( product.getProdDetail() );
        productEntity.price( product.getPrice() );
        productEntity.fileName( product.getFileName() );
        productEntity.views( product.getViews() );
        productEntity.stock( product.getStock() );

        return productEntity.build();
    }
}
