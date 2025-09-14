public class TextNode : HTMLNode {
    private String text;

    public TextNode(String text){
        this.text = text;
    }

    public void AddChild(HTMLNode node)
    {
        throw new NotImplementedException();
    }

    public String GenerateHtml(int indentLevel) {
        return (new String(' ', indentLevel) + text);
    }
}
