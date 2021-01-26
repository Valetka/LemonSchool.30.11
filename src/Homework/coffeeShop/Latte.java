package homework.coffeeShop;

public class Latte implements Coffee {

    @Override
    public void grindCoffee() {
        System.out.println("*перемалываем кофе*");
    }

    @Override
    public void makeCoffee() {
        System.out.println("*делаем латтэ*");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("*наливаем латтэ в чашку*");
    }
}
