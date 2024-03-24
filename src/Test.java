public class Test {
    public static void main(String[] args) {
        GuiFactory winFactory = new WinFactory();
        Button winB = winFactory.createButton();
        CheckBox winCheckBox = winFactory.createCheckBox();
        winB.setLabel("piggie");
        System.out.println("win button label is " + winB.getLabel());
        winB.click();

        winCheckBox.setText("piggie");
        winCheckBox.setStatus();
        System.out.println("wincheckbox text is " + winCheckBox.getText());
        System.out.println("wincheckbox status is " + winCheckBox.getStatus());
    }
}
