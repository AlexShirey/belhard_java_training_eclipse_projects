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
 * Created by Shirey on 20.06.2016.
 */
public class InsertUserFrame extends JFrame{
    private JPanel panel;
    private JLabel lid_user, lfull_name, llogin, lpassword, lrole, ldel_status;
    private JTextField id_user, full_name, login, password, role, del_status;
    private JButton addButton;

    public InsertUserFrame(){
        setSize(700, 110);
        setTitle("Project \"G.D. Kassa\" - Add User Frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponent();
        action();
        setResizable(false);
        setVisible(true);
    }

    public void initComponent(){
        JLabel lid_user = new JLabel("id_user");
        JLabel lfull_name = new JLabel("full_name");
        JLabel llogin = new JLabel("login");
        JLabel lpassword = new JLabel("password");
        JLabel lrole = new JLabel("role");
        JLabel  ldel_status = new JLabel("del_status");
        id_user = new JTextField("id",2);
        full_name = new JTextField("full name",8);
        login = new JTextField("login",8);
        password = new JTextField("password",8);
        role = new JTextField("0",2);
        del_status = new JTextField("0",2);
        addButton = new JButton("add user");
        panel = new JPanel();
        panel.add(lid_user);
        panel.add(id_user);
        panel.add(lfull_name);
        panel.add(full_name);
        panel.add(llogin);
        panel.add(login);
        panel.add(lpassword);
        panel.add(password);
        panel.add(lrole);
        panel.add(role);
        panel.add(ldel_status);
        panel.add(del_status);
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setPreferredSize(new Dimension(700,3));
        panel.add(separator);
        panel.add(addButton);
        add(panel);
    }

    public void action(){
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                Users user = new Users(Integer.valueOf(String.valueOf(id_user.getText())),
                        String.valueOf(full_name.getText()),
                        String.valueOf(login.getText()),
                        String.valueOf(password.getText()),
                        Integer.valueOf(String.valueOf(role.getText())),
                        Integer.valueOf(String.valueOf(del_status.getText())));
                    ResultSet rs = WorkDB.getDb().query("SELECT id_user FROM USERS");
                    while (rs.next()){
                            if (rs.getInt("id_user") == user.getId_user()){
                                throw new SQLException();
                            }
                        }
                    DaoUsers daoUser = new DaoUsers(WorkDB.getDb());
                    daoUser.insert(user);
                    JOptionPane.showMessageDialog(panel, "ok, user added successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(panel, "Error with id, user was not added", "Message", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, "Error with data type, user was not added", "Message", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }




}
