import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements IChatMediator {
    private final List<IUser> users;

    public ChatMediatorImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void addUser(final IUser user) {
        users.add(user);
    }

    @Override
    public void sendMessage(final String message, final IUser sender) {
        for (IUser receiver : users) {
            if(receiver != sender){
                receiver.receiveMessage(message);
            }
        }
    }
}
