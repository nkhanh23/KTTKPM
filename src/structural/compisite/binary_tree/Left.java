package structural.compisite.binary_tree;

public class Left extends BinaryTreeComponent{
    public Left(int value) {
        super(value);
    }

    @Override
    public void NLR() {
        System.out.println(value);
    }

    @Override
    public void addLeft(BinaryTreeComponent c) {

    }

    @Override
    public void addRight(BinaryTreeComponent c) {

    }

    @Override
    public void addRemove(BinaryTreeComponent c) {

    }
}
