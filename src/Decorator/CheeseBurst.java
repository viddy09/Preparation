package Decorator;

public class CheeseBurst implements PizzaConstituents{
    private PizzaConstituents pizzaConstituents;

    CheeseBurst(PizzaConstituents pizzaConstituents){
        if(pizzaConstituents == null){
            throw new IllegalArgumentException("Cheese Burst cannot be applied without Bread!!!");
        }
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        return pizzaConstituents.getCost()+50;
    }

    @Override
    public String getDescription() {
        return pizzaConstituents.getDescription()+ " CheeseBurst";
    }
}
