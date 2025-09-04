public class PeppyPannerPizzaBuilder : PizzaBuilder {

    private Pizza.Builder pizzaBuilder;

    public PeppyPannerPizzaBuilder(){
        this.pizzaBuilder = new Pizza.Builder("Fresh Pan", "Korean");
    }

    public void BuildCheese() {
        pizzaBuilder.WithCheese("Mozzarella");
    }

    public void BuildToppings() {
        pizzaBuilder.WithTopping("Panner");
        pizzaBuilder.WithTopping("Red Pepper");
    }

    public Pizza GetResult() {
        return pizzaBuilder.Build();
    }
    
}
