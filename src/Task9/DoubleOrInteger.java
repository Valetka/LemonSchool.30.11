package task9;

import java.util.Scanner;

public class DoubleOrInteger {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число");
        double number = scr.nextDouble();
        doubleOrInt(number);
    }
    public static void doubleOrInt (double a){
        if (a%1==0){
            System.out.println("Число " + a + " целое");
        }
        else {
            System.out.println("Число " + a + " вещественное");
        }
    }
}
