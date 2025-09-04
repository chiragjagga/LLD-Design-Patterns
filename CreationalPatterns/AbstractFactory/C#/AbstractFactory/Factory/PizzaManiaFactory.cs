public class PizzaManiaFactory : PizzaIngredientFactory {
    public Cheese createCheese() {
        return new LiquidCheese();
    }
    public Dough createDough() {
        return new FreshPanDough();
    }
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
