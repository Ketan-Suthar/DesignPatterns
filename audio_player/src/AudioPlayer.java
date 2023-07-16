public class AudioPlayer {
    private State state;

    public AudioPlayer() {
        this.state = new ReadyState(this);
    }

    public boolean isPlaying() {
        return state instanceof PlayingState;
    }

    public State getState() {
        return state;
    }

    public void changeState(final State state) {
        this.state = state;
    }

    public void clickLock(){
        state.clickLock();
    }

    public void clickPlay(){
        state.clickPlay();
    }

    public void clickNext(){
        state.clickNext();
    }

    public void clickPrevious(){
        state.clickPrevious();
    }

    // A state may call some service methods on the context.
    public void startPlayback() {
        System.out.println("playing song");
    }

    public void stopPlayback() {
        System.out.println("stopped playing");
    }

    public void nextSong() {
        System.out.println("next song");
    }

    public void previousSong() {
        System.out.println("previous song");
    }

    public void fastForward(final int time) {
        System.out.println("forwarding " + time + " seconds");
    }

    public void rewind(final int time) {
        System.out.println("rewinding " + time + " seconds");
    }
}
