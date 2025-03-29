import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Course_Admin extends JFrame {
    private JPanel MainFrame;
    private JButton viewButton;
    private JButton createButton;
    private JButton editButton;
    private JButton deleteButton;

    public Course_Admin() {
        setContentPane(MainFrame);
        setTitle("Course Admin");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new Course_Admin();
    }
}
