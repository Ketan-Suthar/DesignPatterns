public class UndoCommand extends Command {
    protected UndoCommand(final Application application, final Editor editor) {
        super(application, editor);
    }

    public boolean execute() {
        System.out.println("Undoing");
        application.undo();
        return true;
    }
}
