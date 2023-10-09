package Decorator;

public class Veggies implements PizzaConstituents{

    private PizzaConstituents pizzaConstituents;
    Veggies(PizzaConstituents pizzaConstituents){
        if(pizzaConstituents == null){
            throw new IllegalArgumentException("Veggies cannot be applied to Pizza without bread!!!");
        }
        this.pizzaConstituents = pizzaConstituents;
    }
    @Override
    public int getCost() {
        return pizzaConstituents.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return pizzaConstituents.getDescription() + " Veggies";
    }
}
