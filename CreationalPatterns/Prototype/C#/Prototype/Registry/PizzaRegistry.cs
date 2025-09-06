public class PizzaRegistry {
    private Dictionary<String, IPizzaPrototype> PizzaPrototypes = new Dictionary<string, IPizzaPrototype>();

    public IPizzaPrototype createPizza(String key){
        IPizzaPrototype? prototype = PizzaPrototypes.GetValueOrDefault(key);
        if (prototype == null) {
            throw new Exception("Pizza type '" + key + "' not found.");
        }
        return prototype.Copy();
    }

    public void addPizza(String key, IPizzaPrototype pizza){
        PizzaPrototypes.Add(key, pizza);
    }
}
