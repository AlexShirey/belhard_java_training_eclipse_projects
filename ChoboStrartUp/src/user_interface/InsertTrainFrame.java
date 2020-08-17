package user_interface;

import dao.DaoTrains;
import entity.Trains;
import workDB.WorkDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Shirey on 21.06.2016.
 */
public class InsertTrainFrame extends JFrame{
//    private int id_train;
//    private String train;
//    private int id_route;
//    private int time;
//    private int tax;

    private JPanel panel;
    private JLabel lid_train, ltrain, lid_route, ltime, ltax;
    private JTextField id_train, train, id_route, time, tax;
    private JButton addButton;

    public InsertTrainFrame(){
        setSize(600, 110);
        setTitle("Project \"G.D. Kassa\" - Add Train Frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponent();
        action();
        setResizable(false);
        setVisible(true);

    }

    public void initComponent(){
        JPanel panel = new JPanel();
        JLabel lid_train = new JLabel("id_train");
        JLabel ltrain = new JLabel("train");
        JLabel lid_route = new JLabel("id_route");
        JLabel ltime = new JLabel("id_time");
        JLabel ltax = new JLabel("id_tax");

        id_train = new JTextField("id",2);
        train = new JTextField("Minsk-Molodechno",12);
        id_route = new JTextField("1",2);
        time = new JTextField("10",2);
        tax = new JTextField("10",2);
        addButton = new JButton("add train");

        panel = new JPanel();
        panel.add(lid_train);
        panel.add(id_train);
        panel.add(ltrain);
        panel.add(train);
        panel.add(lid_route);
        panel.add(id_route);
        panel.add(ltime);
        panel.add(time);
        panel.add(ltax);
        panel.add(tax);
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setPreferredSize(new Dimension(550,3));
        panel.add(separator);
        panel.add(addButton);
        add(panel);
    }

    public void action(){
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Trains train1 = new Trains(Integer.valueOf(id_train.getText()),
                            train.getText(),
                            Integer.valueOf(id_route.getText()),
                            Integer.valueOf(time.getText()),
                            Integer.valueOf(tax.getText()));
                    DaoTrains DaoTrain = new DaoTrains(WorkDB.getDb());
                    ResultSet rs = WorkDB.getDb().query("SELECT * FROM trains");
                    while (rs.next()) {
                        if (rs.getInt("id_train") == train1.getId_train()) {
                            throw new SQLException();
                        }
                    }
                    DaoTrain.insert(train1);
                    JOptionPane.showMessageDialog(panel, "ok, train added successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                }catch (SQLException ex){
                    JOptionPane.showMessageDialog(panel, "Error with id, train was not added", "Message", JOptionPane.ERROR_MESSAGE);
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, "Error with data type, train was not added", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

}
