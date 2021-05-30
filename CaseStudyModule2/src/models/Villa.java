package models;

public class Villa extends Services {
    private String roomStandard;
    private String description;
    private float swimmingPoolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String id, String serviceName, float acreageUser, int totalPrice, int totalPeople, int totalDate, String roomStandard, String description, float swimmingPoolArea, int floors) {
        super(id, serviceName, acreageUser, totalPrice, totalPeople, totalDate);
        this.roomStandard = roomStandard;
        this.description = description;
        this.swimmingPoolArea = swimmingPoolArea;
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

    public float getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(float swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
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
                "," + swimmingPoolArea +
                "," + floors;
    }

    @Override
    public String showInfor() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", description='" + description + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea + '\'' +
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
