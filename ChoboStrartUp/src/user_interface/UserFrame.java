package user_interface;


import entity.Stations;
import entity.Trains;
import entity.Users;
import workDB.WorkDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UserFrame extends JFrame {
    private JPanel panel;
    private JLabel lselectStation, lselectTrain;
    private TableOne tableSelectStation, tableSelectTrain, tableOrder;
    private JButton stationButton, trainButton, orderButton;
    private JScrollPane scrollStations, scrollTrains, scrollOrder;
    private Stations station;
    private Trains train;
    private JSeparator separator;
    private Users user;


    public UserFrame(Users user){
        this.user = user;
        setSize(370, 400);
        setTitle("Project \"G.D. Kassa\" - User Frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
        action();
        setResizable(false);
        setVisible(true);
    }

    public void initComponents(){
        station = new Stations();
        train = new Trains();
        panel = new JPanel();
        lselectStation = new JLabel("select station");
        lselectTrain = new JLabel("select train");
        tableSelectStation = new TableOne(WorkDB.getDb().query("SELECT station from stations"));
        scrollStations = new JScrollPane(tableSelectStation);
        scrollStations.setPreferredSize(new Dimension(300, 100));
        stationButton = new JButton("select station");
        trainButton = new JButton("select train");
        orderButton = new JButton("show order");


        panel.add(lselectStation);
        panel.add(scrollStations);
        panel.add(stationButton);

        separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setPreferredSize(new Dimension(300,3));
        panel.add(separator);

        add(panel);
    }

    public void action(){
        stationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    station.setStation(String.valueOf(tableSelectStation.getValueAt(tableSelectStation.getSelectedRow(), tableSelectStation.getSelectedColumn())));
                    ResultSet rs = (WorkDB.getDb().query("SELECT distance FROM stations WHERE station='" + station.getStation() + "'"));
                    if (rs.next()){
                        station.setDistance(Integer.valueOf(rs.getString("distance")));
                    }
                    System.out.print(station.getDistance());
                    System.out.print(station.getStation());
                    tableSelectTrain = new TableOne(WorkDB.getDb().query("SELECT train, time, tax FROM trains WHERE id_route IN " +
                            "(SELECT id_route FROM stations WHERE station='" + station.getStation() + "')"));
                    refresh();
                } catch (Exception ex) {
                }
            }
        });

        trainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    train.setTrain(String.valueOf(tableSelectTrain.getValueAt(tableSelectTrain.getSelectedRow(),0)));
                    train.setTime(Integer.valueOf(String.valueOf(tableSelectTrain.getValueAt(tableSelectTrain.getSelectedRow(),1))));
                    train.setTax(Integer.valueOf(String.valueOf(tableSelectTrain.getValueAt(tableSelectTrain.getSelectedRow(),2))));
                    System.out.println(train.getTrain());
                    refresh2();
                } catch (Exception ex){
                }
            }
        });

        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                      new OrderFrame(user, station, train);
                } catch (Exception ex){
                }
            }
        });
    }

    public void refresh(){
        panel.removeAll();

        panel.add(lselectStation);
        panel.add(scrollStations);
        panel.add(stationButton);
        panel.add(separator);

        panel.add(lselectTrain);
        scrollTrains = new JScrollPane(tableSelectTrain);
        scrollTrains.setPreferredSize(new Dimension(340, 55));
        panel.add(scrollTrains);
        panel.add(trainButton);

        panel.updateUI();
    }

    public void refresh2(){
        panel.removeAll();

        panel.add(lselectStation);
        panel.add(scrollStations);
        panel.add(stationButton);
        panel.add(separator);

        panel.add(lselectTrain);
        scrollTrains = new JScrollPane(tableSelectTrain);
        scrollTrains.setPreferredSize(new Dimension(340, 55));
        panel.add(scrollTrains);
        panel.add(trainButton);

        separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setPreferredSize(new Dimension(300,3));
        panel.add(separator);
        panel.add(orderButton);

        panel.updateUI();
    }

}
