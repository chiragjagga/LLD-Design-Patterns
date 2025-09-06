// See https://aka.ms/new-console-template for more information
        PizzaOven oven = PizzaOven.GetOven();
        oven.Bake();

        ThreadSafePizzaOven threadSafePizzaOven = ThreadSafePizzaOven.GetOven();
        threadSafePizzaOven.Bake();

        ThreadSafeEnumOven threadSafeEnumOven = ThreadSafeEnumOven.OVEN;
        threadSafeEnumOven.PreHeat();