package Interfaces;

import java.util.ArrayList;
import java.util.List;

import Prototype.IPizzaPrototype;

public abstract class AbstractPizza implements IPizzaPrototype {
    public String dough;
    public String sauce;
    public List<String> toppings;

    public AbstractPizza(){
        this.toppings = new ArrayList<>();
    }

    protected AbstractPizza(AbstractPizza source){
        this.dough = source.dough;
        this.sauce = source.sauce;
        this.toppings = new ArrayList<>(source.toppings);
    }

    public void setDough(String dough) { this.dough = dough; }
    public void setSauce(String sauce) { this.sauce = sauce; }
    public void addTopping(String topping) { this.toppings.add(topping); }
    
    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, and toppings: " + toppings;
    }
}
