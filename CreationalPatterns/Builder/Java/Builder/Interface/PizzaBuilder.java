package Builder.Interface;

import Models.Pizza;

public interface PizzaBuilder {
    void buildCheese();
    void buildToppings();
    Pizza getResult();
}
