package Implementations;

import Interfaces.IPizza;
import Interfaces.PizzaRestaurant;

public class PizzaManiaRestaurant extends PizzaRestaurant {

    @Override
    public IPizza createPizza() {
        return new PizzaMania();
    }
    
}
