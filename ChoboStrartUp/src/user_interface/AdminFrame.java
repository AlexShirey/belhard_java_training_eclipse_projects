package user_interface;

import dao.DaoStations;
import dao.DaoTrains;
import dao.DaoUsers;
import entity.Stations;
import entity.Trains;
import entity.Users;
import workDB.WorkDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AdminFrame extends JFrame{

    private JPanel panel;
    private JLabel ltableUsers, ltableStations, ltableTrains;
    private TableOne tableUsers, tableStations, tableTrains;
    private JScrollPane scrollUsers, scrollStations, scrollTrains;
    private JButton updateUser, deleteUser, insertUser;
    private JButton updateStation, deleteStation, insertStation;
    private JButton updateTrain, deleteTrain, insertTrain;

    private JMenuBar menu;
    private JMenu refresh, orders, about;
    private JMenuItem refreshItem, aboutItem, ordersItem;


    public AdminFrame(){
        setSize(500, 550);
        setTitle("Project \"G.D. Kassa\" - AdminFrame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
        action();
        setResizable(false);
        setVisible(true);
    }

    public void initComponents(){
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        menu = new JMenuBar();
        refresh = new JMenu("refresh");
        orders = new JMenu("orders history");
        about = new JMenu("about");

        refreshItem = new JMenuItem("refresh");
        ordersItem = new JMenuItem("view");
        aboutItem = new JMenuItem("about");
        refresh.add(refreshItem);
        orders.add(ordersItem);
        about.add(aboutItem);
        menu.add(refresh);
        menu.add(orders);
        menu.add(about);
        setJMenuBar(menu);

        ltableUsers = new JLabel("table users");
        tableUsers = new TableOne(WorkDB.getDb().query("SELECT * FROM users"));
        scrollUsers = new JScrollPane(tableUsers);
        scrollUsers.setPreferredSize(new Dimension(470, 100));
        updateUser = new JButton("update user");
        deleteUser = new JButton("delete user");
        insertUser = new JButton("insert user");

        ltableStations = new JLabel("table stations");
        tableStations = new TableOne(WorkDB.getDb().query("SELECT * FROM stations"));
        scrollStations = new JScrollPane(tableStations);
        scrollStations.setPreferredSize(new Dimension(470, 100));
        updateStation = new JButton("update station");
        deleteStation = new JButton("delete station");
        insertStation = new JButton("insert station");

        ltableTrains = new JLabel("table trains");
        tableTrains = new TableOne(WorkDB.getDb().query("SELECT * FROM trains"));
        scrollTrains = new JScrollPane(tableTrains);
        scrollTrains.setPreferredSize(new Dimension(470, 100));
        updateTrain = new JButton("update train");
        deleteTrain = new JButton("delete train");
        insertTrain = new JButton("insert train");

        panel.add(ltableUsers);
        panel.add(scrollUsers);
        panel.add(insertUser);
        panel.add(updateUser);
        panel.add(deleteUser);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setPreferredSize(new Dimension(450,3));
        panel.add(separator);

        panel.add(ltableStations);
        panel.add(scrollStations);
        panel.add(insertStation);
        panel.add(updateStation);
        panel.add(deleteStation);

        JSeparator separator2 = new JSeparator(SwingConstants.HORIZONTAL);
        separator2.setPreferredSize(new Dimension(450,5));
        panel.add(separator2);

        panel.add(ltableTrains);
        panel.add(scrollTrains);
        panel.add(insertTrain);
        panel.add(updateTrain);
        panel.add(deleteTrain);

        panel.updateUI();
        add(panel);
    }

    public void action(){

        insertUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InsertUserFrame();
            }
        });

        updateUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Users user = new Users(Integer.valueOf(String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(),0))),
                        String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(),1)),
                        String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(),2)),
                        String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(),3)),
                        Integer.valueOf(String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(),4))),
                        Integer.valueOf(String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(),5))));
                DaoUsers daoUser = new DaoUsers(WorkDB.getDb());
                    daoUser.update(user);
                    refresh();
                    System.out.println("updated");
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, "Error with data type, cant update", "Message", JOptionPane.ERROR_MESSAGE);
                } catch (ArrayIndexOutOfBoundsException ex){
                }
            }
        });

        deleteUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                Users user = new Users(Integer.valueOf(String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(),0))));
                DaoUsers daoUser = new DaoUsers(WorkDB.getDb());
                    daoUser.delete(user);
                    refresh();
                    System.out.println("deleted");
                }  catch (ArrayIndexOutOfBoundsException ex){
                }
            }
        });

        insertStation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InsertStationFrame();
            }
        });

        updateStation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Stations station = new Stations(Integer.valueOf(String.valueOf(tableStations.getValueAt(tableStations.getSelectedRow(),0))),
                            String.valueOf(tableStations.getValueAt(tableStations.getSelectedRow(),1)),
                            Integer.valueOf(String.valueOf(tableStations.getValueAt(tableStations.getSelectedRow(),2))),
                            Integer.valueOf(String.valueOf(tableStations.getValueAt(tableStations.getSelectedRow(),3))),
                            String.valueOf(tableStations.getValueAt(tableStations.getSelectedRow(),4)));
                    DaoStations daoStation = new DaoStations(WorkDB.getDb());
                    daoStation.update(station);
                    refresh();
                    System.out.println("updated");
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, "Error with data type, cant update", "Message", JOptionPane.ERROR_MESSAGE);
                } catch (ArrayIndexOutOfBoundsException ex){
                }
            }
        });

        deleteStation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Stations station = new Stations(Integer.valueOf(String.valueOf(tableStations.getValueAt(tableStations.getSelectedRow(),0))));
                    DaoStations daoStation = new DaoStations(WorkDB.getDb());
                    daoStation.delete(station);
                    refresh();
                    System.out.println("deleted");
                }  catch (ArrayIndexOutOfBoundsException ex){
                }
            }
        });

        insertTrain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InsertTrainFrame();
            }
        });

        updateTrain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Trains train = new Trains(Integer.valueOf(String.valueOf(tableTrains.getValueAt(tableTrains.getSelectedRow(),0))),
                            String.valueOf(tableTrains.getValueAt(tableTrains.getSelectedRow(),1)),
                            Integer.valueOf(String.valueOf(tableTrains.getValueAt(tableTrains.getSelectedRow(),2))),
                            Integer.valueOf(String.valueOf(tableTrains.getValueAt(tableTrains.getSelectedRow(),3))),
                            Integer.valueOf(String.valueOf(tableTrains.getValueAt(tableTrains.getSelectedRow(),4))));
                    DaoTrains daoTrain = new DaoTrains(WorkDB.getDb());
                    daoTrain.update(train);
                    refresh();
                    System.out.println("updated");
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, "Error with data type, cant update", "Message", JOptionPane.ERROR_MESSAGE);
                } catch (ArrayIndexOutOfBoundsException ex){
                }
            }
        });

        deleteTrain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Trains train = new Trains(Integer.valueOf(String.valueOf(tableTrains.getValueAt(tableTrains.getSelectedRow(),0))));
                    DaoTrains daoTrain = new DaoTrains(WorkDB.getDb());
                    daoTrain.delete(train);
                    refresh();
                    System.out.println("deleted");
                }  catch (ArrayIndexOutOfBoundsException ex){
                }
            }
        });


        refreshItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refresh();
            }
        });

        ordersItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OrderFrameAdmin();
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "by Shirey Alexander, 2016", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(e.getKeyCode() == KeyEvent.VK_F5){
                    refresh();
                    System.out.println("eeee");
                }
            }
        });
    }

    public void refresh(){
        panel.removeAll();
        setJMenuBar(menu);

        tableUsers = new TableOne(WorkDB.getDb().query("SELECT * FROM users"));
        scrollUsers = new JScrollPane(tableUsers);
        scrollUsers.setPreferredSize(new Dimension(470, 100));
        tableStations = new TableOne(WorkDB.getDb().query("SELECT * FROM stations"));
        scrollStations = new JScrollPane(tableStations);
        scrollStations.setPreferredSize(new Dimension(470, 100));
        tableTrains = new TableOne(WorkDB.getDb().query("SELECT * FROM trains"));
        scrollTrains = new JScrollPane(tableTrains);
        scrollTrains.setPreferredSize(new Dimension(470, 100));

        panel.add(ltableUsers);
        panel.add(scrollUsers);
        panel.add(insertUser);
        panel.add(updateUser);
        panel.add(deleteUser);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setPreferredSize(new Dimension(450,3));
        panel.add(separator);

        panel.add(ltableStations);
        panel.add(scrollStations);
        panel.add(insertStation);
        panel.add(updateStation);
        panel.add(deleteStation);

        JSeparator separator2 = new JSeparator(SwingConstants.HORIZONTAL);
        separator2.setPreferredSize(new Dimension(450,5));
        panel.add(separator2);

        panel.add(ltableTrains);
        panel.add(scrollTrains);
        panel.add(insertTrain);
        panel.add(updateTrain);
        panel.add(deleteTrain);

        panel.updateUI();

    }


}
