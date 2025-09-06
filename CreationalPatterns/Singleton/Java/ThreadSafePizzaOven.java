// Eager Initialization

public class ThreadSafePizzaOven {
    private static final ThreadSafePizzaOven oven = new ThreadSafePizzaOven();

    private ThreadSafePizzaOven(){}

    public static ThreadSafePizzaOven getOven(){
        return oven;
    }

    public void bake(){
        System.out.println("Baking in thread safe oven");
    }

    public void preHeat(){
        System.out.println("Preheating thread safe oven");
    }
}
