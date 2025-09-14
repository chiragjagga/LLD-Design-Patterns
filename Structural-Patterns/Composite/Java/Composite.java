import Implementations.HTMLElement;
import Implementations.HtmlVoidElement;
import Implementations.TextNode;
import Interfaces.HTMLNode;

public class Composite {
    public static void main(String[] args) {
        HTMLNode body = new HTMLElement("body");

        HTMLNode h1 = new HTMLElement("h1");
        h1.addChild(new TextNode("Composite Pattern"));
        
        HTMLNode p = new HTMLElement("p");
        p.addChild(new TextNode("Paragraph text"));

        HTMLNode img = new HtmlVoidElement("img", "src=\"image.jpg\" alt=\"Image\"");


        body.addChild(h1);
        body.addChild(p);
        body.addChild(img);

        System.out.println("Generating page HTML");
        System.out.println(body.generateHtml(0));
    }
}
