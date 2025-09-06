public enum ThreadSafeEnumOven{
    OVEN;

    public void bake(){
        System.out.println("Baking in enum oven");
    }

    public void preHeat(){
        System.out.println("Preheating enum oven");
    }
}