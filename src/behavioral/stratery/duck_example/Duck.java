package behavioral.stratery.duck_example;

public abstract class Duck {
    IFlyBehavior flyeBehavior;
    IQuackBehavior quackBehavior;
    public abstract void display();

    public void swim(){
        System.out.println("Vo dich Olympic boi buom");
    }

    public void performFly(){
        System.out.println(flyeBehavior.fly());
    }

    public void performQuack(){
        System.out.println(quackBehavior.quack());
    }

    public void setFlyeBehavior(IFlyBehavior flyeBehavior) {
        this.flyeBehavior = flyeBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public IFlyBehavior getFlyeBehavior() {
        return flyeBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }
}
