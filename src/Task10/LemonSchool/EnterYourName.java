package task10.LemonSchool;

import java.util.Scanner;

public class EnterYourName {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scr.nextLine();
        System.out.println("Ваше имя "+ name);
    }
}
