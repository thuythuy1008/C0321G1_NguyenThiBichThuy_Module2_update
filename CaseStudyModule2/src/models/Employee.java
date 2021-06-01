package models;

public class Employee {
    private String nameEmployee;
    private String ageEmployee;
    private String adress;

    public Employee() {
    }

    public Employee(String nameEmployee, String ageEmployee, String adress) {
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.adress = adress;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(String ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return nameEmployee +
                ", " + ageEmployee +
                ", " + adress;
    }

    public String showInfor() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", ageEmployee='" + ageEmployee + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
