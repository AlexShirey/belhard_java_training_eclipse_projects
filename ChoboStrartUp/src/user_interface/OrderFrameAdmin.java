package user_interface;

import workDB.WorkDB;

import javax.swing.*;
import java.awt.*;

public class OrderFrameAdmin extends OrderFrame {
    public OrderFrameAdmin() {
        super();
    }

    @Override
    public void initComponent() {
        panel = new JPanel();
        //DaoOrders daoOrder = new DaoOrders(WorkDB.getDb());
        //daoOrder.insert(new Orders(user, station, train));
        tableOrder = new TableOne(WorkDB.getDb().query("SELECT * FROM orders"));
        scroll = new JScrollPane(tableOrder);
        scroll.setPreferredSize(new Dimension(670, 150));

        panel.add(scroll);
        add(panel);
    }

}
