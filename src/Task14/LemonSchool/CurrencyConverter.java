package task14.LemonSchool;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите сумму в гривнах, которую необходимо конвертировать");
        double hryvnia;
        do {
            hryvnia = scr.nextDouble();
            if (hryvnia<0){
                System.out.println("Сумма не может быть меньше 0 грн. Введите корректные данные");
            }
        }
        while (hryvnia<0);

        System.out.println("Укажите текущий курс доллара");
        double currentRate;
        do {
            currentRate = scr.nextDouble();
            if (currentRate<0){
                System.out.println("Курс не может быть меньше 0 долларов. Введите корректные данные");
            }
        }
        while (currentRate<0);

        currencyConverter(hryvnia, currentRate);
    }
    public static void currencyConverter (double hryvnia, double currentRate){
        double dollar = hryvnia / currentRate;
        System.out.println(hryvnia + " гривен по указанному курсу составит " + dollar + " долларов");
    }
}
