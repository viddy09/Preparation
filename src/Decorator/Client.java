package Decorator;

public class Client {
    public static void main(String[] args) {
        PizzaConstituents pizzaConstituents = new CheeseBurst(new CheeseBurst(new Bread()));

        System.out.println(pizzaConstituents.getCost());
        System.out.println(pizzaConstituents.getDescription());
    }
}
