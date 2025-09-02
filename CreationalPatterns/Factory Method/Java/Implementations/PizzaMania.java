package Implementations;

import Interfaces.IPizza;

public class PizzaMania implements IPizza {

    @Override
    public void bake() {
        System.out.println("Baking pizza mania.");
    }

    @Override
    public void pack() {
        System.out.println("Packing pizza mania.");
    }
    
}
