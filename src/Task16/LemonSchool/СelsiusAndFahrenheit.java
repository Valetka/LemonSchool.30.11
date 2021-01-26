package task16.LemonSchool;

import java.util.Scanner;

public class СelsiusAndFahrenheit {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия");
        double celsius = scr.nextDouble();
        System.out.println("Температура " + celsius + " в градусах Цельсия равна " + convertCelsiusToFahrenheit(celsius) + " в градусах Фаренгейта");
        }
    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = 9 / 5.0 * celsius + 32;
        return fahrenheit;
    }
}
