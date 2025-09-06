public class PizzaOven {
    private static PizzaOven oven;

    private PizzaOven(){}

    public static PizzaOven getOven(){
        if(oven == null){
            oven = new PizzaOven();
        }
        return oven;
    }

    public void bake(){
        System.out.println("Baking in oven");
    }

    public void preHeat(){
        System.out.println("Preheating oven");
    }
}
