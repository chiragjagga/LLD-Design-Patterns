public class PizzaOven {
    private static PizzaOven? oven;

    private PizzaOven(){}

    public static PizzaOven GetOven(){
        if(oven == null){
            oven = new PizzaOven();
        }
        return oven;
    }

    public void Bake(){
        Console.WriteLine("Baking in oven");
    }

    public void PreHeat(){
        Console.WriteLine("Preheating oven");
    }
}
