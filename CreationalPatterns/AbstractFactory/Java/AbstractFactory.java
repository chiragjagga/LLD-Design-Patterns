import Factory.NewYorkPizzaFactory;
import Factory.PizzaIngredientFactory;
import Factory.PizzaManiaFactory;

public class AbstractFactory {
    public static void main(String[] args){
        PizzaIngredientFactory factory = new PizzaManiaFactory();
        
        factory.createDough().prepareDough();
        System.out.println("Creating pizza mania pizza with cheese melt time : " + factory.createCheese().getMeltingTime());
        System.out.println("Adding sauce with flavour");
        factory.createSauce().getFlavour();
        
        factory = new NewYorkPizzaFactory();
        factory.createDough().prepareDough();
        System.out.println("Creating pizza mania pizza with cheese melt time : " + factory.createCheese().getMeltingTime());
        System.out.println("Adding sauce with flavour");
        factory.createSauce().getFlavour();
    }
}
