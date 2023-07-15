public class OffState extends RemoteController {
    @Override
    public void pressSwitch(final TV context) {
        System.out.println("Already off, going on");
        context.setState(new OnState());
    }
}
