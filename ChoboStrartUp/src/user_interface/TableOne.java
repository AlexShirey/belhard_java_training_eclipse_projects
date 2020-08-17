package user_interface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class TableOne extends JTable {

    public TableOne(ResultSet rs){
        DefaultTableModel dtm = new DefaultTableModel();
        try {
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i<=rsmd.getColumnCount(); i++){
                dtm.addColumn(rsmd.getColumnName(i));
            }
            while (rs.next()){
                Vector v = new Vector();
                for (int i = 1; i <= rsmd.getColumnCount(); i++){
                    v.add(rs.getString(i));
                }
                dtm.addRow(v);
            }
            setModel(dtm);
            setAutoResizeMode(AUTO_RESIZE_ALL_COLUMNS);
        } catch (SQLException e) {
            System.out.println("error in TableOne rsmd");
        }
    }
}
