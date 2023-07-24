public class CutCommand extends Command {
    protected CutCommand(final Application application, final Editor editor) {
        super(application, editor);
    }


    public boolean execute() {
        System.out.println("Executing Cut command");
        saveBackup();
        application.setClipboard(editor.getSelection());
        editor.deleteSelection();
        return true;
    }
}
