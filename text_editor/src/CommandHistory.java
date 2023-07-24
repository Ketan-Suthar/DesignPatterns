import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> commands;

    public CommandHistory() {
        commands = new Stack<>();
    }

    public void push(final Command command) {
        System.out.println("pushing command in history");
        commands.push(command);
    }

    public Command pop() {
        System.out.println("popping command from history");
        return commands.pop();
    }
}
