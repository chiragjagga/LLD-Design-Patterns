public class Pizza : AbstractPizza {
    public Pizza() : base(){}
    public Pizza(Pizza source) : base(source){}
    public override IPizzaPrototype Copy() {
        return new Pizza(this);
    }
    
}
