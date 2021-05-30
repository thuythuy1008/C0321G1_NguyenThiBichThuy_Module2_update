package manager;

import commons.FormatServiceException;
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
                FormatServiceException.checkVerviceName(inputServiceName);
                return inputServiceName;
            } catch (FormatServiceException e) {
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
                FormatServiceException.checkAcreageUser(inputAcreageUser);
                return inputAcreageUser;
            } catch (FormatServiceException e) {
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
                FormatServiceException.checkTotalPrice(inputTotalPrice);
                return inputTotalPrice;
            } catch (FormatServiceException e) {
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
                FormatServiceException.checkTotalPeople(inputTotalPeople);
                return inputTotalPeople;
            } catch (FormatServiceException e) {
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
                FormatServiceException.checkTotalDate(inputTotalDate);
                return inputTotalDate;
            } catch (FormatServiceException e) {
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
                FormatServiceException.checkRoomStandard(inputRoomStandard);
                return inputRoomStandard;
            } catch (FormatServiceException e) {
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
                FormatServiceException.checkDescription(inputDescription);
                return inputDescription;
            } catch (FormatServiceException e) {
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
                FormatServiceException.checkFloors(inputFloors);
                return inputFloors;
            } catch (FormatServiceException e) {
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }
}
