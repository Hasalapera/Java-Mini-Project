package Technical_officer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;


public class Attendance extends JFrame {
    private JPanel mainPanel;
    private JPanel title;
    private JLabel titlelable;
    private JPanel buttonPanel;
    private JButton addButton;
    private JButton updateAttendancebutton;
    private JPanel viewPanel;

    public Attendance() {
        showAttendancetable();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        updateAttendancebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setContentPane(mainPanel);
        setTitle("Attendance");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setVisible(true);
    }

    private void showAttendancetable() {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/techlms", "root", "1234");
            Statement st = con.createStatement();
            String query = "select * from attendance";
            ResultSet rs = st.executeQuery(query);

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            Vector<String> columnNames = new Vector<String>();
            for(int i=1;i<=columnCount;i++){
                columnNames.add(rsmd.getColumnName(i));
            }

            Vector<Vector<Object>> data = new Vector<>();
            while(rs.next()){
                Vector<Object> row = new Vector<>();
                for(int i=1;i<=columnCount;i++){
                    row.add(rs.getObject(i));
                }
                data.add(row);
            }

            JTable table = new JTable(data,columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setPreferredSize(new Dimension(580,300));

            viewPanel.removeAll();
            viewPanel.setLayout(new BorderLayout());
            viewPanel.add(scrollPane,BorderLayout.CENTER);
            viewPanel.revalidate();
            viewPanel.repaint();

            rs.close();
            st.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Database error");
        }
    }

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Attendance();
            }
        });
    }


}
