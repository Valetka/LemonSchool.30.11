package homework.coffeeShop;

public class Cappuccino implements Coffee {
    @Override
    public void grindCoffee() {
        System.out.println("*перемалываем кофе*");
    }

    @Override
    public void makeCoffee() {
        System.out.println("*делаем капучино*");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("*наливаем капучино в чашку*");
    }
}
