public class CopyCommand extends Command {
    protected CopyCommand(final Application application, final Editor editor) {
        super(application, editor);
    }


    public boolean execute() {
        System.out.println("Copying selection: " + editor.getSelection());
        application.setClipboard(editor.getSelection());
        return false;
    }
}
