package user_interface;

import workDB.DB;
import workDB.WorkDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class StartFrame extends JFrame {

    private JPanel panel;
    private JLabel lurl, lnameDB, llogin, lpass;
    private JTextField url, nameDB, login;
    private JPasswordField pass;
    private JButton create, delete, connect;

    public StartFrame(){
        setSize(310, 295);
        setTitle("Project \"G.D. Kassa\" - StartFrame(MySQL database)");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        action();
        setResizable(false);
        setVisible(true);
    }

    public void initComponents(){
        panel = new JPanel();
        lurl = new JLabel("MySQL server URL");
        lnameDB = new JLabel("datatase name");
        llogin = new JLabel("MySQL server login");
        lpass = new JLabel("MySQL server password");
        url = new JTextField("jdbc:mysql://localhost/", 20);
        nameDB = new JTextField("ChoboStartUp", 20);
        login = new JTextField("root", 20);
        pass = new JPasswordField("root", 20);
        create = new JButton("create database");
        delete = new JButton("delete database");
        connect = new JButton("connect to database");
        panel.add(lurl);
        panel.add(url);
        panel.add(lnameDB);
        panel.add(nameDB);
        panel.add(llogin);
        panel.add(login);
        panel.add(lpass);
        panel.add(pass);
        panel.add(create);
        panel.add(delete);
        panel.add(connect);
        add(panel);
    }

    private void action(){
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WorkDB.createDB(url.getText(), nameDB.getText(), login.getText(), String.valueOf(pass.getPassword()));
                    JOptionPane.showMessageDialog(panel, "Database created successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(panel, "Error creating database", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WorkDB.dropDB(url.getText(), nameDB.getText(), login.getText(), String.valueOf(pass.getPassword()));
                    JOptionPane.showMessageDialog(panel, "Database deleted successfuly", "Message", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(panel, "Error deleting database", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        connect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WorkDB.setDb(new DB(url.getText(), nameDB.getText(), login.getText(), String.valueOf(pass.getPassword())));
                    JOptionPane.showMessageDialog(panel, "Connected to database successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new LoginFrame();
//                } catch (ClassNotFoundException ex){
//                    JOptionPane.showMessageDialog(panel, "Error connecting to database (driver error)", "Message", JOptionPane.ERROR_MESSAGE);
//                    dispose();                 //закоментить!!
//                    new LoginFrame();          //закоментить!!
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(panel, "Error connecting to database (connection error)", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }

        });
    }

}
