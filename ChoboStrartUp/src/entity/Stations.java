package entity;

public class Stations {
    private int id_station;
    private String station;
    private int distance;
    private int id_route;
    private String route;

    public Stations(int id_station, String station, int distance, int id_route, String route) {
        this.id_station = id_station;
        this.station = station;
        this.distance = distance;
        this.id_route = id_route;
        this.route = route;
    }

    public Stations(String station, int distance, int id_route, String route) {
        this.station = station;
        this.distance = distance;
        this.id_route = id_route;
        this.route = route;
    }

    public Stations(int id_station){
        this.id_station = id_station;
    }

    public Stations(){

    }


    public int getId_station() {
        return id_station;
    }

    public void setId_station(int id_station) {
        this.id_station = id_station;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getId_route() {
        return id_route;
    }

    public void setId_route(int id_route) {
        this.id_route = id_route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}

