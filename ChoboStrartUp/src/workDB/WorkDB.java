package workDB;

import dao.DaoOrders;
import dao.DaoStations;
import dao.DaoTrains;
import dao.DaoUsers;
import entity.Orders;
import entity.Stations;
import entity.Trains;
import entity.Users;

import java.sql.SQLException;
// метод createDB:
//   - подключение к серверу MySQL;
//   - создание базы данных;
//   - создание таблиц в базе данных;
//   - заполнение таблиц;
//   - отключение от сервера;

// метод dropDB:
//   - подключение к серверу MySQL;
//   - удаление базы данных;
//   - отключение от сервера;

public class WorkDB {
    private static DB db; //убрать переменную

    public static void createDB(String url, String nameDB, String login, String pass) throws SQLException, ClassNotFoundException {
        db = new DB(url, "", login, pass);
        db.update("CREATE DATABASE " + nameDB);
        db.update("USE " + nameDB);
        System.out.println("database " + nameDB + " created");

        db.update("CREATE TABLE users ("
                + " id_user INT AUTO_INCREMENT,"
                + " full_name VARCHAR(255) NOT NULL,"
                + " login VARCHAR(255) NOT NULL,"
                + " password VARCHAR(255) NOT NULL,"
                + " role INT NOT NULL,"
                + " del_status INT NOT NULL,"
                + " PRIMARY KEY (id_user))");

        DaoUsers daoUser = new DaoUsers(db);
        daoUser.insert(new Users("chobo", "admin", "admin", 1, 0));
        daoUser.insert(new Users("vasia", "vasia", "vasia", 0, 0));
        daoUser.insert(new Users("gleb", "gleb", "gleb", 0, 0));
        daoUser.insert(new Users("gleb", "gleb", "gleb", 0, 0));
        daoUser.insert(new Users("gleb", "gleb", "gleb", 0, 0));
        daoUser.insert(new Users("gleb", "gleb", "gleb", 0, 0));
        daoUser.insert(new Users("gleb", "gleb", "gleb", 0, 0));
        //daoUser.update(new Users(2, "vasia-change", "vasia", "vasia", 0, 0));
        //daoUser.delete(new Users(3));

        db.update("CREATE TABLE stations ("
                + " id_station INT AUTO_INCREMENT,"
                + " station VARCHAR(255) NOT NULL,"
                + " distance INT NOT NULL,"
                + " id_route INT NOT NULL,"
                + " route VARCHAR(255) NOT NULL,"
                + " PRIMARY KEY (id_station))");

        DaoStations daoStation = new DaoStations(db);
        daoStation.insert(new Stations("Gdanovichi", 11, 1, "Minsk-Molodechno" ));
        daoStation.insert(new Stations("Ratomka", 16, 1, "Minsk-Molodechno" ));
        daoStation.insert(new Stations("Radoshkovichi", 24, 1, "Minsk-Molodechno" ));
        daoStation.insert(new Stations("Usha", 60, 1, "Minsk-Molodechno" ));
        daoStation.insert(new Stations("Molodechno", 70, 1, "Minsk-Molodechno" ));
        daoStation.insert(new Stations("Baranovichi", 142, 2, "Minsk-Brest" ));
        daoStation.insert(new Stations("Brest", 342, 2, "Minsk-Brest" ));
        daoStation.insert(new Stations("Godino", 60, 3, "Minsk-Orsha" ));
        daoStation.insert(new Stations("Borisov", 80, 3, "Minsk-Orsha" ));
        daoStation.insert(new Stations("Orsha", 212, 3, "Minsk-Orsha" ));
        daoStation.insert(new Stations("Borisov", 80, 4, "Minsk-Moscow" ));
        daoStation.insert(new Stations("Orsha", 212, 4, "Minsk-Moscow" ));
        daoStation.insert(new Stations("Smolensk", 250, 4, "Minsk-Moscow" ));
        daoStation.insert(new Stations("Moscow", 750, 4, "Minsk-Moscow" ));
        //daoStation.update(new Stations(1, "Gdanovichi-change", 11, 1, "Minsk-Molodechno" ));
        //daoStation.delete(new Stations(1));

        db.update("CREATE TABLE trains ("
                + " id_train INT AUTO_INCREMENT,"
                + " train VARCHAR(255) NOT NULL,"
                + " id_route INT NOT NULL,"
                + " time INT NOT NULL,"
                + " tax INT NOT NULL,"
                + " PRIMARY KEY (id_train))");

        DaoTrains daoTrain = new DaoTrains(db);
        daoTrain.insert(new Trains("Minsk-Molodechno", 1, 6, 2));
        daoTrain.insert(new Trains("Minsk-Molodechno", 1, 9, 2));
        daoTrain.insert(new Trains("Minsk-Brest", 2, 15, 3));
        daoTrain.insert(new Trains("Minsk-Orsha", 3, 10, 3));
        daoTrain.insert(new Trains("Minsk-Moscow", 4, 15, 5));
        //daoTrain.update(new Trains(1, "Minsk-Molodechno-change", 1, 9, 2));
        //daoTrain.delete(new Trains(1));

        db.update("CREATE TABLE orders ("
                + " id_order INT AUTO_INCREMENT,"
                + " id_user VARCHAR(255) NOT NULL,"
                + " full_name VARCHAR(255) NOT NULL,"
                + " station VARCHAR(255) NOT NULL,"
                + " train VARCHAR(255) NOT NULL,"
                + " time INT NOT NULL,"
                + " price INT NOT NULL,"
                + " PRIMARY KEY (id_order))");
        //DaoOrders daoOrder = new DaoOrders(db);
        //daoOrder.insert(new Orders("Ratomka", "Minsk-Molodechno", 5, 5));

        db.close();
    }

    public static void dropDB(String url, String nameDB, String login, String pass) throws SQLException {
        db = new DB(url, "", login, pass);
        db.update("DROP DATABASE " + nameDB);
        System.out.println("database " + nameDB + " dropped");
        db.close();
    }

    public static DB getDb(){
        return db;
    }

    public static void setDb(DB db) {
        WorkDB.db = db;
    }
}
