public abstract class Device {

    protected boolean enabled;

    protected int channel;

    protected int volume;

    protected Device() {
        enabled = false;
        channel = 1;
        volume = 10;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void enable() {
        enabled = true;
        System.out.println("device enabled");
    }

    
    public void disable() {
        enabled = false;
        System.out.println("device disabled");
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(final int volume) {
        this.volume = volume;
        System.out.println("volume set to: " + volume);
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(final int channel) {
        this.channel = channel;
        System.out.println("channel set to: " + channel);
    }
}
