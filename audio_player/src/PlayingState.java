public class PlayingState extends State {
    private Event event;

    public void setEvent(final Event event) {
        this.event = event;
    }

    public PlayingState(final AudioPlayer player) {
        this.player = player;
    }

    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    public void clickPlay() {
        player.stopPlayback();
        player.changeState(new ReadyState(player));
    }

    public void clickNext() {
        if (event.doubleClick())
            player.nextSong();
        else
            player.fastForward(5);
    }

    public void clickPrevious() {
        if (event.doubleClick())
            player.previousSong();
        else
            player.rewind(5);
    }
}
