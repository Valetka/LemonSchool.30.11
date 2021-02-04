package task12;

import java.util.Scanner;

public class SpeedTimeDistance {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите расстояние до точки назначения в км");
        double distance;
        do {
            distance = scr.nextDouble();
            if (distance<0){
                System.out.println("Растояние не может быть меньше 0 км. Введите корректные данные");
            }
        }
        while (distance<0);
        System.out.println("Введите ориентировочное время преодоления указанной дистанции в часах");
        double time;
        do {
            time = scr.nextDouble();
            if (time<0){
                System.out.println("Время не может быть меньше 0 часов. Введите корректные данные");
            }
        }
        while (time<0);
        System.out.println("Расстояние " + distance + " км будет предолено за время " + time + " часов при скорости " + distance / time);
    }
}
