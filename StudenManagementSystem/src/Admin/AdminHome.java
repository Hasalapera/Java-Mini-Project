package StudenManagementSystem.src.Admin;

import javax.swing.*;

public class AdminHome extends JFrame {
    private JPanel panel1;
    private JLabel lblQRCode;

    public AdminHome() {
        setTitle("Admin Home");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Load Image (Make sure the path is correct)
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("Resources/mentor.png"));
        lblQRCode.setIcon(imageIcon);

        setContentPane(panel1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdminHome().setVisible(true));
    }
}
