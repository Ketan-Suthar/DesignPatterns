public abstract class Command {
    protected Application application;

    protected Editor editor;

    protected String backup;

    protected Command(final Application application, final Editor editor) {
        this.application = application;
        this.editor = editor;
    }

    public void saveBackup() {
        backup = editor.getText();
    }

    public void undo() {
        editor.setText(backup);
    }

    abstract public boolean execute();
}
