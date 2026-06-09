package schoolsystem.TeachersFunctions;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class TeacherGrades extends JFrame implements ActionListener {

    private JButton btnback, btnOOP, btnInteg, btnCP, btnNetAd, btnOS, btnSubmit, btnSubmit2, btnSubmit3, btnSubmit4, btnSubmit5;
    private JButton btnUpdate, btnUpdate2, btnUpdate3, btnUpdate4, btnUpdate5, btnDelete, btnDelete2,btnDelete3,btnDelete4, btnDelete5;
    private JPanel pnlSideBar, pnlMain;
    private CardLayout cardLayout;
    
// OOP
private JTextField[] oopName = new JTextField[10];
private JTextField[][] oopWeek = new JTextField[10][5];
// INTEG
private JTextField[] integName = new JTextField[10];
private JTextField[][] integWeek = new JTextField[10][5];

// CP

private JTextField[] cpName = new JTextField[10];
private JTextField[][] cpWeek = new JTextField[10][5];
// NET

private JTextField[] netName = new JTextField[10];
private JTextField[][] netWeek = new JTextField[10][5];

// OS

private JTextField[] osName = new JTextField[10];
private JTextField[][] osWeek = new JTextField[10][5];

    public TeacherGrades() {

        setSize(1000, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);

        // ================= SIDEBAR =================
        pnlSideBar = new JPanel();
        pnlSideBar.setLayout(null);
        pnlSideBar.setBounds(0, 0, 180, 750);
        pnlSideBar.setBackground(Color.decode("#c0c0c0"));
        add(pnlSideBar);

        JLabel lblMenu = new JLabel("Subject");
        lblMenu.setBounds(20, 40, 150, 30);
        pnlSideBar.add(lblMenu);

        btnOOP = createSideButton("OOP", 120);
        btnInteg = createSideButton("Integrative", 170);
        btnCP = createSideButton("Programming", 220);
        btnNetAd = createSideButton("Network", 270);
        btnOS = createSideButton("Operating Sys", 320);

        pnlSideBar.add(btnOOP);
        pnlSideBar.add(btnInteg);
        pnlSideBar.add(btnCP);
        pnlSideBar.add(btnNetAd);
        pnlSideBar.add(btnOS);

        // ================= MAIN PANEL =================
        cardLayout = new CardLayout();
        pnlMain = new JPanel(cardLayout);
        pnlMain.setBounds(200, 0, 800, 550);

        pnlMain.add(createOOPPanel(), "OOP");
        pnlMain.add(createIntegPanel(), "INTEG");
        pnlMain.add(createCompPanel(), "CP");
        pnlMain.add(createNetAdPanel(), "NET");
        pnlMain.add(createOSPanel(), "OS");

        add(pnlMain);

        // ================= BUTTONS =================
        btnback = new JButton("Back");
        btnback.setBounds(650, 620, 100, 30);
        add(btnback);

        

        // ================= ACTIONS =================
        btnOOP.addActionListener(this);
        btnInteg.addActionListener(this);
        btnCP.addActionListener(this);
        btnNetAd.addActionListener(this);
        btnOS.addActionListener(this);
        btnback.addActionListener(this);

        cardLayout.show(pnlMain, "OOP");      

    }

    // ================= OOP PANEL (WITH DEFAULT "PRESENT") =================
   private JPanel createOOPPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    JLabel title = new JLabel("OOP Grades", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);
    
  

     panel.add(createLabel("Name", 80, 100));
    panel.add(createLabel("Quiz", 185, 100));
    panel.add(createLabel("Exam", 265, 100));
    panel.add(createLabel("Projects", 345, 100));
    panel.add(createLabel("Grades", 425, 100));

    int yStart = 120;

for (int i = 0; i < 10; i++) {

    int y = yStart + (i * 35);

    JTextField name = addField(panel, "", 80, y, 100, 30);
    JTextField w1 = addField(panel, "", 200, y, 70, 30);
    JTextField w2 = addField(panel, "", 280, y, 70, 30);
    JTextField w3 = addField(panel, "", 360, y, 70, 30);
    JTextField w4 = addField(panel, "", 440, y, 70, 30);
}

    btnSubmit = new JButton("Submit");
    btnSubmit.setBounds(140, 500, 120, 30);
    panel.add(btnSubmit);
    btnSubmit.addActionListener(this);
    
    btnUpdate = new JButton("Update");
    btnUpdate.setBounds(265, 500, 120, 30);
    panel.add(btnUpdate);
    btnUpdate.addActionListener(this);
    
    btnDelete = new JButton("Delete");
    btnDelete.setBounds(390, 500, 120, 30);
    panel.add(btnDelete);
    btnDelete.addActionListener(this);

    return panel;
}


    private JLabel createLabel(String text, int x, int y) {
    JLabel lbl = new JLabel(text, SwingConstants.CENTER);
    lbl.setBounds(x, y, 100, 20);
    lbl.setFont(new Font("Arial", Font.BOLD, 12));
    return lbl;
}
  private JPanel createIntegPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    JLabel title = new JLabel("Intergrative Grades", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);

     panel.add(createLabel("Name", 80, 100));
    panel.add(createLabel("Quiz", 185, 100));
    panel.add(createLabel("Exam", 265, 100));
    panel.add(createLabel("Projects", 345, 100));
    panel.add(createLabel("Grades", 425, 100));

    int yStart = 120;

for (int i = 0; i < 10; i++) {

    int y = yStart + (i * 35);

    JTextField name = addField(panel, "", 80, y, 100, 30);
    JTextField w1 = addField(panel, "", 200, y, 70, 30);
    JTextField w2 = addField(panel, "", 280, y, 70, 30);
    JTextField w3 = addField(panel, "", 360, y, 70, 30);
    JTextField w4 = addField(panel, "", 440, y, 70, 30);
}

 
    btnSubmit2 = new JButton("Submit");
    btnSubmit2.setBounds(140, 500, 120, 30);
    panel.add(btnSubmit2);
    btnSubmit2.addActionListener(this);
    
    
    btnUpdate2 = new JButton("Update");
    btnUpdate2.setBounds(265, 500, 120, 30);
    panel.add(btnUpdate2);
    btnUpdate2.addActionListener(this);

    btnDelete2 = new JButton("Delete");
    btnDelete2.setBounds(390, 500, 120, 30);
    panel.add(btnDelete2);
    btnDelete2.addActionListener(this);


    return panel;
}
    private JPanel createCompPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    JLabel title = new JLabel("Computer Programming Grades", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);

     panel.add(createLabel("Name", 80, 100));
    panel.add(createLabel("Quiz", 185, 100));
    panel.add(createLabel("Exam", 265, 100));
    panel.add(createLabel("Projects", 345, 100));
    panel.add(createLabel("Grades", 425, 100));

    int yStart = 120;

for (int i = 0; i < 10; i++) {

    int y = yStart + (i * 35);

    JTextField name = addField(panel, "", 80, y, 100, 30);
    JTextField w1 = addField(panel, "", 200, y, 70, 30);
    JTextField w2 = addField(panel, "", 280, y, 70, 30);
    JTextField w3 = addField(panel, "", 360, y, 70, 30);
    JTextField w4 = addField(panel, "", 440, y, 70, 30);
   
}

   
    
    btnSubmit3 = new JButton("Submit");
    btnSubmit3.setBounds(140, 500, 120, 30);
    panel.add(btnSubmit3);
    btnSubmit3.addActionListener(this);
    
    btnUpdate3 = new JButton("Update");
    btnUpdate3.setBounds(265, 500, 120, 30);
    panel.add(btnUpdate3);
    btnUpdate3.addActionListener(this);

    btnDelete3 = new JButton("Delete");
    btnDelete3.setBounds(390, 500, 120, 30);
    panel.add(btnDelete3);
    btnDelete3.addActionListener(this);

    return panel;
}


 private JPanel createNetAdPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    JLabel title = new JLabel("Network Administration Grades", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);

    panel.add(createLabel("Name", 80, 100));
    panel.add(createLabel("Quiz", 185, 100));
    panel.add(createLabel("Exam", 265, 100));
    panel.add(createLabel("Projects", 345, 100));
    panel.add(createLabel("Grades", 425, 100));  
    int yStart = 120;

for (int i = 0; i < 10; i++) {

    int y = yStart + (i * 35);

    JTextField name = addField(panel, "", 80, y, 100, 30);
    JTextField w1 = addField(panel, "", 200, y, 70, 30);
    JTextField w2 = addField(panel, "", 280, y, 70, 30);
    JTextField w3 = addField(panel, "", 360, y, 70, 30);
    JTextField w4 = addField(panel, "", 440, y, 70, 30);
   
}

    btnSubmit4 = new JButton("Submit");
    btnSubmit4.setBounds(140, 500, 120, 30);
    panel.add(btnSubmit4);
    btnSubmit4.addActionListener(this);
    
    btnUpdate4 = new JButton("Update");
    btnUpdate4.setBounds(265, 500, 120, 30);
    panel.add(btnUpdate4);
    btnUpdate4.addActionListener(this);

    btnDelete4 = new JButton("Delete");
    btnDelete4.setBounds(390, 500, 120, 30);
    panel.add(btnDelete4);
    btnDelete4.addActionListener(this);

    return panel;
}
 private JPanel createOSPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    JLabel title = new JLabel("Operating System Grades", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);

  panel.add(createLabel("Name", 80, 100));
    panel.add(createLabel("Quiz", 185, 100));
    panel.add(createLabel("Exam", 265, 100));
    panel.add(createLabel("Projects", 345, 100));
    panel.add(createLabel("Grades", 425, 100));
    int yStart = 120;

for (int i = 0; i < 10; i++) {

    int y = yStart + (i * 35);

    JTextField name = addField(panel, "", 80, y, 100, 30);
    JTextField w1 = addField(panel, "", 200, y, 70, 30);
    JTextField w2 = addField(panel, "", 280, y, 70, 30);
    JTextField w3 = addField(panel, "", 360, y, 70, 30);
    JTextField w4 = addField(panel, "", 440, y, 70, 30);
 
}

    btnSubmit5 = new JButton("Submit");
    btnSubmit5.setBounds(140, 500, 120, 30);
    panel.add(btnSubmit5);
    btnSubmit5.addActionListener(this);
    
    btnUpdate5 = new JButton("Update");
    btnUpdate5.setBounds(265, 500, 120, 30);
    panel.add(btnUpdate5);
    btnUpdate5.addActionListener(this);

    btnDelete5 = new JButton("Delete");
    btnDelete5.setBounds(390, 500, 120, 30);
    panel.add(btnDelete5);
    btnDelete5.addActionListener(this);

    return panel;
}
     
    
    
    

    // ================= SUBMIT =================
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnback) {
            setVisible(false);
            new TeacherDashB().setVisible(true);
        }

else if (e.getSource() == btnSubmit) {

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql = "INSERT INTO oopattendance (name, week1, week2, week3,week4,week5) VALUES (?,?,?,?,?,?)";

        PreparedStatement pst = conn.prepareStatement(sql);

       for (int i = 0; i < 10; i++) {

    if (oopName[i].getText().trim().isEmpty()) {
        continue;
    }

    pst.setString(1, oopName[i].getText());
    pst.setString(2, oopWeek[i][0].getText());
    pst.setString(3, oopWeek[i][1].getText());
    pst.setString(4, oopWeek[i][2].getText());
    pst.setString(5, oopWeek[i][3].getText());
    pst.setString(6, oopWeek[i][4].getText());

    pst.executeUpdate();
}

       

        JOptionPane.showMessageDialog(this,
                "OOP Grades saved successfully!");

        pst.close();
        conn.close();

    } catch (Exception ex) {
    JOptionPane.showMessageDialog(
        this,
        "Unable to save attendance. Please check the fields and try again.",
        "Save Error",
        JOptionPane.ERROR_MESSAGE
    );

    ex.printStackTrace();
}
}
else if (e.getSource() == btnSubmit2) {

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql = "INSERT INTO integpattendance (name, week1, week2, week3,week4,week5) VALUES (?,?,?,?,?,?)";

        PreparedStatement pst = conn.prepareStatement(sql);

       for (int i = 0; i < 10; i++) {

    if (integName[i].getText().trim().isEmpty()) {
        continue;
    }

    pst.setString(1, integName[i].getText());
    pst.setString(2, integWeek[i][0].getText());
    pst.setString(3, integWeek[i][1].getText());
    pst.setString(4, integWeek[i][2].getText());
    pst.setString(5, integWeek[i][3].getText());
    pst.setString(6, integWeek[i][4].getText());

    pst.executeUpdate();
}

     

        JOptionPane.showMessageDialog(this,
                "Integrative Grades saved successfully!");

        pst.close();
        conn.close();

    } catch (Exception ex) {
    JOptionPane.showMessageDialog(
        this,
        "Unable to save attendance. Please check the fields and try again.",
        "Save Error",
        JOptionPane.ERROR_MESSAGE
    );

    ex.printStackTrace();
}
}
         else if (e.getSource() == btnSubmit3) {

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql = "INSERT INTO cpattendance (name, week1, week2,week3,week4,week5) VALUES (?,?,?,?,?,?)";

        PreparedStatement pst = conn.prepareStatement(sql);

         for (int i = 0; i < 10; i++) {

    if (cpName[i].getText().trim().isEmpty()) {
        continue;
    }

    pst.setString(1, cpName[i].getText());
    pst.setString(2, cpWeek[i][0].getText());
    pst.setString(3, cpWeek[i][1].getText());
    pst.setString(4, cpWeek[i][2].getText());
    pst.setString(5, cpWeek[i][3].getText());
    pst.setString(6, cpWeek[i][4].getText());

    pst.executeUpdate();
}

      

        JOptionPane.showMessageDialog(this,
                "OOP Grades saved successfully!");

        pst.close();
        conn.close();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
}
        
else if (e.getSource() == btnSubmit4) {

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql = "INSERT INTO netattendance (name, week1, week2,week3,week4,week5) VALUES (?,?,?,?,?,?)";

        PreparedStatement pst = conn.prepareStatement(sql);

         for (int i = 0; i < 10; i++) {

    if (netName[i].getText().trim().isEmpty()) {
        continue;
    }

    pst.setString(1, netName[i].getText());
    pst.setString(2, netWeek[i][0].getText());
    pst.setString(3, netWeek[i][1].getText());
    pst.setString(4, netWeek[i][2].getText());
    pst.setString(5, netWeek[i][3].getText());
    pst.setString(6, netWeek[i][4].getText());

    pst.executeUpdate();
}

     

        JOptionPane.showMessageDialog(this,
                "OOP Grades saved successfully!");

        pst.close();
        conn.close();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
}
          else if (e.getSource() == btnSubmit5) {

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql = "INSERT INTO osattendance (name, week1, week2,week3,week4,week5) VALUES (?,?,?,?,?,?)";

        PreparedStatement pst = conn.prepareStatement(sql);

         for (int i = 0; i < 10; i++) {

    if (osName[i].getText().trim().isEmpty()) {
        continue;
    }

    pst.setString(1, osName[i].getText());
    pst.setString(2, osWeek[i][0].getText());
    pst.setString(3, osWeek[i][1].getText());
    pst.setString(4, osWeek[i][2].getText());
    pst.setString(5, osWeek[i][3].getText());
    pst.setString(6, osWeek[i][4].getText());

    pst.executeUpdate();
}

     

        JOptionPane.showMessageDialog(this,
                "OOP Grades saved successfully!");

        pst.close();
        conn.close();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
}

        else if (e.getSource() == btnOOP) {
            cardLayout.show(pnlMain, "OOP");
        }
        else if (e.getSource() == btnInteg) {
            cardLayout.show(pnlMain, "INTEG");
        }
        else if (e.getSource() == btnCP) {
            cardLayout.show(pnlMain, "CP");
        }
        else if (e.getSource() == btnNetAd) {
            cardLayout.show(pnlMain, "NET");
        }
        else if (e.getSource() == btnOS) {
            cardLayout.show(pnlMain, "OS");
        }
        
       else if (e.getSource() == btnUpdate) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql =
            "UPDATE oopattendance SET week1=?, week2=?, week3=?, week4=?, week5=? WHERE name=?";

        PreparedStatement pst = conn.prepareStatement(sql);

        int updatedCount = 0;

        for (int i = 0; i < 10; i++) {

            // Skip empty name rows
            if (oopName[i].getText().trim().isEmpty()) {
                continue;
            }

            pst.setString(1, oopWeek[i][0].getText());
            pst.setString(2, oopWeek[i][1].getText());
            pst.setString(3, oopWeek[i][2].getText());
            pst.setString(4, oopWeek[i][3].getText());
            pst.setString(5, oopWeek[i][4].getText());
            pst.setString(6, oopName[i].getText());

            updatedCount += pst.executeUpdate();
        }

        if (updatedCount > 0) {
            JOptionPane.showMessageDialog(
                this,
                " Record(s) updated successfully!"
            );
        } else {
            JOptionPane.showMessageDialog(
                this,
                "No matching records were found.",
                "Update Failed",
                JOptionPane.WARNING_MESSAGE
            );
        }

        pst.close();
        conn.close();

    } catch (Exception ex) {

        JOptionPane.showMessageDialog(
            this,
            "Unable to update attendance.",
            "Update Error",
            JOptionPane.ERROR_MESSAGE
        );

        ex.printStackTrace();
    }
}
             else if (e.getSource() == btnUpdate2) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql =
            "UPDATE integattendance SET week1=?, week2=?, week3=?, week4=?, week5=? WHERE name=?";

        PreparedStatement pst = conn.prepareStatement(sql);

        int updatedCount = 0;

        for (int i = 0; i < 10; i++) {

            if (integName[i].getText().trim().isEmpty()) {
                continue;
            }

            pst.setString(1, integWeek[i][0].getText());
            pst.setString(2, integWeek[i][1].getText());
            pst.setString(3, integWeek[i][2].getText());
            pst.setString(4, integWeek[i][3].getText());
            pst.setString(5, integWeek[i][4].getText());
            pst.setString(6, integName[i].getText());

            updatedCount += pst.executeUpdate();
        }

        if (updatedCount > 0) {
            JOptionPane.showMessageDialog(
                this,
                updatedCount + " record(s) updated successfully!"
            );
        } else {
            JOptionPane.showMessageDialog(
                this,
                "No matching records were found.",
                "Update Failed",
                JOptionPane.WARNING_MESSAGE
            );
        }

        pst.close();
        conn.close();

    } catch (Exception ex) {

        JOptionPane.showMessageDialog(
            this,
            "Unable to update attendance.",
            "Update Error",
            JOptionPane.ERROR_MESSAGE
        );

        ex.printStackTrace();
    }
}
        else if (e.getSource() == btnUpdate3) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql =
            "UPDATE cpattendance SET week1=?, week2=?, week3=?, week4=?, week5=? WHERE name=?";

        PreparedStatement pst = conn.prepareStatement(sql);

        int updatedCount = 0;

        for (int i = 0; i < 10; i++) {

            // Skip empty name rows
            if (cpName[i].getText().trim().isEmpty()) {
                continue;
            }

            pst.setString(1, cpWeek[i][0].getText());
            pst.setString(2, cpWeek[i][1].getText());
            pst.setString(3, cpWeek[i][2].getText());
            pst.setString(4, cpWeek[i][3].getText());
            pst.setString(5, cpWeek[i][4].getText());
            pst.setString(6, cpName[i].getText());

            updatedCount += pst.executeUpdate();
        }

        if (updatedCount > 0) {
            JOptionPane.showMessageDialog(
                this,
                " Record(s) updated successfully!"
            );
        } else {
            JOptionPane.showMessageDialog(
                this,
                "No matching records were found.",
                "Update Failed",
                JOptionPane.WARNING_MESSAGE
            );
        }

        pst.close();
        conn.close();

    } catch (Exception ex) {

        JOptionPane.showMessageDialog(
            this,
            "Unable to update attendance.",
            "Update Error",
            JOptionPane.ERROR_MESSAGE
        );

        ex.printStackTrace();
    }
}
          else if (e.getSource() == btnUpdate4) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql =
            "UPDATE netattendance SET week1=?, week2=?, week3=?, week4=?, week5=? WHERE name=?";

        PreparedStatement pst = conn.prepareStatement(sql);

        int updatedCount = 0;

        for (int i = 0; i < 10; i++) {

            // Skip empty name rows
            if (netName[i].getText().trim().isEmpty()) {
                continue;
            }

            pst.setString(1, netWeek[i][0].getText());
            pst.setString(2, netWeek[i][1].getText());
            pst.setString(3, netWeek[i][2].getText());
            pst.setString(4, netWeek[i][3].getText());
            pst.setString(5, netWeek[i][4].getText());
            pst.setString(6, netName[i].getText());

            updatedCount += pst.executeUpdate();
        }

        if (updatedCount > 0) {
            JOptionPane.showMessageDialog(
                this,
                " Record(s) updated successfully!"
            );
        } else {
            JOptionPane.showMessageDialog(
                this,
                "No matching records were found.",
                "Update Failed",
                JOptionPane.WARNING_MESSAGE
            );
        }

        pst.close();
        conn.close();

    } catch (Exception ex) {

        JOptionPane.showMessageDialog(
            this,
            "Unable to update attendance.",
            "Update Error",
            JOptionPane.ERROR_MESSAGE
        );

        ex.printStackTrace();
    }
}

          else if (e.getSource() == btnUpdate5) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolsystemdb",
                "root",
                ""
        );

        String sql =
            "UPDATE osattendance SET week1=?, week2=?, week3=?, week4=?, week5=? WHERE name=?";

        PreparedStatement pst = conn.prepareStatement(sql);

        int updatedCount = 0;

        for (int i = 0; i < 10; i++) {

            // Skip empty name rows
            if (netName[i].getText().trim().isEmpty()) {
                continue;
            }

            pst.setString(1, osWeek[i][0].getText());
            pst.setString(2, osWeek[i][1].getText());
            pst.setString(3, osWeek[i][2].getText());
            pst.setString(4, osWeek[i][3].getText());
            pst.setString(5, osWeek[i][4].getText());
            pst.setString(6, osName[i].getText());

            updatedCount += pst.executeUpdate();
        }

        if (updatedCount > 0) {
            JOptionPane.showMessageDialog(
                this,
                " Record(s) updated successfully!"
            );
        } else {
            JOptionPane.showMessageDialog(
                this,
                "No matching records were found.",
                "Update Failed",
                JOptionPane.WARNING_MESSAGE
            );
        }

        pst.close();
        conn.close();

    } catch (Exception ex) {

        JOptionPane.showMessageDialog(
            this,
            "Unable to update attendance.",
            "Update Error",
            JOptionPane.ERROR_MESSAGE
        );

        ex.printStackTrace();
    }
}
    }
    
    
    private JTextField addField(JPanel panel, String text, int x, int y, int w, int h) {
        JTextField txt = new JTextField(text);
        txt.setBounds(x, y, w, h);
        panel.add(txt);
        return txt;
    }

    private JButton createSideButton(String text, int y) {
        JButton btn = new JButton(text);
        btn.setBounds(10, y, 160, 35);
        return btn;
    }

   
   
}