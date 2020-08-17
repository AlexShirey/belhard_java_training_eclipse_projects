package user_interface;

import dao.DaoStations;
import entity.Stations;
import workDB.WorkDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/**
 * Created by Shirey on 20.06.2016.
 */
public class InsertStationFrame extends JFrame{

    private JPanel panel;
    private JLabel lid_station, lstation, ldistance, lid_route, lroute;
    private JTextField id_station, station, distance, id_route, route;
    private JButton addButton;

    public InsertStationFrame(){
        setSize(600, 110);
        setTitle("Project \"G.D. Kassa\" - Add Station Frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponent();
        action();
        setResizable(false);
        setVisible(true);
    }

    public void initComponent(){
        JLabel lid_station = new JLabel("id_station");
        JLabel lstation = new JLabel("station");
        JLabel ldistance = new JLabel("distance");
        JLabel lid_route = new JLabel("id_route");
        JLabel lroute = new JLabel("route");

        id_station = new JTextField("id",2);
        station = new JTextField("station",8);
        distance = new JTextField("0",2);
        id_route = new JTextField("1", 2);
        route = new JTextField("Minsk-Molodechno",12);
        addButton = new JButton("add station");

        panel = new JPanel();
        panel.add(lid_station);
        panel.add(id_station);
        panel.add(lstation);
        panel.add(station);
        panel.add(ldistance);
        panel.add(distance);
        panel.add(lid_route);
        panel.add(id_route);
        panel.add(lroute);
        panel.add(route);
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
                try {
                Stations station1 = new Stations(Integer.valueOf(id_station.getText()),
                        station.getText(),
                        Integer.valueOf(distance.getText()),
                        Integer.valueOf(id_route.getText()),
                        route.getText());
                DaoStations DaoStation = new DaoStations(WorkDB.getDb());
                ResultSet rs = WorkDB.getDb().query("SELECT * FROM stations");
                while (rs.next()) {
                    if (rs.getInt("id_station") == station1.getId_station()) {
                        throw new SQLException();
                    }
                    }
                    DaoStation.insert(station1);
                    JOptionPane.showMessageDialog(panel, "ok, station added successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                }catch (SQLException ex){
                    JOptionPane.showMessageDialog(panel, "Error with id, station was not added", "Message", JOptionPane.ERROR_MESSAGE);
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, "Error with data type, station was not added", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


}
