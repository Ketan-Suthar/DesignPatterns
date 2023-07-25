import java.util.Stack;

public class Snapshot {
    private final Stack<Editor.Memento> history;

    public Snapshot() {
        history = new Stack<>();
    }

    public void save(final Editor editor) {
        history.push(editor.save());
    }

    public void restore(final Editor editor) {
        editor.restore(history.pop());
    }
}
