public class Driver {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.previousSong();
        player.nextSong();
        player.fastForward(4);
        player.rewind(4);
        player.clickPlay();

        player.changeState(new LockedState(player));
        player.previousSong();
        player.nextSong();
        player.fastForward(4);
        player.rewind(4);
        player.clickLock();
        player.clickPlay();

        player.getState().setEvent(new Event("doubleClick"));
        player.clickNext();

        player.getState().setEvent(new Event("singleClick"));
        player.clickNext();

        player.getState().setEvent(new Event("doubleClick"));
        player.clickPrevious();

        player.getState().setEvent(new Event("singleClick"));
        player.clickPrevious();
    }
}
