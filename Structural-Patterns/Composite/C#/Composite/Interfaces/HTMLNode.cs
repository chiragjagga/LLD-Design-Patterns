public interface HTMLNode
{
    String GenerateHtml(int indentLevel);

    void AddChild(HTMLNode node);
}
