package behavioral.stratery.duck_example;

public class VitGioi extends Duck {
    @Override
    public void display() {
        System.out.println("Em la vit gioi");
        performFly();
        performQuack();
        swim();
        System.out.println("Xin chao");
    }
}
