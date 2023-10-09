package Decorator;

public class Bread implements PizzaConstituents{
    Bread(){

    }

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Bread";
    }
}
