package Implementations;

import Interfaces.HTMLNode;

public class HtmlVoidElement implements HTMLNode{
    private String tagName;
    private String attributes;

    public HtmlVoidElement(String tagName, String attributes){
        this.tagName = tagName;
        this.attributes = attributes;
    }

    @Override
    public String generateHtml(int indentLevel) {
        return String.format("%s<%s %s>", " ".repeat(indentLevel), tagName, attributes);
    }
}
