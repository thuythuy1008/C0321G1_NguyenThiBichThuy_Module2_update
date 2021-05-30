package controllers;

import manager.ManagerHouse;
import manager.ManagerRoom;
import manager.ManagerVilla;

import java.util.Scanner;

public class MainController {
    //    static ManagerServices managerServices=new ManagerServices();
    static ManagerVilla managerVilla = new ManagerVilla();
    static ManagerRoom managerRoom = new ManagerRoom();
    static ManagerHouse managerHouse = new ManagerHouse();

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
//        menu tùy chọn chức năng
        while (true) {
            System.out.println("Chọn 1 trong các chức năng trong Menu: \n" +
                    "1. Add New Services \n" +
                    "2. Show Services \n" +
                    "3. Add New Customer \n " +
                    "4. Show Information of Customer \n" +
                    "5. Add New Booking \n" +
                    "6. Show Information of Employee \n" +
                    "7. Exit");
            Scanner input = new Scanner(System.in);
            int chooseService = Integer.parseInt(input.nextLine());
            switch (chooseService) {
                case 1:
                    addNewServies();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Chức năng bạn chọn không có trong menu.Vui lòng chọn lại!!!");
            }
        }
    }

    private static void addNewServies() {
        while (true) {
            System.out.println("Chọn 1 trong các chức năng trong Menu: \n" +
                    "1. Add New Villa \n" +
                    "2. Add New House \n" +
                    "3. Add New Room \n " +
                    "4. Back to menu \n" +
                    "5. Exit \n");

            Scanner input = new Scanner(System.in);
            int chooseService = Integer.parseInt(input.nextLine());
            switch (chooseService) {
                case 1:
                    managerVilla.addVilla();
                    break;
                case 2:
                    managerRoom.addRoom();
                    break;
                case 3:
                    managerHouse.addHouse();
                    break;
                case 4:
                    displayMainMenu();
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Chức năng bạn chọn không có trong menu.Vui lòng chọn lại!!!");
            }
        }
    }

    private static void showServices() {
        while (true) {
            System.out.println("Chọn 1 trong các chức năng trong Menu: \n" +
                    "1. Show all Villa \n" +
                    "2. Show all House \n" +
                    "3. Show all Room \n " +
                    "4. Show All Name Villa Not Duplicate \n" +
                    "5. Show All Name House Not Duplicate \n" +
                    "6. Show All Name Name Not Duplicate \n" +
                    "7. Back to menu \n" +
                    "8. Exit");
            Scanner input = new Scanner(System.in);
            int chooseService = Integer.parseInt(input.nextLine());
            switch (chooseService) {
                case 1:
                    managerVilla.showVilla();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    displayMainMenu();
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Chức năng bạn chọn không có trong menu.Vui lòng chọn lại!!!");
            }
        }
    }
}
