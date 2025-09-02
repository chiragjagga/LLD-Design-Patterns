public abstract class PizzaRestaurant {
    private readonly IPizza pizza;

    public PizzaRestaurant()
    {
        this.pizza = CreatePizza();
    }

    public void processPizzaOrder()
    {
        Console.WriteLine("Received Pizza Order!!");

        pizza.Bake();
        pizza.Pack();
    }

    public abstract IPizza CreatePizza();
}