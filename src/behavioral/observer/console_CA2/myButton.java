package behavioral.observer.console_CA2;

import java.util.ArrayList;
import java.util.List;

public class myButton {
    private List<ButtonListener> listeners = new ArrayList<>();

    public void addListener(ButtonListener listener) {
        listeners.add(listener);
    }

    public void click() {
        for (ButtonListener listener : listeners) {
            listener.onClick();
        }
    }
}
