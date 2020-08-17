package user_interface;


import dao.DaoOrders;
import entity.Orders;
import entity.Stations;
import entity.Trains;
import entity.Users;
import workDB.WorkDB;

import javax.swing.*;
import java.awt.*;

public class OrderFrame extends JFrame{
    JPanel panel;
    TableOne tableOrder;
    JScrollPane scroll;
    Users user;
    Stations station;
    Trains train;

    public OrderFrame(Users user, Stations obStation, Trains obTrain){
        this.user = user;
        this.station = obStation;
        this.train = obTrain;
        setSize(480, 90);
        setTitle("Project \"G.D. Kassa\" - Order Frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponent();
        setResizable(false);
        setVisible(true);
    }

    public OrderFrame() {
        setSize(700, 200);
        setTitle("Project \"G.D. Kassa\" - Orders history frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponent();
        setResizable(false);
        setVisible(true);
    }

    public void initComponent(){
        panel = new JPanel();
        DaoOrders daoOrder = new DaoOrders(WorkDB.getDb());
        daoOrder.insert(new Orders(user, station, train));
        tableOrder = new TableOne(WorkDB.getDb().query("SELECT station, train, time, price FROM orders WHERE id_order = (SELECT MAX(id_order) FROM orders)"));
        scroll = new JScrollPane(tableOrder);
        scroll.setPreferredSize(new Dimension(450, 45));

        panel.add(scroll);
        add(panel);
    }
}
