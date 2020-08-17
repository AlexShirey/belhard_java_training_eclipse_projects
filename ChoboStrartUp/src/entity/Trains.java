package entity;

public class Trains {
    private int id_train;
    private String train;
    private int id_route;
    private int time;
    private int tax;

    public Trains(int id_train, String train, int id_route, int time, int tax) {
        this.id_train = id_train;
        this.train = train;
        this.id_route = id_route;
        this.time = time;
        this.tax = tax;
    }

    public Trains(String train, int id_route, int time, int tax) {
        this.train = train;
        this.id_route = id_route;
        this.time = time;
        this.tax = tax;
    }

    public Trains(int id_train) {
        this.id_train = id_train;
    }

    public Trains() {
    }

    public int getId_train() {
        return id_train;
    }

    public void setId_train(int id_train) {
        this.id_train = id_train;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public int getId_route() {
        return id_route;
    }

    public void setId_route(int id_route) {
        this.id_route = id_route;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

}
