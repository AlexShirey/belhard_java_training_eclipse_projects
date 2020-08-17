package dao;

import entity.Orders;
import workDB.DB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoOrders implements DaoInterface<Orders>{

    private DB db;

    public DaoOrders(DB db){
        this.db = db;
    }

    public void insert(Orders ob) {
        try {
            PreparedStatement pst = db.getCn().prepareStatement(
                    "INSERT INTO " + ob.getClass().getSimpleName() + " (id_user, full_name, station, train, time, price)"
                            + " VALUES (?, ?, ?, ?, ?, ?)");
            pst.setInt(1, ob.getId_user());
            pst.setString(2, ob.getFull_name());
            pst.setString(3, ob.getStation());
            pst.setString(4, ob.getTrain());
            pst.setInt(5, ob.getTime());
            pst.setInt(6, ob.getPrice());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("error in method insert (Trains ob)");
        }
    }


    @Override
    public void update(Orders ob) {

    }

    @Override
    public void delete(Orders ob) {

    }
}
