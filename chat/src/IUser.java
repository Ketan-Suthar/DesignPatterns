public abstract class IUser {
    protected IChatMediator chatMediator;
    protected String name;

    public IUser(final String name, final IChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);
}
