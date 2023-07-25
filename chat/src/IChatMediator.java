public interface IChatMediator {
    void addUser(IUser user);

    void sendMessage(String message, IUser user);
}
