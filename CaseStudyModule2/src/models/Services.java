package models;

public abstract class Services {
    String id;
    String serviceName;
    float acreageUser;
    int totalPrice;
    int totalPeople;
    int totalDate;

    public Services() {
    }

    public Services(String id, String serviceName, float acreageUser, int totalPrice, int totalPeople, int totalDate) {
        this.id = id;
        this.serviceName = serviceName;
        this.acreageUser = acreageUser;
        this.totalPrice = totalPrice;
        this.totalPeople = totalPeople;
        this.totalDate = totalDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getAcreageUser() {
        return acreageUser;
    }

    public void setAcreageUser(float acreage) {
        this.acreageUser = acreage;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(int totalPeople) {
        this.totalPeople = totalPeople;
    }

    public int getTotalDate() {
        return totalDate;
    }

    public void setTotalDate(int totalDate) {
        this.totalDate = totalDate;
    }

    @Override
    public String toString() {
        return id +
                "," + serviceName +
                "," + acreageUser +
                "," + totalPrice +
                "," + totalPeople +
                "," + totalDate;
    }

    public abstract String showInfor();
}
