package dao;

import entity.Users;
import workDB.DB;
import workDB.WorkDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoUsers implements DaoInterface<Users> {
    private DB db;

    public DaoUsers(DB db){
        this.db = db;
    }

    public void insert(Users ob) throws SQLException {
        try {
            PreparedStatement pst = db.getCn().prepareStatement(
                    "INSERT INTO " + ob.getClass().getSimpleName() + " (id_user, full_name, login, password, role, del_status)"
                    + " VALUES (?, ? , ?, ?, ?, ?)");
            pst.setInt(1, ob.getId_user());
            pst.setString(2, ob.getFull_name());
            pst.setString(3, ob.getLogin());
            pst.setString(4, ob.getPassword());
            pst.setInt(5, ob.getRole());
            pst.setInt(6, ob.getDel_status());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("error in method insert (Users ob)");
            throw new SQLException();
        }
    }

    public void update(Users ob) {
        try {
            PreparedStatement pst = db.getCn().prepareStatement(
                    "UPDATE " + ob.getClass().getSimpleName() + " SET full_name=?, login=?, password=?, role=?, del_status=?"
                            + " WHERE id_user=" + ob.getId_user());
            pst.setString(1, ob.getFull_name());
            pst.setString(2, ob.getLogin());
            pst.setString(3, ob.getPassword());
            pst.setInt(4, ob.getRole());
            pst.setInt(5, ob.getDel_status());
            pst.execute();
        } catch (SQLException e) {
            System.out.print("error in method update (Users ob)");
        }
    }

    public void delete(Users ob){
        try {
			db.update("DELETE FROM " + ob.getClass().getSimpleName() + " WHERE id_user=" + ob.getId_user());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
