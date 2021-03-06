package manager;

import commons.FuncWriteRead;
import commons.ValidateService;
import commons.exception.ServiceException;
import models.Villa;

import java.util.*;

public class ManagerVilla {
    static Scanner scanner = new Scanner(System.in);
    static List<Villa> listVilla = new ArrayList();

    public void addVilla() {
//        listVilla = FuncWriteRead.readVillaFromCSV("src\\data\\Villa.csv");
        System.out.println("Thêm Villa!!! ");
        String id = inputIdVilla();
        String serviceName = ManagerServices.inputServiceName();
        String acreageUser = ManagerServices.inputAcreageUser();
        String totalPrice = ManagerServices.inputTotalPrice();
        String totalPeople = ManagerServices.inputTotalPeople();
        String totalDate = ManagerServices.inputTotalDate();
        String roomStandard = ManagerServices.inputRoomStandard();
        String description = ManagerServices.inputDescription();
        String swimmingPoolArea = inputSwimmingPoolArea();
        String floors = ManagerServices.inputFloors();
        Villa villa = new Villa(id, serviceName, acreageUser, totalPrice, totalPeople, totalDate, roomStandard, description, swimmingPoolArea, floors);
        listVilla.add(villa);
        FuncWriteRead.writeVillaToCSV("src\\data\\Villa.csv", listVilla, true);
    }

    public static String inputIdVilla() {
        String inputIdVilla;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ: ");
                inputIdVilla = scanner.nextLine();
                ValidateService.validateIdVilla(inputIdVilla);
                return inputIdVilla;
            } catch (ServiceException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputSwimmingPoolArea() {
        String inputSwimmingPoolArea;
        while (true) {
            try {
                System.out.println("Diện tích hồ bơi: ");
                inputSwimmingPoolArea = scanner.nextLine();
                ValidateService.validateSwimmingPoolArea(inputSwimmingPoolArea);
                return inputSwimmingPoolArea;
            } catch (ServiceException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void showVilla() {
        listVilla = FuncWriteRead.readVillaFromCSV("src\\data\\Villa.csv");
        for (Villa villa : listVilla) {
            System.out.println(villa.showInfor());
        }
    }

    public void showNameVillaNotDuplicate() {
        Set<String> set = new TreeSet<>();
        listVilla = FuncWriteRead.readVillaFromCSV("src\\data\\Villa.csv");
        for (Villa villa : listVilla) {
            set.add(villa.getServiceName());
        }
        System.out.println(set);
    }
}
