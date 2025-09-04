public class NewYorkPizzaFactory : PizzaIngredientFactory{
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    
    public Dough createDough() {
    return new ThinCrustDough();
}

    public Sauce createSauce() {
        return new KoreanSauce();
    }
}
