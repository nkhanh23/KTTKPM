package structural.bridge.remote;

public class Radio implements Device {
    boolean state = false;
    int volumn = 0;
    @Override
    public boolean isEnable() {
        return state;

    }

    @Override
    public void enable() {
        state = true;
        System.out.println("Mo Radio");
    }

    @Override
    public void disable() {
        state = false;
        System.out.println("Tat Radio");
    }

    @Override
    public int getVolume() {
        return volumn;
    }

    @Override
    public void setVolume(int percent) {
        volumn = percent;
    }
}
