public class Singleton {
    public static void main(String[] args) {
        PizzaOven oven = PizzaOven.getOven();
        oven.bake();

        ThreadSafePizzaOven threadSafePizzaOven = ThreadSafePizzaOven.getOven();
        threadSafePizzaOven.bake();

        ThreadSafeEnumOven threadSafeEnumOven = ThreadSafeEnumOven.OVEN;
        threadSafeEnumOven.preHeat();
    }
}
