public class WinButton implements Button {
    private String label = "";

    @Override
    public void setLabel(String name) {
        this.label = name;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public void click() {
        System.out.println("win button clicked");
    }
}
