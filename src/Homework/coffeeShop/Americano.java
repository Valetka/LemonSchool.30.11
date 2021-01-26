package homework.coffeeShop;

public class Americano implements Coffee {
    @Override
    public void grindCoffee() {
        System.out.println("*перемалываем кофе*");
    }

    @Override
    public void makeCoffee() {
        System.out.println("*делаем американо*");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("*наливаем американо в чашку*");
    }
}
