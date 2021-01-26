package homework.coffeeShop;


public class Barista {
    private static Barista employee;

    private Barista() {
    }

    public static Barista getEmployee() {
        if (employee == null) {
            employee = new Barista();
        }
        return employee;
    }

    public void takeOrder (){
        System.out.println("Приветсвую в нашем Coffee Shop!");
        System.out.println("Какой кофе желаете?");
    }
    public Coffee createCoffee(VarietiesOfCoffee type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case LATTE:
                coffee = new Latte();
                break;
        }
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Что-нибудь ещё желаете?");
        return coffee;
    }
}
