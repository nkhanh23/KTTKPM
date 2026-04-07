package behavioral.observer.streamData_CA1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    private List<Listener<T>> listeners = new ArrayList<>();

    public void addListener(Listener<T> l) {
        listeners.add(l);
    }

    public void addEvent(T t) {
        for (Listener<T> listener : listeners) {
            listener.listen(t);
        }
    }
}
