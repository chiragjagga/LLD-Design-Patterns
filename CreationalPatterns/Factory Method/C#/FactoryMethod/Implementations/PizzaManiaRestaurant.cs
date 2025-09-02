public class PizzaManiaRestaurant : PizzaRestaurant
{
    public override IPizza CreatePizza()
    {
        return new PizzaMania();
    }
}