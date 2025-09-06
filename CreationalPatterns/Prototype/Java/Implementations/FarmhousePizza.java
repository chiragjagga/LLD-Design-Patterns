package Implementations;

import Interfaces.AbstractPizza;
import Prototype.IPizzaPrototype;

public class FarmhousePizza extends AbstractPizza {

    public FarmhousePizza(){
        super();
        this.dough = "Fresh Pan";
        this.sauce = "Tomato";
        this.toppings.add("Mushroom");
        this.toppings.add("Capsicum");
        this.toppings.add("Onion");
        this.toppings.add("Tomato");
    }

    public FarmhousePizza(FarmhousePizza source){
        super(source);
    }

    @Override
    public IPizzaPrototype copy() {
        return new FarmhousePizza(this);
    }    
}
