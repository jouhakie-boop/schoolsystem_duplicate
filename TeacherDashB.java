package schoolsystem.TeachersFunctions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import schoolsystem.TeacherLogIn;

public class TeacherDashB extends JFrame implements ActionListener {

    private JButton btnAttendance, btnGrades, btnBack;
    private JLabel lblTitle, lblPersonalTitle;
    private JPanel pnlPanel, pnlPersonal;

    public TeacherDashB() {

        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // BACKGROUND
        ImageIcon img = new ImageIcon("C:\\Users\\admin\\Downloads\\pup1.jpg");
        Image scaled = img.getImage().getScaledInstance(800, 750, Image.SCALE_SMOOTH);

        JLabel background = new JLabel(new ImageIcon(scaled));
        background.setLayout(null);
        setContentPane(background);

        // MAIN GLASS PANEL
        pnlPanel = new JPanel();
        pnlPanel.setLayout(null);
        pnlPanel.setBounds(120, 60, 560, 420);
        pnlPanel.setBackground(new Color(255, 255, 255, 180));

        background.add(pnlPanel);

        // TITLE
        lblTitle = new JLabel("Teacher Dashboard", SwingConstants.CENTER);
        lblTitle.setBounds(120, 20, 320, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitle.setForeground(Color.decode("#312E81"));
        pnlPanel.add(lblTitle);

        // GRADES BUTTON (big tile style)
        btnGrades = new JButton("Grades");
        btnGrades.setBounds(70, 100, 220, 40);
        btnGrades.setFont(new Font("Arial",Font.BOLD, 18));
        pnlPanel.add(btnGrades);

        // ATTENDANCE BUTTON 
        btnAttendance = new JButton("Attendance");
        btnAttendance.setBounds(310, 100, 220, 40);
        btnAttendance.setFont(new Font("Arial", Font.BOLD, 18));
        pnlPanel.add(btnAttendance);

        // PERSONAL INFO PANEL 
        pnlPersonal = new JPanel();
        pnlPersonal.setLayout(null);
        pnlPersonal.setBounds(70, 285, 420, 100);
        pnlPersonal.setBackground(new Color(240, 240, 240, 180));

        pnlPanel.add(pnlPersonal);

        // BACK BUTTON 
        btnBack = new JButton("Back");
        btnBack.setBounds(650, 620, 100, 30);
        background.add(btnBack);

        // ACTIONS
        btnGrades.addActionListener(this);
        btnAttendance.addActionListener(this);
        btnBack.addActionListener(this);
        btnGrades.setForeground(Color.decode("#1E1B4B"));
            btnGrades.setBackground(Color.decode("#BEE9FF"));
        btnAttendance.setForeground(Color.decode("#1E1B4B"));
            btnAttendance.setBackground(Color.decode("#BEE9FF"));
            btnBack.setForeground(Color.decode("#1E1B4B"));
            btnBack.setBackground(Color.decode("#BEE9FF"));
        addHoverEffect(btnGrades);
        addHoverEffect(btnAttendance);
        addHoverEffect(btnBack);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnAttendance){
            JamesEarlAttendance sma = new JamesEarlAttendance();
            sma.setVisible(true);
        }
        else if(e.getSource()==btnGrades){
           TeacherGrades tg = new TeacherGrades();
           tg.setVisible(true);
        }
        else if(e.getSource()==btnBack){
            TeacherLogIn tl = new TeacherLogIn();
            tl.setVisible(true);
        }

    }
     public void addHoverEffect(JButton button) {
    button.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            button.setFont(new Font("Arial", Font.BOLD, 21));
            button.setForeground(Color.decode("#FFFFFF"));
            button.setBackground(Color.decode("#312E81"));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.setForeground(Color.decode("#1E1B4B"));
            button.setBackground(Color.decode("#BEE9FF"));
        }
    });
        }
}



