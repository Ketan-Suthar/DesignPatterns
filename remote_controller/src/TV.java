public class TV {
    private RemoteController state;

    public TV() {
        state = new OffState();
    }

    public void setState(RemoteController state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressSwitch(this);
    }
}
