package manager;

import commons.FuncWriteRead;
import commons.ValidateService;
import commons.exception.ServiceException;
import models.Room;

import java.util.*;

public class ManagerRoom {
    static Scanner scanner = new Scanner(System.in);
    static List<Room> listRoom = new ArrayList();

    public void addRoom() {
//        listRoom = FuncWriteRead.readRoomFromCSV("src\\data\\room.csv");
        System.out.println("Thêm Room!!! ");
        String id = inputIdRoom();
        String serviceName = ManagerServices.inputServiceName();
        String acreageUser = ManagerServices.inputAcreageUser();
        String totalPrice = ManagerServices.inputTotalPrice();
        String totalPeople = ManagerServices.inputTotalPeople();
        String totalDate = ManagerServices.inputTotalDate();
        String freeService = inputFreeService();
        Room room = new Room(id, serviceName, acreageUser, totalPrice, totalPeople, totalDate, freeService);
        listRoom.add(room);
        FuncWriteRead.writeRoomToCSV("src\\data\\room.csv", listRoom, true);
    }

    public static String inputIdRoom() {
        String inputIdRoom;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ: ");
                inputIdRoom = scanner.nextLine();
                ValidateService.validateIdRoom(inputIdRoom);
                return inputIdRoom;
            } catch (ServiceException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputFreeService() {
        String inputFreeService;
        while (true) {
            try {
                System.out.println("Nhập dịch vụ đi kèm: ");
                inputFreeService = scanner.nextLine();
                ValidateService.validateFreeService(inputFreeService);
                return inputFreeService;
            } catch (ServiceException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void showRoom() {
        listRoom = FuncWriteRead.readRoomFromCSV("src\\data\\room.csv");
        for (Room room : listRoom) {
            System.out.println(room.showInfor());
        }
    }

    public void showNameRoomNotDuplicate() {
        Set<String> set = new TreeSet<>();
        listRoom = FuncWriteRead.readRoomFromCSV("src\\data\\room.csv");
        for (Room room : listRoom) {
            set.add(room.getServiceName());
        }
        System.out.println(set);
    }
}
