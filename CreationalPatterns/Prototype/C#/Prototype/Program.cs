// See https://aka.ms/new-console-template for more information

        // using registry for fixed menu items
        PizzaRegistry pizzaRegistry = new PizzaRegistry();
        pizzaRegistry.addPizza("margherita", new MargheritaPizza());
        pizzaRegistry.addPizza("farmhouse", new FarmhousePizza());

        // using base pizza cloning for custom pizza
        AbstractPizza customPizza = new Pizza();
        customPizza.SetDough("Sourdough");
        customPizza.SetDough("Korean");
        customPizza.AddTopping("Panner");
        customPizza.AddTopping("Red Pepper");
        Console.WriteLine(customPizza.ToString());

        IPizzaPrototype margherita = pizzaRegistry.createPizza("margherita");
        Console.WriteLine(margherita.ToString());

        IPizzaPrototype farmhouse = pizzaRegistry.createPizza("farmhouse");
        Console.WriteLine(farmhouse.ToString());

        IPizzaPrototype anotherCustom = customPizza.Copy();
        Console.WriteLine(anotherCustom.ToString());