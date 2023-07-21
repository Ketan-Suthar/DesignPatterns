public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(final Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
