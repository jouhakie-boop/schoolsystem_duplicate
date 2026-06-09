package schoolsystem;
import schoolsystem.StudentsData.Student3;
import schoolsystem.StudentsData.Student2;
import schoolsystem.StudentsData.Student1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentLogIn extends JFrame implements ActionListener {

    private JButton btnLogin, btnRegister, btnBack;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JLabel lblTitle, lblUser, lblPass;
    private JPanel pnlPanel;

    public StudentLogIn() {

        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

         
        ImageIcon img = new ImageIcon("C:\\Users\\admin\\Downloads\\pup1.jpg");

        Image scaled = img.getImage().getScaledInstance(800, 750, Image.SCALE_SMOOTH);

        JLabel background = new JLabel(new ImageIcon(scaled));
        background.setLayout(null);

        setContentPane(background);

         
        pnlPanel = new JPanel();
        pnlPanel.setLayout(null);
        pnlPanel.setBounds(250, 120, 300, 450);
        pnlPanel.setBackground(new Color(255, 255, 255, 180));

        background.add(pnlPanel);

         
        lblTitle = new JLabel("Student Login", SwingConstants.CENTER);
        lblTitle.setBounds(40, 40, 220, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));

        pnlPanel.add(lblTitle);

         
        lblUser = new JLabel("Student ID");
        lblUser.setBounds(40, 110, 220, 20);

        pnlPanel.add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(40, 135, 220, 35);

        pnlPanel.add(txtUser);

        lblPass = new JLabel("Password");
        lblPass.setBounds(40, 185, 220, 20);

        pnlPanel.add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(40, 210, 220, 35);

        pnlPanel.add(txtPass);

           
        btnLogin = new JButton("Login");
        btnLogin.setBounds(40, 280, 220, 40);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 16));

        pnlPanel.add(btnLogin);

        
        btnRegister = new JButton("Forgot Password");
        btnRegister.setBounds(40, 330, 220, 40);
        btnRegister.setFont(new Font("Arial", Font.BOLD, 16));

        pnlPanel.add(btnRegister);

        
        btnBack = new JButton("Back");
        btnBack.setBounds(40, 380, 220, 40);
        btnBack.setFont(new Font("Arial", Font.BOLD, 16));

        pnlPanel.add(btnBack);

        
        btnLogin.addActionListener(this);
        btnRegister.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
public void actionPerformed(ActionEvent e) {

    
    if (e.getSource() == btnLogin) {

        String username = txtUser.getText().trim();
        String password = String.valueOf(txtPass.getPassword()).trim();

        
        if (username.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter your credentials to proceed",
                    "Login Error",
                    JOptionPane.WARNING_MESSAGE
            );
        }

        
        else if (username.equals("JamesEarlAmodia")
                && password.equals("Amodia123")) {

            dispose();

            Student1 std1 = new Student1();
            std1.setVisible(true);
        }

        
        else if (username.equals("ThomasAlonde")
                && password.equals("Thomas123")) {

            dispose();

            Student2 std2 = new Student2();
            std2.setVisible(true);
        }

        
        else if (username.equals("EdwardAyson")
                && password.equals("Edward123")) {

            dispose();

            Student3 std3 = new Student3();
            std3.setVisible(true);
        }

        
        else {

            JOptionPane.showMessageDialog(
                    this,
                    "Invalid username or password",
                    "Login Failed",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    
    else if (e.getSource() == btnRegister) {

        dispose();

        StudentForgotPassword stdforg = new StudentForgotPassword();
        stdforg.setVisible(true);
    }

    
    else if (e.getSource() == btnBack) {

        dispose();

        Homepage hp = new Homepage();
        hp.setVisible(true);
    }
}
}