package task4;

public class SumDigitsInNumberV2 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(254));
    }
    public static int sumDigitsInNumber(int threeDigitNumber) {
        int sum = 0;
        sum += threeDigitNumber % 10;
        threeDigitNumber = threeDigitNumber / 10;
        sum += threeDigitNumber % 10;
        threeDigitNumber = threeDigitNumber / 10;
        sum += threeDigitNumber % 10;
        return sum;
    }
}
