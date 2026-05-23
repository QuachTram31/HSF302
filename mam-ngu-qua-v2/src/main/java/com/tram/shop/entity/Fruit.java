package com.tram.shop.entity;

import lombok.*;

@NoArgsConstructor // constructor rỗng
@AllArgsConstructor // constructor có tham số
@Data // tự động tạo getter, setter, toString, equals, hashCode
@Builder // tạo builder pattern để dễ dàng tạo đối tượng
// Kĩ thuật tạo object style chấm chấm liên tục
// Liên quan đến 1 kĩ thuật thiết kế classs gọi là Builder nằm trong 1 nhóm kĩ thuật thiết kế class xịn sò, gọi chung là design patterns
// cuốn bí kiếp design pattern có 23 chiêu thức(tác giả Gof)

public class Fruit {

    private String id;
    private String name;
    private String desc;
    private double price;

}
