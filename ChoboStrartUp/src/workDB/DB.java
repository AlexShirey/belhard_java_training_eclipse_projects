package workDB;

import java.sql.*;

//этот класс сожержит методы
//- подключения к существующей базе данных (путем конструктора);
//- запросы:
//  `update(sql);
//  `query(sql);
//  `showTable(rs);
//  `close();


public class DB {
    private Connection cn;
    private Statement st;
    private ResultSet rs;

    public DB(String url, String nameDB, String login, String pass) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                cn = DriverManager.getConnection(url + nameDB+"?useSSL=false", login, pass);
            } catch (SQLException e) {
                System.out.println("error in get connection");
                throw new SQLException();
            }
            try {
                st = cn.createStatement();
            } catch (SQLException e) {
                System.out.println("error in createStatement");
                throw new SQLException();
            }
            System.out.println("connecting to " + nameDB + "... OK");
        } catch (ClassNotFoundException e) {
            System.out.println("error with driver");
            //throw new ClassNotFoundException();
        }

    }

    public void update(String sql) throws SQLException {
        try {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("error executting update");
            throw new SQLException();
        }
    }

    public ResultSet query(String sql){
        try {
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("error executting query");
        }
        return rs;
    }

    public void showTable(ResultSet rs){
        try {
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++){
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            while (rs.next()) {
                System.out.println();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
            }
        } catch (SQLException e) {
            System.out.println("error in show query (rsmd)");
        }
    }

    public void close(){
        try {
            st.close();
            cn.close();
            System.out.println("disconnected from server");
        } catch (SQLException e) {
            System.out.println("error in close method");
        }
    }

    public Connection getCn(){
        return cn;
    }




}
