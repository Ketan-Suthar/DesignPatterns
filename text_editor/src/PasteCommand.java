public class PasteCommand extends Command {
    protected PasteCommand(final Application application, final Editor editor) {
        super(application, editor);
    }


    public boolean execute() {
        System.out.println("Executing past command, clipboard: " + application.getClipboard());
        saveBackup();
        editor.replaceSelection(application.getClipboard());
        return true;
    }
}
