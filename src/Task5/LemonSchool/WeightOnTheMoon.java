package Task5.LemonSchool;

import java.util.Scanner;

public class WeightOnTheMoon {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите Ваш вес");
        double weight = scr.nextDouble();
        System.out.println("Ваш вес на луне: " + WeightOnTheMoon.getWeightOnTheMoon(weight));
    }
    public static double getWeightOnTheMoon(double earthWeight) {
        return earthWeight*17/100.0;
    }
}
