import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame {
    private JPanel MainFrame;
    private JButton profilesButton;
    private JButton coursesButton;
    private JButton noticesButton;
    private JButton timeTablesButton;

    public Admin() {
        setContentPane(MainFrame);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Admin");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        profilesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        Admin admin = new Admin();
    }
}
