package Implementations;

import Interfaces.HTMLNode;

public class TextNode implements HTMLNode {
    private String text;

    public TextNode(String text){
        this.text = text;
    }

    @Override
    public String generateHtml(int indentLevel) {
        return " ".repeat(indentLevel) + text;
    }

    
}
