package models;

public class Villa extends Services {
    private String roomStandard;
    private String description;
    private String swimmingPoolArea;
    private String floors;

    public Villa() {
    }

    public Villa(String id, String serviceName, String acreageUser, String totalPrice, String totalPeople, String totalDate, String roomStandard, String description, String swimmingPoolArea, String floors) {
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

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
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
