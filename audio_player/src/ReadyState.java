public class ReadyState extends State {

    public ReadyState(final AudioPlayer player) {
        this.player = player;
    }

    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    public void clickPlay() {
        player.startPlayback();
        player.changeState(new PlayingState(player));
    }

    public void clickNext() {
        player.nextSong();
    }

    public void clickPrevious() {
        player.previousSong();
    }
}
