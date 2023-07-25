public class User extends IUser {
    public User(final String name, final IChatMediator chatMediator) {
        super(name, chatMediator);
    }

    @Override
    public void sendMessage(final String message) {
        System.out.println(name + " is sending: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(final String message) {
        System.out.println(name + " has received: " + message);
    }
}
