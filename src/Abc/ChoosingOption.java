package Abc;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        String[] options = {"Tiếp tục", "Dừng lại"};
        int choice = JOptionPane.showOptionDialog(
            null, 
            "Bạn có muốn tiếp tục không?", 
            "Lựa chọn",
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "Bạn đã chọn Tiếp tục.");
        } else {
            JOptionPane.showMessageDialog(null, "Bạn đã chọn Dừng lại.");
        }
        System.exit(0);
    }
}