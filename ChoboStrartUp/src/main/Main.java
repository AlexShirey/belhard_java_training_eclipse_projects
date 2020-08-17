package main;

import user_interface.StartFrame;

public class Main {
    public static void main(String[] args){

        new StartFrame();

    }
}





//        // создание базы данных
//        WorkDB.createDB("jdbc:mysql://localhost/", "ChoboStartUP", "root", "root");
//
//        //подключение к базе данных, запросы
//        DB db = new DB("jdbc:mysql://localhost/", "ChoboStartUP", "root", "root");
//        db.showTable(db.query("SELECT * FROM users"));
//        db.showTable(db.query("SELECT * FROM stations"));
//
//        //DaoUsers daoUser = new DaoUsers(db);
//        //daoUser.delete(new Users(3));
//
//        //удаление базы данных
//        WorkDB.dropDB("jdbc:mysql://localhost/", "ChoboStartUP", "root", "root");
