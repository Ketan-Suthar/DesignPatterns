public class Driver {
    public static void main(String[] args) {
        Editor editor = new Editor("NotePad");

        System.out.println("Starting editor: " + editor.getName());
        System.out.println("Initial text: " + editor.getText());

        Application application = new Application(editor);
        var pasteCommand = new PasteCommand(application, editor);

        application.setClipboard("OneBit");
        application.executeCommand(pasteCommand);
        System.out.println("new text: " + editor.getText());

        pasteCommand = new PasteCommand(application, editor);
        application.setClipboard("Luffy is going to be the king of the pirates");
        application.executeCommand(pasteCommand);
        System.out.println("new text: " + editor.getText());

        pasteCommand = new PasteCommand(application, editor);
        application.setClipboard("Luffy is king now");
        application.executeCommand(pasteCommand);
        System.out.println("new text: " + editor.getText());

        application.undo();
        System.out.println("new text: " + editor.getText());

        application.undo();
        System.out.println("new text: " + editor.getText());
    }
}