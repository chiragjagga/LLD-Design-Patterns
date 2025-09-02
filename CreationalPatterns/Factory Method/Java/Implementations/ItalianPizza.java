package Implementations;

import Interfaces.IPizza;

public class ItalianPizza implements IPizza {

    @Override
    public void bake() {
        System.out.println("Baking italian pizza.");
    }

    @Override
    public void pack() {
        System.out.println("Packing italian pizza.");
    }
}
