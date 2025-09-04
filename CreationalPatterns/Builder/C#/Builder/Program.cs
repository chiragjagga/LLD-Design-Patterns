// See https://aka.ms/new-console-template for more information

Console.WriteLine("Using director to create standard pizza's");
PizzaChef chef = new PizzaChef();

PizzaBuilder farmhouseBuilder = new FarmhousePizzaBuilder();
chef.construct(farmhouseBuilder);
Pizza farmhouse = farmhouseBuilder.GetResult();

Console.WriteLine("Chef prepared:" + farmhouse);

PizzaBuilder peppyPannerBuilder = new PeppyPannerPizzaBuilder();
chef.construct(peppyPannerBuilder);
Pizza peppyPanner = peppyPannerBuilder.GetResult();
        
Console.WriteLine("Chef prepared:" + peppyPanner);

Console.WriteLine("Using inner fluent builder to build custom pizza");

Pizza customPizza = new Pizza.Builder("Sourdough", "Tomato")
    .WithCheese("Four Cheese")
    .Build();

Console.WriteLine("Customer created custom pizza:" + customPizza);
