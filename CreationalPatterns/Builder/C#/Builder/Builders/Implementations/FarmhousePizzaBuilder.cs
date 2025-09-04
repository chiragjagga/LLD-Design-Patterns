
public class FarmhousePizzaBuilder : PizzaBuilder {

    private Pizza.Builder pizzaBuilder;

    public FarmhousePizzaBuilder(){
        this.pizzaBuilder = new Pizza.Builder("Classic Tossed", "Tomato");
    }

    public void BuildCheese() {
        pizzaBuilder.WithCheese("Fresh Mozzarella");
    }

    public void BuildToppings() {
        pizzaBuilder.WithTopping("Mushroom");
        pizzaBuilder.WithTopping("Tomato");
        pizzaBuilder.WithTopping("Capsicum");
        pizzaBuilder.WithTopping("Onion");
    }

    public Pizza GetResult() {
        return pizzaBuilder.Build();
    }
    
}
