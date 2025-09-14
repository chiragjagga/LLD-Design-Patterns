public class HtmlVoidElement : HTMLNode{
    private String tagName;
    private String attributes;

    public HtmlVoidElement(String tagName, String attributes){
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public void AddChild(HTMLNode node)
    {
        throw new NotImplementedException();
    }

    public String GenerateHtml(int indentLevel) {
        return String.Format("{0}<{1} {2}>", new string(' ', indentLevel), tagName, attributes);
    }
}
