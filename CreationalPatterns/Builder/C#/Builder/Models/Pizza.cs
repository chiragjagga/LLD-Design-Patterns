public class Pizza {
    public string Dough { get; }
    public string Sauce { get; }
    public string Cheese { get; }
    public IReadOnlyList<string> Toppings { get; }

    private Pizza(Builder builder){
        Dough = builder.Dough;
        Sauce = builder.Sauce;
        Cheese = builder.Cheese;
        Toppings = builder.Toppings;
    }

    public override String ToString() {
        return $"Pizza with {Dough} crust, {Sauce} sauce, {Cheese} cheese, and toppings: [{string.Join(", ", Toppings)}]";
    }


    public class Builder{
        internal readonly string Dough;
        internal readonly string Sauce;
        internal string Cheese { get; private set; } = "";
        internal List<string> Toppings { get; } = new List<string>();

        public Builder(String dough, String sauce){
            this.Dough = dough;
            this.Sauce = sauce;
        }

        public Builder WithCheese(String cheese){
            this.Cheese = cheese;
            return this;
        }

        public Builder WithTopping(String topping){
            this.Toppings.Add(topping);
            return this;
        }

        public Pizza Build(){
            return new Pizza(this);
        }
    }
}
