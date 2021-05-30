package manager;

import commons.ValidateService;
import java.util.Scanner;

public class ManagerServices {
    static Scanner scanner = new Scanner(System.in);



    //    các chức năng quản lí CRUD
    public static String inputServiceName() {
        String inputServiceName;
        while (true) {
            try {
                System.out.println("Nhập tên dịch vụ: ");
                inputServiceName = scanner.nextLine();
                ValidateService.checkVerviceName(inputServiceName);
                return inputServiceName;
            } catch (ValidateService e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputAcreageUser() {
        String inputAcreageUser;
        while (true) {
            try {
                System.out.println("Diện tích sử dụng: ");
                inputAcreageUser = scanner.nextLine();
                ValidateService.checkAcreageUser(inputAcreageUser);
                return inputAcreageUser;
            } catch (ValidateService e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }
    public static String inputTotalPrice(){
        String inputTotalPrice;
        while (true) {
            try {
                System.out.println("Chi phí thuê: ");
                inputTotalPrice = scanner.nextLine();
                ValidateService.checkTotalPrice(inputTotalPrice);
                return inputTotalPrice;
            } catch (ValidateService e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputTotalPeople(){
        String inputTotalPeople;
        while (true) {
            try {
                System.out.println("Số lượng người tối đa: ");
                inputTotalPeople = scanner.nextLine();
                ValidateService.checkTotalPeople(inputTotalPeople);
                return inputTotalPeople;
            } catch (ValidateService e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputTotalDate(){
        String inputTotalDate;
        while (true) {
            try {
                System.out.println("Kiểu thuê: ");
                inputTotalDate = scanner.nextLine();
                ValidateService.checkTotalDate(inputTotalDate);
                return inputTotalDate;
            } catch (ValidateService e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputRoomStandard() {
        String inputRoomStandard;
        while (true) {
            try {
                System.out.println("Tiêu chuẩn phòng: ");
                inputRoomStandard = scanner.nextLine();
                ValidateService.checkRoomStandard(inputRoomStandard);
                return inputRoomStandard;
            } catch (ValidateService e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputDescription() {
        String inputDescription;
        while (true) {
            try {
                System.out.println("Mô tả tiện nghi: ");
                inputDescription = scanner.nextLine();
                ValidateService.checkDescription(inputDescription);
                return inputDescription;
            } catch (ValidateService e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputFloors() {
        String inputFloors;
        while (true) {
            try {
                System.out.println("Số tầng:");
                inputFloors = scanner.nextLine();
                ValidateService.checkFloors(inputFloors);
                return inputFloors;
            } catch (ValidateService e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }
}
