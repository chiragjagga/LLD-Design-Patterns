package Implementations;

import Interfaces.AlignmentStrategy;

public class RightAlignmentStrategy implements AlignmentStrategy {

    @Override
    public void align(String text) {
        System.out.println(">> Right Aligned Text >>");
        System.out.println("        " + text);
        System.out.println("------------------------");
    }
    
}
