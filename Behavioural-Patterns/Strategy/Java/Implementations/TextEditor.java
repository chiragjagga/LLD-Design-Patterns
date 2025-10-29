package Implementations;

import Interfaces.AlignmentStrategy;

public class TextEditor {
    private AlignmentStrategy alignStrategy;
    private String text;

    public TextEditor(AlignmentStrategy alignmentStrategy){
        this.alignStrategy = alignmentStrategy;
    }

    public void setAlignmentStrategy(AlignmentStrategy alignmentStrategy){
        this.alignStrategy = alignmentStrategy;
    }

    public void setText(String text){
        this.text = text;
    }

    public void publish(){
        if(text == null || text.isEmpty()){
            System.out.println("No text!");
            return;
        }
        alignStrategy.align(text);
    }
}
