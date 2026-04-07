package behavioral.observer.console_CA2;

public class Activity implements ButtonListener{

    private int count;
    private myButton button;

    public Activity() {
        this.count = 0;
        this.button = new myButton();

        this.button.addListener(this);
    }

    public myButton getButton() {
        return button;
    }

    @Override
    public void onClick() {
        count++;
        System.out.println("Bạn click lần thứ " + count);
    }
}
