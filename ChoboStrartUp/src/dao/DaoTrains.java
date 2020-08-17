package dao;


import entity.Trains;
import workDB.DB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoTrains implements DaoInterface<Trains> {
    private DB db;

    public DaoTrains(DB db){
        this.db = db;
    }

    public void insert(Trains ob) {
        try {
            PreparedStatement pst = db.getCn().prepareStatement(
                    "INSERT INTO " + ob.getClass().getSimpleName() + " (id_train, train, id_route, time, tax)"
                            + " VALUES (?, ?, ?, ?, ?)");
            pst.setInt(1, ob.getId_train());
            pst.setString(2, ob.getTrain());
            pst.setInt(3, ob.getId_route());
            pst.setInt(4, ob.getTime());
            pst.setInt(5, ob.getTax());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("error in method insert (Trains ob)");
        }
    }

    public void update(Trains ob) {
        try {
            PreparedStatement pst = db.getCn().prepareStatement(
                    "UPDATE " + ob.getClass().getSimpleName() + " SET train=?, id_route=?, time=?, tax=?"
                    + " WHERE id_train=" + ob.getId_train());
            pst.setString(1, ob.getTrain());
            pst.setInt(2, ob.getId_route());
            pst.setInt(3, ob.getTime());
            pst.setInt(4, ob.getTax());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("error in method update (Trains ob)");
        }
    }

    public void delete(Trains ob) {
        try {
			db.update("DELETE FROM " + ob.getClass().getSimpleName() + " WHERE id_train=" + ob.getId_train());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
