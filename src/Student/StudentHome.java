package Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentHome {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JPanel mainPanel;
    private JButton logOutButton;
    private JButton profileButton;
    private JButton coursesDetailsButton;
    private JButton attendanceDetailsButton;
    private JButton medicalDetailsButton;
    private JButton noticesButton;
    private JButton timeTableButton;
    private JButton editProfileButton;
    private JLabel SMSLbl;
    private JLabel FoTLbl;
    private JPanel buttonPanel;
    private JPanel horizontalPanel;

    public StudentHome() {
        //Coding Original
        frame = new JFrame("Student Management System - Home");
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);



        frame.setVisible(true);
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}