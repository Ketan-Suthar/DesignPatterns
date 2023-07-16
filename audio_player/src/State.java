public abstract class State {
    protected AudioPlayer player;
    protected Event event;

    public void setEvent(final Event event) {
        this.event = event;
    }

    public abstract void clickLock();
    public abstract void clickPlay();
    public abstract void clickNext();
    public abstract void clickPrevious();
}
