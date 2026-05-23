package com.tram.fruit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tram.fruit.entity.Fruit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws JsonProcessingException { // bắt hàm main
        Fruit cau = new Fruit("MC", "mãng cầu" ,"Mãng cầu là trái đầu tiên trong mâm ngũ quả", 5.0);
        System.out.println(cau.toString());
        // chuyển file này convert json về FE React, bữa nay in đỡ ra màng hình
        // nhờ vả thư viện jackson, gọi class và hàm của nó
        ObjectMapper mapper = new ObjectMapper();
        String cauJson = mapper.writeValueAsString(cau); // chuyển object cau thành chuỗi json
        System.out.println("JSON mlem: " + cauJson);
        // từ JSOn về lại object
        // khai báo String
        // nháy đôi shift nháy đôi
        // nhét hết vào 3 dấu đó luôn
        String SungJson = """
               {"id":"SS","name":"SUNG SƯỚNG","dis":"Sung là trái thứ 2 trong mâm ngũ quả","price":4.0}
                """;
        Fruit sung = mapper.readValue(SungJson, Fruit.class); // chuyển chuỗi json về object rã parse new ngầm
        System.out.println("Object Sung: " + sung.toString());
    }
}
