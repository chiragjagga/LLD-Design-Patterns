public class ItalianPizzaRestaurant : PizzaRestaurant {

    public override IPizza CreatePizza() {
        return new ItalianPizza(); 
    }
}