package structural.bridge.remote;

public class AdvanceRemote extends  Remote{
    int currentVolume;
    public AdvanceRemote(Device device) {
        super(device);
    }

    public void mute(){
        if(device.isEnable()) {
            if (device.getVolume() == 0) {
                device.setVolume(currentVolume);
                System.out.println(currentVolume);
            } else {
                currentVolume = device.getVolume();
                device.setVolume(0);
                System.out.println(device.getVolume());
            }
        }
    }

    @Override
    public void togglePower() {
        super.togglePower();
    }

    @Override
    public void volumnDown() {
        super.volumnDown();
        currentVolume = this.device.getVolume();
    }

    @Override
    public void volumnUp() {
        super.volumnUp();
        currentVolume = this.device.getVolume();

    }
}
