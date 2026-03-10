package creational.factory.pizza;

import creational.factory.pizza.vietnam.VietNamPizzaStore;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore store = new VietNamPizzaStore();
        store.createPizza(PizzaType.PHOMAI);
        System.out.println(store.toString());
    }
}
