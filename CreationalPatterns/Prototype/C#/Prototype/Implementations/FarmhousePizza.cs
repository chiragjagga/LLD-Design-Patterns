public class FarmhousePizza : AbstractPizza {

    public FarmhousePizza(){
        this.Dough = "Fresh Pan";
        this.Sauce = "Tomato";
        this.Toppings.Add("Mushroom");
        this.Toppings.Add("Capsicum");
        this.Toppings.Add("Onion");
        this.Toppings.Add("Tomato");
    }

    public FarmhousePizza(FarmhousePizza source) : base(source){
    }

    public override IPizzaPrototype Copy() {
        return new FarmhousePizza(this);
    }    
}
