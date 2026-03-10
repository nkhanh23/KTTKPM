package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class HaiSanPizza extends Pizza {
    @Override
    public void perpare() {
        System.out.println("Dang chuan bi Pizza hai san...");
    }

    @Override
    public void bake() {
        System.out.println("Dang nuong Pizza hai san...");
    }

    @Override
    public void cut() {
        System.out.println("Dang cat banh Pizza hai san...");
    }

    @Override
    public void box() {
        System.out.println("Dang dong hop Pizza hai san...");
    }
}
