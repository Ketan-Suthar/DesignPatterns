public class Driver {
    public static void main(String[] args) {
        var tv = new TV();
        var remote = new AdvancedRemoteControl(tv);
        System.out.println("\n---TV---\n");
        remote.togglePower();
        remote.channelUp();
        remote.channelDown();
        remote.volumeDown();
        remote.channelUp();
        remote.mute();

        var radio = new Radio();
        remote = new AdvancedRemoteControl(radio);
        System.out.println("\n---Radio---\n");
        remote.togglePower();
        remote.channelUp();
        remote.channelDown();
        remote.channelUp();
        remote.volumeDown();
        remote.mute();
    }
}
