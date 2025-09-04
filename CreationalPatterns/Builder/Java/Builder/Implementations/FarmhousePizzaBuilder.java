package Builder.Implementations;

import Builder.Interface.PizzaBuilder;
import Models.Pizza;

public class FarmhousePizzaBuilder implements PizzaBuilder {

    private Pizza.Builder pizzaBuilder;

    public FarmhousePizzaBuilder(){
        this.pizzaBuilder = new Pizza.Builder("Classic Tossed", "Tomato");
    }

    @Override
    public void buildCheese() {
        pizzaBuilder.withCheese("Fresh Mozzarella");
    }

    @Override
    public void buildToppings() {
        pizzaBuilder.withTopping("Mushroom");
        pizzaBuilder.withTopping("Tomato");
        pizzaBuilder.withTopping("Capsicum");
        pizzaBuilder.withTopping("Onion");
    }

    @Override
    public Pizza getResult() {
        return pizzaBuilder.build();
    }
    
}
