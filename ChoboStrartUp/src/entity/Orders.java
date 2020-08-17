package entity;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Orders {
    private int id_user;
    private String full_name;
    private int id_order;
    private String station;
    private String train;
    private int time;
    private int price;

    public Orders(int id_order, String station, String train, int time, int price) {
        this.id_order = id_order;
        this.station = station;
        this.train = train;
        this.time = time;
        this.price = price;
    }

    public Orders(String station, String train, int time, int price) {
        this.station = station;
        this.train = train;
        this.time = time;
        this.price = price;
    }

    public Orders(Users user, Stations obStation, Trains obTrain){
        this.id_user = user.getId_user();
        this.full_name = user.getFull_name();
        this.station = obStation.getStation();
        this.train = obTrain.getTrain();
        this.time = obTrain.getTime();
        this.price = (obStation.getDistance())* (obTrain.getTax());
    }

    public Orders() {
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
}
