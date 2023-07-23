public class Dialog extends Container {
    private String dialogHelpText;

    public void showHelp() {
        if (dialogHelpText != null)
            System.out.println("Dialog ToolTip: " + dialogHelpText);
        else
            super.showHelp();
    }

    public String getDialogHelpText() {
        return dialogHelpText;
    }

    public void setDialogHelpText(String dialogHelpText) {
        this.dialogHelpText = dialogHelpText;
    }
}
