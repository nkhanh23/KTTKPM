package structural.bridge.remote;

public class Remote {
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if(device.isEnable())
            device.disable();
        else
            device.enable();
    }

    public void volumnDown(){
        int volume = device.getVolume();
        if(device.isEnable() && volume>0){
            device.setVolume(--volume);
            System.out.println(volume);
        }
    }

    public void volumnUp(){
        int volume = device.getVolume();
        if(device.isEnable() && volume<100){
            device.setVolume(++volume);
            System.out.println(volume);
        }
    }
}
