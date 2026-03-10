package structural.compisite.binary_tree;

public abstract class BinaryTreeComponent {
    int value;

    public BinaryTreeComponent(int value) {
        this.value = value;
    }

    public abstract void NLR();
    public abstract void addLeft(BinaryTreeComponent c);
    public abstract void addRight(BinaryTreeComponent c);
    public abstract void addRemove(BinaryTreeComponent c);

}
