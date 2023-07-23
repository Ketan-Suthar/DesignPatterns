public class Panel extends Container {
    private String modalHelpText;

    public void showHelp() {
        if (modalHelpText != null)
            System.out.println("Panel ToolTip: " + modalHelpText);
        else
            super.showHelp();
    }

    public String getModalHelpText() {
        return modalHelpText;
    }

    public void setModalHelpText(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }
}
