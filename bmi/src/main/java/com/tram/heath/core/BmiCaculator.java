package com.tram.heath.core;

public class BmiCaculator {
    // nếu class chứ hàm để tiện ích để tính toán rồi trả về không lưu lại gì cả thì ta gọi là hàm tiện ích và hay thiết kế theo style static method

    // hàm mlem hàm reuse mức độ cao, chỉ nhận vào tham số, trả về qua return
    public static double getBmi(double weight, double height){
        double bmi = weight / (height * height);
        return bmi;
    }
    public static void printBMI(){
        // bmi = cân nặng / (chiều cao * chiều cao)
        // bmi < 18.5 => gầy
        // 18.5 <= bmi < 25 => bình thường
        // 25 <= bmi < 30 => thừa cân
        // 30 <= bmi < 35 => béo phì độ 1

        double weight = 70; // cân nặng
        double height = 1.70; // chiều cao
        double bmi = weight / (height * height);
        System.out.println("your BMI (70kg, 1.70m): " + bmi); // sout tab
        // chỉ in ra console


    }
}
