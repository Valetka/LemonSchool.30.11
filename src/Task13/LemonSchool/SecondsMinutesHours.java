package Task13.LemonSchool;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SecondsMinutesHours {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите сколько суток нужно посчитать");
        int days = scr.nextInt();
        long hours = TimeUnit.DAYS.toHours(days);
        long minutes = TimeUnit.DAYS.toMinutes(days);
        long seconds = TimeUnit.DAYS.toSeconds(days);
        System.out.println("Указанное колличество суток: " + days + " содержит " + hours + " часов, " + " " + minutes + " минут, " + seconds + " cекунд.");
    }
}
