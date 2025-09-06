public abstract class AbstractPizza : IPizzaPrototype
{
    public String? Dough { get; set; }
    public String? Sauce { get; set; }
    public List<String> Toppings { get; set; }

    public AbstractPizza()
    {
        this.Toppings = new List<string>();
    }

    protected AbstractPizza(AbstractPizza source)
    {
        this.Dough = source.Dough;
        this.Sauce = source.Sauce;
        this.Toppings = new List<string>(source.Toppings);
    }

    public void SetDough(String dough) { this.Dough = dough; }
    public void SetSauce(String sauce) { this.Sauce = sauce; }
    public void AddTopping(String topping) { this.Toppings.Add(topping); }

    public override String ToString()
    {
        return "Pizza with " + Dough + " dough, " + Sauce + " sauce, and toppings: " + Toppings;
    }
    
    public abstract IPizzaPrototype Copy();
}
