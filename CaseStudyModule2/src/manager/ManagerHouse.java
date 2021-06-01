package manager;

import commons.FuncWriteRead;
import commons.FormatServiceException;
import models.House;
import models.Villa;

import java.util.*;

public class ManagerHouse {
    static Scanner scanner = new Scanner(System.in);
    static List<House> listHouse = new ArrayList();

    public void addHouse() {
        System.out.println("Thêm House!!! ");
        String id = inputIdHouse();
        String serviceName = ManagerServices.inputServiceName();
        String acreageUser = ManagerServices.inputAcreageUser();
        String totalPrice = ManagerServices.inputTotalPrice();
        String totalPeople = ManagerServices.inputTotalPeople();
        String totalDate = ManagerServices.inputTotalDate();
        String roomStandard = ManagerServices.inputRoomStandard();
        String description = ManagerServices.inputDescription();
        String floors = ManagerServices.inputFloors();
        House house = new House(id, serviceName, acreageUser, totalPrice, totalPeople, totalDate, roomStandard, description, floors);
        listHouse.add(house);
        FuncWriteRead.writeHouseToCSV("src\\data\\house.csv", listHouse, true);
    }

    public static String inputIdHouse() {
        String inputIdHouse;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ: ");
                inputIdHouse = scanner.nextLine();
                FormatServiceException.checkIdHouse(inputIdHouse);
                return inputIdHouse;
            } catch (FormatServiceException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void showHouse() {
        listHouse = FuncWriteRead.readHouseFromCSV("src\\data\\house.csv");
        for (House house : listHouse) {
            System.out.println(house.showInfor());
        }
    }

    public void showNameHouseNotDuplicate() {
        Set<String> set = new TreeSet<>();
        listHouse = FuncWriteRead.readHouseFromCSV("src\\data\\house.csv");
        for (House house : listHouse) {
            set.add(house.getServiceName());
        }
        System.out.println(set);
    }
}
