package com.model2.mvc.service.domain;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userId;
    private String userName;
    private String password;
    private String role;
    private String ssn;
    private String phone;
    private String addr;
    private String email;
    private Date regDate;
    /////////////// EL 적용 위해 추가된 Field ///////////
    private String phone1;
    private String phone2;
    private String phone3;
    ////////////// 다중품목 구매 및 장바구니 구현을 위한  Field ////////////
    private int cartTranNo;

    public void setPhone(String phone) {
        this.phone = phone;
        /////////////// EL 적용 위해 추가 ///////////
        if(phone != null && phone.length() !=0 ){
            phone1 = phone.split("-")[0];
            phone2 = phone.split("-")[1];
            phone3 = phone.split("-")[2];
        }
    }

}