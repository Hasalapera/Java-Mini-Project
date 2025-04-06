package Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StuHome extends JFrame {
    private JPanel mainPanel;
    private JPanel headingPanel;
    private JPanel btnPanel;
    private JPanel cardMainPanel;
    private JButton profileButton;
    private JButton coursesButton;
    private JButton gradeAndGPAButton;
    private JButton attendanceButton;
    private JButton medicalButton;
    private JButton timeTableButton;
    private JTextField fNameTxt;
    private JTextField lNameTxt;
    private JTextField addressTxt;
    private JTextField emailTxt;
    private JTextField pNoTxt;
    private JTextField roleTxt;
    private JPanel imgMainPanel;
    private JPanel imgPanel;
    private JLabel roleLbl;
    private JLabel pNoLbl;
    private JLabel emailLbl;
    private JLabel addressLbl;
    private JLabel lNameLbl;
    private JLabel fNameLbl;
    private JPanel detailPanel;
    private JLabel profileHeadingLbl;
    private JPanel profileCard;
    private JLabel imageLbl;
    private JButton noticeButton;
    private JLabel stuManaSysLbl;
    private JLabel FoTLbl;
    private JPanel coursesCard;
    private JLabel CoursesHeadingLbl;
    private JComboBox comboBoxCourses;
    private JLabel selectCourseLbl;
    private JPanel displayDetailsPanel;
    private JPanel gradeGPACard;
    private JLabel gradeGPAHeadingLbl;
    private JComboBox selectCrsComboBox;
    private JTextField yourGradeTxt;
    private JTextField cgpaTxt;
    private JTextField sgpaTxt;
    private JTextArea gradetxtArea;
    private JPanel gradeTxtAreaPanel;
    private JLabel yourGradeLbl;
    private JLabel selectCrsLbl;
    private JLabel sgpaLbl;
    private JLabel cgpaLbl;
    private JButton logOutButton;
    private JPanel attendanceCard;
    private JPanel medicalCard;
    private JPanel timeTableCard;
    private JPanel noticeCard;
    private JLabel attendanceHeadingLbl;
    private JLabel medicalHeadingLbl;
    private JLabel noticeHeadingLbl;
    private JComboBox selectAttCourseCombo;
    private JComboBox selectCrsTypeCombo;
    private JLabel selectAttCourseLbl;
    private JLabel selectCrsTypeLbl;
    private JButton clearButton;
    private JButton OKButton;
    private JPanel attViewPanel;
    private JTable mediDetailsTable;
    private JPanel mediDetailsTblPanel;
    private JComboBox selectTitleCombo;
    private JLabel selectTitleLbl;
    private JLabel timeTableHeadingLbl;
    private JPanel noticeTxtAreaPanel;
    private JTextArea noticeTxtArea;
    private JPanel timeTablePanel;
    private JTable timeTableTable;
    private JTable attTable;
    private JScrollPane attScrollPane;
    private JScrollPane mediScrollPane;
    private JScrollPane noticeScrollPane;
    private JScrollPane timeTableScrollPane;
    private JButton updateProfileButton;


    public StuHome() {
//        JFrame frame = new JFrame("Student Management System - Home");
        setContentPane(mainPanel);
        setTitle("Student Home");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1024, 768);
        setVisible(true);

//        frame.add(mainPanel);
//
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);

        // Set CardLayout to cardMainPanel
//        CardLayout cardLayout = new CardLayout();
        CardLayout cardLayout = (CardLayout) (cardMainPanel.getLayout());

//        frame.add(cardMainPanel, cardLayout);
//        cardMainPanel.setLayout(cardLayout);

        // Add each card to cardMainPanel with a name
       /* cardMainPanel.add(profileCard, "profileCard");
        cardMainPanel.add(coursesCard, "coursesCard");
        cardMainPanel.add(gradeGPACard, "gradeGPACard");
        cardMainPanel.add(attendanceCard, "attendanceCard");
        cardMainPanel.add(medicalCard, "medicalCard");
        cardMainPanel.add(timeTableCard, "timeTableCard");
        cardMainPanel.add(noticeCard, "noticeCard");*/
//        cardMainPanel.add(logOutC, "logOutButton");

        // Add cardMainPanel to mainPanel
//                frame.add(cardMainPanel, cardLayout);

        // (Assuming mainPanel contains cardMainPanel and other buttons)


        // Button actions to switch cards
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hi");
                cardLayout.show(cardMainPanel, "profileCard");
            }
        });

        coursesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardMainPanel, "coursesCard");
            }
        });

        gradeAndGPAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardMainPanel, "gradeGPACard");
            }
        });

        attendanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardMainPanel, "attendanceCard");
            }
        });

        medicalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardMainPanel, "medicalCard");
            }
        });

        timeTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardMainPanel, "timeTableCard");
            }
        });

        noticeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardMainPanel, "noticeCard");
            }
        });


        updateProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdateStudentProfile();
                dispose();
            }
        });
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = ""                        ;
                new Login();
            }
        });
    }

//    public static void main(String[] args) {
//        new StuHome("user");
//    }
}
