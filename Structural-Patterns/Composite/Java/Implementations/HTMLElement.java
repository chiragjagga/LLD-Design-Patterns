package Implementations;

import java.util.ArrayList;
import java.util.List;

import Interfaces.HTMLNode;

public class HTMLElement implements HTMLNode {

    private String tagName;
    private String attribute;
    private List<HTMLNode> children = new ArrayList<>();

    public HTMLElement(String tagName, String attribute){
        this.tagName = tagName;
        this.attribute = attribute;
    }

    public HTMLElement(String tagName){
        this(tagName, "");
    }

    @Override
    public void addChild(HTMLNode node){
        children.add(node);
    }

    @Override
    public String generateHtml(int indentLevel) {
        StringBuilder sb = new StringBuilder();

        String indent = " ".repeat(indentLevel);

        sb.append(String.format("%s<%s%s>", indent, tagName, attribute)).append("\n");

        for(HTMLNode child : children){
            sb.append(child.generateHtml(indentLevel + 1)).append("\n");
        }

        sb.append(String.format("%s</%s>", indent, tagName));

        return sb.toString();
    }
    
}
