package models;

public abstract class Services {
    String id;
    String serviceName;
    String acreageUser;
    String totalPrice;
    String totalPeople;
    String totalDate;

    public Services() {
    }

    public Services(String id, String serviceName, String acreageUser, String totalPrice, String totalPeople, String totalDate) {
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

    public String getAcreageUser() {
        return acreageUser;
    }

    public void setAcreageUser(String acreage) {
        this.acreageUser = acreage;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(String totalPeople) {
        this.totalPeople = totalPeople;
    }

    public String getTotalDate() {
        return totalDate;
    }

    public void setTotalDate(String totalDate) {
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
