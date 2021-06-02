package manager;

import commons.ValidateCustomer;
import commons.FuncWriteRead;
import commons.exception.CustomerException;
import models.ComparatorByNameCustomer;
import models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> listCustomer = new ArrayList();

    public void addNewCustomer() {
//        listCustomer = FuncWriteRead.readCustomerFromCSV("src\\data\\customer.csv");
        String nameCustomer = inputNameCustomer();
        String birthDay = inputBirthDay();
        String gender = inputGender();
        String identityCard = inputIdentityCard();
        String phoneNumber = inputPhoneNumber();
        String email = inputEmail();
        String customerType = inputCustomerType();
        String address = inputAddress();
        Customer customer = new Customer(nameCustomer, birthDay, gender, identityCard, phoneNumber, email, customerType, address);
        listCustomer.add(customer);
        FuncWriteRead.writeCustomerToCSV("src\\data\\customer.csv", listCustomer, true);
    }

    public static String inputNameCustomer() {
        String inputNameCustomer;
        while (true) {
            try {
                System.out.println("Nhập tên khách hàng: ");
                inputNameCustomer = scanner.nextLine();
                ValidateCustomer.validateName(inputNameCustomer);
                return inputNameCustomer;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputBirthDay() {
        String inputBirthDay;
        while (true) {
            try {
                System.out.println("Nhập ngày tháng năm sinh: ");
                inputBirthDay = scanner.nextLine();
                ValidateCustomer.validateBirthDay(inputBirthDay);
                return inputBirthDay;
            } catch (CustomerException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputGender() {
        String inputGender;
        while (true) {
            try {
                System.out.println("Nhập giới tính: ");
                inputGender = scanner.nextLine();
                ValidateCustomer.validateGender(inputGender);
                return inputGender;
            } catch (CustomerException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputIdentityCard() {
        String inputIdentityCard;
        while (true) {
            try {
                System.out.println("Nhập số CMND: ");
                inputIdentityCard = scanner.nextLine();
                ValidateCustomer.validateIdCard(inputIdentityCard);
                return inputIdentityCard;
            } catch (CustomerException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputPhoneNumber() {
        String inputPhoneNumber;
        while (true) {
            try {
                System.out.println("Nhập số điện thoại: ");
                inputPhoneNumber = scanner.nextLine();
                ValidateCustomer.validatePhoneNumber(inputPhoneNumber);
                return inputPhoneNumber;
            } catch (CustomerException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputEmail() {
        String inputEmail;
        while (true) {
            try {
                System.out.println("Nhập email: ");
                inputEmail = scanner.nextLine();
                ValidateCustomer.validateEmail(inputEmail);
                return inputEmail;
            } catch (CustomerException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputCustomerType() {
        String inputCustomerType;
        while (true) {
            try {
                System.out.println("Nhập loại khách hàng: ");
                inputCustomerType = scanner.nextLine();
                ValidateCustomer.validateCustomerType(inputCustomerType);
                return inputCustomerType;
            } catch (CustomerException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputAddress() {
        String inputAddress;
        while (true) {
            try {
                System.out.println("Nhập địa chỉ: ");
                inputAddress = scanner.nextLine();
                ValidateCustomer.validateAddress(inputAddress);
                return inputAddress;
            } catch (CustomerException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public void showInformationCustomers() {
        listCustomer = FuncWriteRead.readCustomerFromCSV("src\\data\\customer.csv");
        Collections.sort(listCustomer, new ComparatorByNameCustomer());
        int number = 1;
        for (Customer customer : listCustomer) {
            System.out.print(number++ + " ");
            System.out.println(customer.showInfor());
        }
    }
}
