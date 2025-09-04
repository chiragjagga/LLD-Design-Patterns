import Builder.Implementations.FarmhousePizzaBuilder;
import Builder.Implementations.PeppyPannerPizzaBuilder;
import Builder.Interface.PizzaBuilder;
import Director.PizzaChef;
import Models.Pizza;

public class Builder {
    public static void main(String[] args){
        System.out.println("Using director to create standard pizza's");
        PizzaChef chef = new PizzaChef();

        PizzaBuilder farmhouseBuilder = new FarmhousePizzaBuilder();
        chef.construct(farmhouseBuilder);
        Pizza farmhouse = farmhouseBuilder.getResult();

        System.out.println("Chef prepared:" + farmhouse);

        PizzaBuilder peppyPannerBuilder = new PeppyPannerPizzaBuilder();
        chef.construct(peppyPannerBuilder);
        Pizza peppyPanner = peppyPannerBuilder.getResult();
        
        System.out.println("Chef prepared:" + peppyPanner);

        System.out.println("Using inner fluent builder to build custom pizza");

        Pizza customPizza = new Pizza.Builder("Sourdough", "Tomato")
        .withCheese("Four Cheese")
        .build();

        System.out.println("Customer created custom pizza:" + customPizza);
    }
}
