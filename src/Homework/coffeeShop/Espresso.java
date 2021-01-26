package homework.coffeeShop;

public class Espresso implements Coffee {
    @Override
    public void grindCoffee() {
        System.out.println("*перемалываем кофе*");
    }

    @Override
    public void makeCoffee() {
        System.out.println("*делаем эспрессо*");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("*наливаем эспрессо в чашку*");
    }
}
