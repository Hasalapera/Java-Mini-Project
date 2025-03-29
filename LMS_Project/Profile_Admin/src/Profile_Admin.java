import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile_Admin extends JFrame {
    private JButton button1;
    private JPanel MainFrame;
    private JButton createButton;
    private JButton editButton;
    private JButton deleteButton;

    public Profile_Admin() {
        setContentPane(MainFrame);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Profile Admin");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        new Profile_Admin();
    }
}
