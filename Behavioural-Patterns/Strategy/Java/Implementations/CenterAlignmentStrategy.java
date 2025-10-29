package Implementations;

import Interfaces.AlignmentStrategy;

public class CenterAlignmentStrategy implements AlignmentStrategy {

    @Override
    public void align(String text) {
        System.out.println("== Center Aligned Text ==");
        System.out.println("   " + text + "   ");
        System.out.println("-------------------------");
    }
    
}
