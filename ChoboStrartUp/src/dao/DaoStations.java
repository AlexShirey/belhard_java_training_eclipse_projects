package dao;


import entity.Stations;
import workDB.DB;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoStations implements DaoInterface<Stations>{
    private DB db;

    public DaoStations(DB db){
        this.db = db;
    }

    public void insert(Stations ob) {
        try {
            PreparedStatement pst = db.getCn().prepareStatement(
                    "INSERT INTO " + ob.getClass().getSimpleName() + " (id_station, station, distance, id_route, route)"
                    + " VALUES (?, ?, ?, ?, ?)");
            pst.setInt(1, ob.getId_station());
            pst.setString(2, ob.getStation());
            pst.setInt(3, ob.getDistance());
            pst.setInt(4, ob.getId_route());
            pst.setString(5, ob.getRoute());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("error in method insert (Stations ob)");
        }
    }

    public void update(Stations ob) {
        try {
            PreparedStatement pst = db.getCn().prepareStatement(
                    "UPDATE " + ob.getClass().getSimpleName() + " SET station=?, distance=?, id_route=?, route=?"
                            + " WHERE id_station=" + ob.getId_station());
            pst.setString(1, ob.getStation());
            pst.setInt(2, ob.getDistance());
            pst.setInt(3, ob.getId_route());
            pst.setString(4, ob.getRoute());
            pst.execute();
        pst.execute();
        } catch (SQLException e) {
            System.out.print("error in method update (Stations ob)");
        }
    }

    public void delete(Stations ob) {
       try {
		db.update("DELETE FROM " + ob.getClass().getSimpleName() + " WHERE id_station=" + ob.getId_station());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
