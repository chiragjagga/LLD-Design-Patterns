using System.Text;

public class HTMLElement : HTMLNode {

    private String tagName;
    private String attribute;
    private List<HTMLNode> children = new List<HTMLNode>();

    public HTMLElement(String tagName, String attribute = ""){
        this.tagName = tagName;
        this.attribute = attribute;
    }

    public void AddChild(HTMLNode node){
        children.Add(node);
    }
    
    public String GenerateHtml(int indentLevel) {
        StringBuilder sb = new StringBuilder();

        String indent = new string(' ', indentLevel);

        sb.Append(String.Format("{0}<{1}{2}>", indent, tagName, attribute));

        foreach(HTMLNode child in children) {
            sb.Append(child.GenerateHtml(indentLevel + 1));
            sb.Append("\n");
        }

        sb.Append(String.Format("{0}</{1}>", indent, tagName));

        return sb.ToString();
    }
    
}
