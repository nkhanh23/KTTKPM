package creational.factory.pizza;

public abstract class Pizza {
    StringBuilder Builder = new StringBuilder();
    public abstract void perpare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    @Override
    public String toString() {
        return Builder.toString();
    }

    public StringBuilder getBuilder() {
        return Builder;
    }
}
