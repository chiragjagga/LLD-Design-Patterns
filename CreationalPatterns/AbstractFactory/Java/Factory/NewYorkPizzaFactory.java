package Factory;

import Products.Cheese.Cheese;
import Products.Cheese.MozzarellaCheese;
import Products.Dough.Dough;
import Products.Dough.ThinCrustDough;
import Products.Sauce.KoreanSauce;
import Products.Sauce.Sauce;


public class NewYorkPizzaFactory implements PizzaIngredientFactory{
        @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new KoreanSauce();
    }
}
