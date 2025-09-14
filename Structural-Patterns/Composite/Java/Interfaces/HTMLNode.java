package Interfaces;

public interface HTMLNode {
    String generateHtml(int indentLevel);

    default void addChild(HTMLNode node){
        throw new UnsupportedOperationException();
    }
}
