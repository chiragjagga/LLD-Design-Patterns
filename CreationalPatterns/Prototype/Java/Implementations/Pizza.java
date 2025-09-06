package Implementations;

import Interfaces.AbstractPizza;
import Prototype.IPizzaPrototype;

public class Pizza extends AbstractPizza{
    public Pizza(){
        super();
    }

    public Pizza(Pizza source){
        super(source);
    }

    @Override
    public IPizzaPrototype copy() {
        return new Pizza(this);
    }
    
}
