public class Driver {
    public static void main(String[] args) {
        final var dialog = new Dialog();
        dialog.setDialogHelpText("http://...");

        final var panel = new Panel();
        panel.setModalHelpText("This panel does...");

        final var ok = new Button();
        ok.setTooltipText("This is an OK button that...");

        final var cancel = new Button();

        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);

        panel.showHelp();
        dialog.showHelp();
    }
}