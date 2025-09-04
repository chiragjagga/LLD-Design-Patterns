// See https://aka.ms/new-console-template for more information
PizzaIngredientFactory factory = new PizzaManiaFactory();

factory.createDough().prepareDough();
Console.WriteLine("Creating pizza mania pizza with cheese melt time : " + factory.createCheese().getMeltingTime());
Console.WriteLine("Adding sauce with flavour");
factory.createSauce().getFlavour();

factory = new NewYorkPizzaFactory();
factory.createDough().prepareDough();
Console.WriteLine("Creating pizza mania pizza with cheese melt time : " + factory.createCheese().getMeltingTime());
Console.WriteLine("Adding sauce with flavour");
factory.createSauce().getFlavour();
