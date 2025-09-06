public class MargheritaPizza : AbstractPizza {

    public MargheritaPizza(){
        this.Dough = "Hand Tossed";
        this.Sauce = "Tomato";
        this.Toppings.Add("Mozzarella Cheese");
    }

    public MargheritaPizza(MargheritaPizza source) : base(source){
    }

    public override IPizzaPrototype Copy() {
        return new MargheritaPizza(this);
    }    
}
