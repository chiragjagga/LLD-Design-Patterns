package Interfaces;
public abstract class PizzaRestaurant {
    IPizza pizza = createPizza();

    public void processPizzaOrder(){
        System.out.println("Received Pizza Order!!");

        pizza.bake();
        pizza.pack();
    }

    public abstract IPizza createPizza();
}
