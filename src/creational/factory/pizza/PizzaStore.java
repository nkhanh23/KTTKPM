package creational.factory.pizza;

public abstract class PizzaStore {
    public abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType type){
        var pizza = createPizza(type);
        pizza = createPizza(type);
        pizza.perpare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
