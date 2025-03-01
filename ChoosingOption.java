import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Choose an option", JOptionPane.YES_NO_CANCEL_OPTION);
        
        switch (option) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "You chose YES");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "You chose NO");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "You chose CANCEL");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No option selected");
                break;
        }
        
        System.exit(0);
    }
}
