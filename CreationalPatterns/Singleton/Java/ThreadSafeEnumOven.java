public enum ThreadSafeEnumOven{
    OVEN;

    public void bake(){
        System.out.println("Baking in oven");
    }

    public void preHeat(){
        System.out.println("Preheating oven");
    }
}