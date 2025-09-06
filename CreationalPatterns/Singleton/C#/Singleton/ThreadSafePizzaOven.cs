// Eager Initialization

public class ThreadSafePizzaOven {
    private static readonly ThreadSafePizzaOven oven = new ThreadSafePizzaOven();

    private ThreadSafePizzaOven(){}

    public static ThreadSafePizzaOven GetOven(){
        return oven;
    }

    public void Bake(){
        Console.WriteLine("Baking in thread safe oven");
    }

    public void PreHeat(){
        Console.WriteLine("Preheating thread safe oven");
    }
}
