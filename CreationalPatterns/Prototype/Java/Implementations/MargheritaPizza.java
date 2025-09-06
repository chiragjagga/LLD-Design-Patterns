package Implementations;

import Interfaces.AbstractPizza;
import Prototype.IPizzaPrototype;

public class MargheritaPizza extends AbstractPizza {

    public MargheritaPizza(){
        super();
        this.dough = "Hand Tossed";
        this.sauce = "Tomato";
        this.toppings.add("Mozzarella Cheese");
    }

    public MargheritaPizza(MargheritaPizza source){
        super(source);
    }

    @Override
    public IPizzaPrototype copy() {
        return new MargheritaPizza(this);
    }    
}
