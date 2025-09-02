package Implementations;

import Interfaces.IPizza;
import Interfaces.PizzaRestaurant;

public class ItalianPizzaRestaurant extends PizzaRestaurant {

    @Override
    public IPizza createPizza() {
        return new ItalianPizza(); 
    }
}
