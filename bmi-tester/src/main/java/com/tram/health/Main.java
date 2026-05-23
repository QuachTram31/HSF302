package com.tram.health;

import com.tram.heath.core.BmiCaculator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        double bmi = BmiCaculator.getBmi(70,1.70);
        System.out.println("Your BMI is: " + bmi);
    }
}
