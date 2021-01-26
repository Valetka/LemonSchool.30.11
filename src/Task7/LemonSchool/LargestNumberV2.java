package task7.LemonSchool;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumberV2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList numbers = new ArrayList();
        int max = Integer.MIN_VALUE;
        System.out.println("Введите число");
        while (true) {
            String a = scr.nextLine();
            if (a.equals("=")) {
                break;
            }
            int number = Integer.parseInt(a);
            numbers.add(number);
            for (int i = 0; i < numbers.size(); i++) {
                max = Math.max((int)numbers.get(i), max);
            }
            System.out.println("Введите следующее число либо символ =");
        }
        System.out.println("Максимальное значение из введённых чисел равно: " + max);
        }
    }

