package task8;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scr.nextInt();
        evenOrOddNumber(number);
    }

    public static void evenOrOddNumber (int a){
        if (a % 2 == 0){
            System.out.println("Введённое число " + a + " чётное");
        }
        else {
            System.out.println("Введённое число " + a + " не чётное");
        }
    }
}
