package com.tram.fruit.entity;

public class Fruit {
    private String id;
    private String name;
    private String dis; // sửa desc
    private double price;
    // đây là form để ánh xạ xuống table dưới db
    // constructor get set
    // code tay hoặc nhờ tool
    public Fruit() {
        // constructor rỗng
    }

    public Fruit(String id, String name, String dis, double price) {
        this.id = id;
        this.name = name;
        this.dis = dis;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDis() {
        return dis;
    }

    public void setDesc(String dis) {
        this.dis = dis;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
//        return "Fruit{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", dis='" + dis + '\'' +
//                ", price=" + price +
//                '}';
        return id + " | " + name + " | " + dis + " | " + price;
    }
}
// đoạn code nhàm chán nhưng k bỏ được bắt buộc phải có để hoàn thiện object
// cái gì phải làm nhưng nhàm chán thì được goi là Boiler-plate
// Lombok là một bộ thư viện trên mạng, nổi tiếng lắm luôn giúp chúng ta k cần viết code nhàm chán mà vẫn có code