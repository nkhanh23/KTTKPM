package behavioral.stratery.duck_example;

public class MainDuck {
    public static void main(String[] args) {
        Duck d = new VitGioi();
        d.setFlyeBehavior(new FlyWithWings());
        d.setQuackBehavior(new SQuack());
        d.display();
    }
}
