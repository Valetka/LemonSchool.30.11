package Task1.LemonSchool;

public class RemainderOfTheDivision {
    public static void main(String[] args) {
        printDivisionAndRemainder(21, 8);
    }
    public static void printDivisionAndRemainder(int q, int w){
        System.out.println(q+" / "+w+" = "+(q/w)+" и "+(q%w)+" в остатке");
    }
}
