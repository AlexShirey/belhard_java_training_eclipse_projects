package entity;

public class Users {
    private int id_user;
    private String full_name;
    private String login;
    private String password;
    private int role;
    private int del_status;


    public Users(int id_user, String full_name, String login, String password, int role, int del_status) {
        this.id_user = id_user;
        this.full_name = full_name;
        this.login = login;
        this.password = password;
        this.role = role;
        this.del_status = del_status;
    }

    public Users(String full_name, String login, String password, int role, int del_status) {
        //this.id_user = id_user;
        this.full_name = full_name;
        this.login = login;
        this.password = password;
        this.role = role;
        this.del_status = del_status;
    }

    public Users(String full_name, String login, String password) {
        this.full_name = full_name;
        this.login = login;
        this.password = password;

    }

    public Users(int id_user){
        this.id_user = id_user;
    }

    public Users(int id_user, String full_name) {
        this.id_user = id_user;
        this.full_name = full_name;
    }


    public Users(){

    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDel_status() {
        return del_status;
    }

    public void setDel_status(int del_status) {
        this.del_status = del_status;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
