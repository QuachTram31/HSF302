package com.tram.heath;

import com.tram.heath.core.BmiCaculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        // biến - attribute
        static void main(){
            // printBMI(); // call method
            // sài class ,imnhf tự viết lấy từ nơi khác thì phải import
            // com.tram.heath.core.BmiCaculator.printBMI(); // gọi hàm tiện ích từ class khác
            BmiCaculator.printBMI(); // gọi hàm tiện ích từ class khác sau khi đã import

            // sài hàm trả về nè
            // chỉ cần gõ số nó sẽ tự gợi ý tên tham số để đọc lại code cho dễ hiểu
            double bmi = BmiCaculator.getBmi(70,1.70);
            System.out.println("Bmi by calling mlem method: " + bmi);
        }
        // hàm - method là hành động
//        public static void printBMI(){
//            // bmi = cân nặng / (chiều cao * chiều cao)
//            // bmi < 18.5 => gầy
//            // 18.5 <= bmi < 25 => bình thường
//            // 25 <= bmi < 30 => thừa cân
//            // 30 <= bmi < 35 => béo phì độ 1
//
//            double weight = 70; // cân nặng
//            double height = 1.70; // chiều cao
//            double bmi = weight / (height * height);
//            System.out.println(" your BMI (70kg, 1.70m): " + bmi); // sout tab
//            // chỉ in ra console
//
//
//        }
}