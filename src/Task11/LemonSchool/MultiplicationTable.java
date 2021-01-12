package Task11.LemonSchool;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scr.nextInt();
        multiplicationTableForNumber(number);
    }
    public static void multiplicationTableForNumber (int a){
        for (int i = 1; i <= 10; i++) {
                System.out.print(i * a);
                System.out.print(" ");
        }
    }
}
