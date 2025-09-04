package Models;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String Dough;
    private String Sauce;
    private String Cheese;
    private List<String> Toppings;

    private Pizza(Builder builder){
        Dough = builder.Dough;
        Sauce = builder.Sauce;
        Cheese = builder.Cheese;
        Toppings = builder.Toppings;
    }

    @Override
    public String toString() {
        return String.format(
            "Pizza with %s crust, %s sauce, %s cheese, and toppings: %s",
            Dough, Sauce, Cheese, Toppings
        );
    }


    public static class Builder{
        private String Dough;
        private String Sauce;
        private String Cheese = "";
        private List<String> Toppings = new ArrayList<>();

        public Builder(String dough, String sauce){
            this.Dough = dough;
            this.Sauce = sauce;
        }

        public Builder withCheese(String cheese){
            this.Cheese = cheese;
            return this;
        }

        public Builder withTopping(String topping){
            this.Toppings.add(topping);
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
