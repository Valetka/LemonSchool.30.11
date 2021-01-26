package homework.coffeeShop;

public class CoffeeShop {
    public static void main(String[] args) {
        Barista.getEmployee().takeOrder();
        Barista.getEmployee().createCoffee(VarietiesOfCoffee.ESPRESSO);
    }
}
