public class LockedState extends State {

    public LockedState(final AudioPlayer player) {
        this.player = player;
    }

    public void clickLock() {
        if (player.isPlaying()){
            System.out.println("unlock clicked, new state Playing");
            player.changeState(new PlayingState(player));
        }
        else{
            System.out.println("unlock clicked, new state Ready");
            player.changeState(new ReadyState(player));
        }
    }

    public void clickPlay() {
        System.out.println("locked");
    }

    public void clickNext() {
        System.out.println("locked");
    }

    public void clickPrevious() {
        System.out.println("locked");
    }
}
