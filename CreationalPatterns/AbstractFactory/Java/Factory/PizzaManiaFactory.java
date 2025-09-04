package Factory;

import Products.Cheese.Cheese;
import Products.Cheese.LiquidCheese;
import Products.Dough.Dough;
import Products.Dough.FreshPanDough;
import Products.Sauce.Sauce;
import Products.Sauce.TomatoSauce;

public class PizzaManiaFactory implements PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new LiquidCheese();
    }

    @Override
    public Dough createDough() {
        return new FreshPanDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
    
}
