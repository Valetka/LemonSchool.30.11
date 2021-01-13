package Task15.LemonSchool;

public class RightTriangle {
    public static void main(String[] args) {
        double leg1 = 12.2;
        double leg2 = 13.8;
        double hypotenuse = Math.sqrt(leg1*leg1 + leg2*leg2);
        double area = (leg1*leg2)/2;
        double perimeter = leg1 + leg2 + hypotenuse;
        System.out.println("Гипотенуза равна: " + hypotenuse + "\n" + "Площадь равна: " + area + "\n" + "Периметр равен: " + perimeter);
    }
}
