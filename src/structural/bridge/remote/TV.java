package structural.bridge.remote;

public class TV implements Device{

    boolean state = false;
    int volumn = 0;
    @Override
    public boolean isEnable() {
        return state;
    }

    @Override
    public void enable() {
        state = true;
        System.out.println("Mo TV");
    }

    @Override
    public void disable() {
        state = false;
        System.out.println("Tat TV");
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
