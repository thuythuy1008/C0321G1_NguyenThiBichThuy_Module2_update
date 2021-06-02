package manager;

import commons.FuncWriteRead;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerBooking {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> listCustomer = new ArrayList();
    static List<Villa> listVilla = new ArrayList();
    static List<House> listHouse = new ArrayList();
    static List<Room> listRoom = new ArrayList();
    static ManagerCustomer managerCustomer = new ManagerCustomer();
    static ManagerVilla managerVilla = new ManagerVilla();
    static ManagerRoom managerRoom = new ManagerRoom();
    static ManagerHouse managerHouse = new ManagerHouse();

    public void addNewBooking() {
        managerCustomer.showInformationCustomers();
        listCustomer = FuncWriteRead.readCustomerFromCSV("src\\data\\customer.csv");
        boolean check = true;
        String id;
        String line = null;
        try {
            System.out.println("Chọn số thứ tự của khách hàng muốn đặt dịch vụ!");

            int choose = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < listCustomer.size(); i++) {
                if (i == choose - 1) {
                    line = listCustomer.get(i).getNameCustomer();
                    check = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (check) {
            System.out.println("Chọn dịch vụ mà bạn muốn đặt lịch: \n" +
                    "1. Booking Villa \n" +
                    "2. Booking House \n" +
                    "3. Booking Room \n" +
                    "4. Exit");
            Scanner input = new Scanner(System.in);
            int chooseService = Integer.parseInt(input.nextLine());
            switch (chooseService) {
                case 1:
                    managerVilla.showVilla();
                    System.out.println("Nhập mã Villa muốn đặt lịch!");
                    id = scanner.nextLine();
                    listVilla = FuncWriteRead.readVillaFromCSV("src\\data\\villa.csv");
                    for (Villa villa : listVilla) {
                        if (id.equals(villa.getId())) {
                            line = line + "," + villa.getId();
                            System.out.println(line);
                            FuncWriteRead.writeBookingServiceToCSV("src\\data\\booking.csv", line, true);
                        }
                    }
                    break;
                case 2:
                    managerHouse.showHouse();
                    System.out.println("Nhập mã House muốn đặt lịch!");
                    id = scanner.nextLine();
                    listHouse = FuncWriteRead.readHouseFromCSV("src\\data\\house.csv");
                    for (House house : listHouse) {
                        if (id.equals(house.getId())) {
                            line = line + "," + house.getId();
                            System.out.println(line);
                            FuncWriteRead.writeBookingServiceToCSV("src\\data\\booking.csv", line, true);
                        }
                    }
                    break;
                case 3:
                    managerRoom.showRoom();
                    System.out.println("Nhập mã Room muốn đặt lịch!");
                    id = scanner.nextLine();
                    listRoom = FuncWriteRead.readRoomFromCSV("src\\data\\room.csv");
                    for (Room room : listRoom) {
                        if (id.equals(room.getId())) {
                            line = line + "," + room.getId();
                            System.out.println(line);
                            FuncWriteRead.writeBookingServiceToCSV("src\\data\\booking.csv", line, true);
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

