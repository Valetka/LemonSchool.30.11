package task2;

public class SumDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(25));
    }
    public static int sumDigitsInNumber(int twoDigitNumber) {
        int sum = 0;
        sum += twoDigitNumber / 10;
        sum += twoDigitNumber % 10;
        return sum;
    }
}
