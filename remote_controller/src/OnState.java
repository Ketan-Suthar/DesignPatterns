public class OnState extends RemoteController {
    @Override
    public void pressSwitch(final TV context) {
        System.out.println("Already on, going off");
        context.setState(new OffState());
    }
}
