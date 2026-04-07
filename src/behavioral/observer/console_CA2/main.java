package behavioral.observer.console_CA2;

public class main {
    public static void main(String[] args) {
        Activity myActivity = new Activity();

        myButton btn = myActivity.getButton();

        btn.click();
        btn.click();
        btn.click();
        btn.click();
        btn.click();
        btn.click();

    }
}
