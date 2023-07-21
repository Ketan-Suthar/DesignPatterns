public abstract class RemoteControl {
    protected Device device;

    protected RemoteControl(final Device device) {
        this.device = device;
    }

    protected void togglePower() {
        if (device.isEnabled())
            device.disable();
        else
            device.enable();
    }

    protected void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    protected void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    protected void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    protected void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
