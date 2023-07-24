public abstract class Component implements ComponentWithContextualHelp {
    private String tooltipText;

    protected Container container;

    public void showHelp() {
        if (tooltipText != null) {
            System.out.println("ToolTip: " + tooltipText);
        }
        else
            container.showHelp();
    }

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}
