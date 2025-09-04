package Builder.Implementations;

import Builder.Interface.PizzaBuilder;
import Models.Pizza;

public class PeppyPannerPizzaBuilder implements PizzaBuilder {

    private Pizza.Builder pizzaBuilder;

    public PeppyPannerPizzaBuilder(){
        this.pizzaBuilder = new Pizza.Builder("Fresh Pan", "Korean");
    }

    @Override
    public void buildCheese() {
        pizzaBuilder.withCheese("Mozzarella");
    }

    @Override
    public void buildToppings() {
        pizzaBuilder.withTopping("Panner");
        pizzaBuilder.withTopping("Red Pepper");
    }

    @Override
    public Pizza getResult() {
        return pizzaBuilder.build();
    }
    
}
