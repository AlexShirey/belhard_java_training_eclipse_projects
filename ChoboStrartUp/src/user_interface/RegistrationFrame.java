package user_interface;

import dao.DaoUsers;
import entity.Users;
import workDB.WorkDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Shirey on 10.06.2016.
 */
public class RegistrationFrame extends JFrame{
    private JPanel panel;
    private JLabel lfull_name, llogin, lpassword;
    private JTextField full_name, login, password;
    private JButton registerButton;

    public RegistrationFrame(){
        setSize(500, 110);
        setTitle("Project \"G.D. Kassa\" - Registration Frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponent();
        action();
        setResizable(false);
        setVisible(true);
    }

    public void initComponent(){

        JLabel lfull_name = new JLabel("full_name");
        JLabel llogin = new JLabel("login");
        JLabel lpassword = new JLabel("password");
        full_name = new JTextField("full name",8);
        login = new JTextField("login",8);
        password = new JTextField("password",8);
        registerButton = new JButton("register");
        panel = new JPanel();
        panel.add(lfull_name);
        panel.add(full_name);
        panel.add(llogin);
        panel.add(login);
        panel.add(lpassword);
        panel.add(password);
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setPreferredSize(new Dimension(700,3));
        panel.add(separator);
        panel.add(registerButton);
        add(panel);
    }

    public void action(){
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Users user = new Users(String.valueOf(full_name.getText()),
                            String.valueOf(login.getText()),
                            String.valueOf(password.getText()));
                    ResultSet rs = WorkDB.getDb().query("SELECT login FROM USERS ");
                    while (rs.next()){
                        if (rs.getString("login").equals(login.getText())){
                            throw new SQLException();
                        }
                    }
                    DaoUsers daoUser = new DaoUsers(WorkDB.getDb());
                    daoUser.insert(user);
                    JOptionPane.showMessageDialog(panel, "ok, new user registered successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(panel, "Error, login already exist", "Message", JOptionPane.ERROR_MESSAGE);

                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, "Error with data type, user was not added", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


    }

}
