// See https://aka.ms/new-console-template for more information
        HTMLNode body = new HTMLElement("body");

        HTMLNode h1 = new HTMLElement("h1");
        h1.AddChild(new TextNode("Composite Pattern"));
        
        HTMLNode p = new HTMLElement("p");
        p.AddChild(new TextNode("Paragraph text"));

        HTMLNode img = new HtmlVoidElement("img", "src=\"image.jpg\" alt=\"Image\"");


        body.AddChild(h1);
        body.AddChild(p);
        body.AddChild(img);

        Console.WriteLine("Generating page HTML");
        Console.WriteLine(body.GenerateHtml(0));
