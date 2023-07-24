public class Editor {
    private String text;

    private final String name;

    public Editor(final String name) {
        this.name = name;
        text = "";
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSelection() {
        return text;
    }

    public void deleteSelection() {
        text = "";
    }

    public void replaceSelection(final String newText) {
        text = newText;
    }
}
