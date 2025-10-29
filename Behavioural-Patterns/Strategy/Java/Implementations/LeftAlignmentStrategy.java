package Implementations;

import Interfaces.AlignmentStrategy;

public class LeftAlignmentStrategy implements AlignmentStrategy {

    @Override
    public void align(String text) {
        System.out.println("<< Left Aligned Text >>");
        System.out.println(text);
        System.out.println("------------------------");
    }
    
}
