public class WinCheckBox implements CheckBox {
    private Boolean checked = false;
    private String text = "";
    @Override
    public Boolean getStatus() {
        return checked;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setStatus() {
        this.checked = !this.checked;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
