package Director;

import Builder.Interface.PizzaBuilder;

public class PizzaChef {
    public void construct(PizzaBuilder builder){
        builder.buildCheese();
        builder.buildToppings();
    }
}
