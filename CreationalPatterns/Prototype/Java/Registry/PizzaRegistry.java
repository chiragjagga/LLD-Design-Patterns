package Registry;

import java.util.HashMap;
import java.util.Map;

import Prototype.IPizzaPrototype;

public class PizzaRegistry {
    private Map<String, IPizzaPrototype> pizzaPrototypes = new HashMap<>();

    public IPizzaPrototype createPizza(String key){
        IPizzaPrototype prototype = pizzaPrototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("Pizza type '" + key + "' not found.");
        }
        return prototype.copy();
    }

    public void addPizza(String key, IPizzaPrototype pizza){
        pizzaPrototypes.put(key, pizza);
    }
}
