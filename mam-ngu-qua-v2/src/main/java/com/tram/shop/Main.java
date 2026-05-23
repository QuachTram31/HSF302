package com.tram.shop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tram.shop.entity.Fruit;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws JsonProcessingException {
        // new object theo 2 style
        // 1. constructor
        // 2. builder pattern chấm chấm liên tục
        // Bản chất là new và set

        Fruit cau = new Fruit(); // default bên trong chuỗi thì rỗng, số thì 0
        // new theo constructor rỗng nó sẽ tự import cho mình

        // Gọi hàm set cau.setPrice(5.0);
        // cau.setName("Mãng cầu");
        Fruit sung = new Fruit("SS", "Trái sung","Trái sung ..." ,6.0);

        // style lombok builder pattern bắt đầu
//        String msg = "Hello Lombok".toLowerCase()
//                .toLowerCase() // biến này thành msg2 để chấm tiếp
//                .toUpperCase();
        // muốn lấy chiều dài nó là msg.length
        // đây là gọi hàm theo chuỗi

        Fruit dua = Fruit.builder()
                .name("Trái dừa")
                .price(5.0)
                .id("D")
                .desc("Dzừa Dzừa cũng cũng")
                .build(); // kĩ thuật builder
        // in như truyền thống
        System.out.println("Sung detail: "+ sung);
        System.out.println("Dừa detail: "+ dua);

        // Biến đổi thành json
        // convert thành json, có khai báo dependence rồi, mở code cũ
        ObjectMapper mapper = new ObjectMapper();
        String duaJson = mapper.writeValueAsString(dua); // đưa object về string
        System.out.println("Dừa json: "+ duaJson);

        String sungJson = mapper.writeValueAsString(sung);
        System.out.println("Sung json: "+ sungJson);
    }
}
