public enum ThreadSafeEnumOven {
    OVEN
}

static class EnumSingleExtensions{
    public static void Bake(this ThreadSafeEnumOven oven) {
        Console.WriteLine("Baking in enum oven");
    }

    public static void PreHeat(this ThreadSafeEnumOven oven){
        Console.WriteLine("Preheating enum oven");
    }
}