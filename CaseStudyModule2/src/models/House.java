package models;

public class House extends Services {
    private String roomStandard;
    private String description;
    private int floors;

    public House() {
    }

    public House(String id, String serviceName, float acreageUser, int totalPrice, int totalPeople, int totalDate, String roomStandard, String description, int floors) {
        super(id, serviceName, acreageUser, totalPrice, totalPeople, totalDate);
        this.roomStandard = roomStandard;
        this.description = description;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + roomStandard +
                "," + description +
                "," + floors;
    }

    @Override
    public String showInfor() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", description='" + description + '\'' +
                ", floors=" + floors + '\'' +
                ", id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", acreageUser=" + acreageUser + '\'' +
                ", totalPrice=" + totalPrice + '\'' +
                ", totalPeople=" + totalPeople + '\'' +
                ", totalDate=" + totalDate + '\'' +
                '}';
    }
}
