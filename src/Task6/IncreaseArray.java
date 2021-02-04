package task6;

import java.util.Random;

public class IncreaseArray {
    public static void main(String[] args) {
        double [] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        increaseArray(array, 5);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public static void increaseArray (double [] array, int a){
        for (int i = 0; i < array.length; i++){
            if (i==a){
                array[i] = array[i]  * 1.1;
            }
        }
    }
}
