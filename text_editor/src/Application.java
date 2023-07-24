import java.util.ArrayList;
import java.util.List;


public class Application {
    private String clipboard;

    private final List<Editor> editors;

    private final Editor activeEditor;

    private final CommandHistory commandHistory;

    public Application(final Editor activeEditor) {
        clipboard = "";
        this.activeEditor = activeEditor;
        editors = new ArrayList<>();
        editors.add(activeEditor);
        commandHistory = new CommandHistory();
    }

    public void executeCommand(final Command command) {
        if(command.execute())
            commandHistory.push(command);
    }

    public void undo() {
        final var command = commandHistory.pop();
        if(command != null)
            command.undo();
    }

    public void setClipboard(final String text) {
        clipboard = text;
    }

    public String getClipboard() {
        return clipboard;
    }
}
