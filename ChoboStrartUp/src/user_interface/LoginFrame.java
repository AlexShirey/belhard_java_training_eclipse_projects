package user_interface;

import entity.Users;
import workDB.DB;
import workDB.WorkDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFrame extends JFrame{

    private JPanel panel;
    private JLabel llogin, lpassword;
    private JTextField login;
    private JPasswordField password;
    private JButton enter, registration;

    public LoginFrame(){
        setSize(250, 195);
        setTitle("Project \"G.D. Kassa\" - LoginFrame(login to database)");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponent();
        action();
        setResizable(false);
        setVisible(true);
    }

    public void initComponent(){
        panel = new JPanel();
        llogin = new JLabel("login");
        login = new JTextField("admin",20);
        lpassword = new JLabel("password");
        password = new JPasswordField("admin", 20);
        enter = new JButton("enter database");
        registration = new JButton("register new user");
        panel.add(llogin);
        panel.add(login);
        panel.add(lpassword);
        panel.add(password);
        panel.add(enter);
        panel.add(registration);
        add(panel);
    }

    public void action(){
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DB db = WorkDB.getDb();
                ResultSet rs = db.query("SELECT * FROM USERS WHERE login='"+login.getText()+"'");
                try {
                    if (rs.next()){
                        if (rs.getInt("del_status") != 1){
                            if (rs.getString("password").equals(String.valueOf(password.getPassword()))){
                                if (rs.getInt("role") == 1){
                                    System.out.println("Ого! Да Вы админ! открываем админскую часть");
                                    JOptionPane.showMessageDialog(panel, "Ого! Да Вы админ! открываем админскую часть", "Message", JOptionPane.INFORMATION_MESSAGE);
                                    //dispose();
                                    new AdminFrame();
                                } else {
                                    System.out.println("открываем обычную часть");
                                    Users user = new Users(rs.getInt("id_user"), rs.getString("full_name"));
                                    //dispose();
                                    JOptionPane.showMessageDialog(panel, "Welcome, " + user.getFull_name() + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
                                    new UserFrame(user);
                                }
                            } else {
                                System.out.println("неправильный пароль");
                                JOptionPane.showMessageDialog(panel, "Неправильный пароль", "Message", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            System.out.println("Вы удалены");
                            JOptionPane.showMessageDialog(panel, "Вы удалены из базы данных", "Message", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        System.out.println("Такого пользователя в базе данных нет");
                        JOptionPane.showMessageDialog(panel, "Такого пользователя в базе данных нет", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(panel, "SQLException", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        registration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrationFrame();
                //dispose();
            }
        });
    }


}
