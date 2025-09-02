import Implementations.ItalianPizzaRestaurant;
import Implementations.PizzaManiaRestaurant;
import Interfaces.PizzaRestaurant;

public class FactoryMethod {
    public static void main(String[] args){
        // italian restaurant
        PizzaRestaurant restaurant = new ItalianPizzaRestaurant();
        restaurant.createPizza();
        restaurant.processPizzaOrder();
        
        // pizza mania restaurant
        restaurant = new PizzaManiaRestaurant();
        restaurant.createPizza();
        restaurant.processPizzaOrder();
    }
}
