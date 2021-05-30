package models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String id, String serviceName, String acreageUser, String totalPrice, String totalPeople, String totalDate, String freeService) {
        super(id, serviceName, acreageUser, totalPrice, totalPeople, totalDate);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + freeService;
    }

    @Override
    public String showInfor() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", acreageUser=" + acreageUser + '\'' +
                ", totalPrice=" + totalPrice + '\'' +
                ", totalPeople=" + totalPeople + '\'' +
                ", totalDate=" + totalDate + '\'' +
                '}';
    }
}
