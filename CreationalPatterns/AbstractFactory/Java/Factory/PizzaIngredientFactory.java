package Factory;

import Products.Cheese.Cheese;
import Products.Dough.Dough;
import Products.Sauce.Sauce;

public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Dough createDough();
    public Sauce createSauce();
}