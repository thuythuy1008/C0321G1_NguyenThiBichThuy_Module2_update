package manager;

import commons.FuncWriteRead;
import commons.ValidateService;
import models.House;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println(listHouse);
        FuncWriteRead.writeHouseToCSV("src\\data\\House.csv", listHouse, true);
    }

    public static String inputIdHouse() {
        String inputIdHouse;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ: ");
                inputIdHouse = scanner.nextLine();
                ValidateService.checkIdHouse(inputIdHouse);
                return inputIdHouse;
            } catch (ValidateService e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public void showHouse() {
        listHouse = FuncWriteRead.readHouseFromCSV("src\\data\\House.csv");
        for (House house : listHouse) {
            System.out.println(house.showInfor());
        }
    }
}
