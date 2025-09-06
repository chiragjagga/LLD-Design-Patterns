import Implementations.FarmhousePizza;
import Implementations.MargheritaPizza;
import Implementations.Pizza;
import Interfaces.AbstractPizza;
import Prototype.IPizzaPrototype;
import Registry.PizzaRegistry;

public class Prototype {
    public static void main(String[] args) {

        // using registry for fixed menu items
        PizzaRegistry pizzaRegistry = new PizzaRegistry();
        pizzaRegistry.addPizza("margherita", new MargheritaPizza());
        pizzaRegistry.addPizza("farmhouse", new FarmhousePizza());

        // using base pizza cloning for custom pizza
        AbstractPizza customPizza = new Pizza();
        customPizza.setDough("Sourdough");
        customPizza.setSauce("Korean");
        customPizza.addTopping("Panner");
        customPizza.addTopping("Red Pepper");
        System.out.println(customPizza.toString());

        IPizzaPrototype margherita = pizzaRegistry.createPizza("margherita");
        System.out.println(margherita.toString());

        IPizzaPrototype farmhouse = pizzaRegistry.createPizza("farmhouse");
        System.out.println(farmhouse.toString());

        IPizzaPrototype anotherCustom = customPizza.copy();
        System.out.println(anotherCustom.toString());
    }
}
