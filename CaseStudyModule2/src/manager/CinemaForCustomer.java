package manager;

import commons.FuncWriteRead;
import controllers.MainController;
import models.Customer;

import java.util.*;

public class CinemaForCustomer {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> listCustomer = new ArrayList();
    static Queue<String> queue = new ArrayDeque<>();

    public void cinema4D() {
        listCustomer = FuncWriteRead.readCustomerFromCSV("src\\data\\customer.csv");
        System.out.println("Chào mừng quý khách đã đến rạp chiều phim của Furama!!! \n" +
                "Số vé xem phim hôm nay là 10 vé!");
        int number = 10;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (queue.size() != number) {
                System.out.println("Bạn có muốn mua vé xem phim không??? \n" +
                        "1. Có \n" +
                        "2. Không \n");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        queue.add(listCustomer.get(i).getNameCustomer());
                        System.out.println("Bạn đã mua được vé xem phim! Số vé còn lại là: " + (number - queue.size()));
                        break;
                    case 2:
                        queue.clear();
                        MainController.displayMainMenu();
                        break;
                    default:
                        System.out.println("Vui lòng chọn 1 hoặc 2!!!");
                }
            }
        }
        if ((number - queue.size()) == 0) {
            System.out.println("Vé hôm nay đã được bán hết!!! Cảm ơn quý khách!");
        }
        System.out.println("Danh sách khách hàng đã mua vé hôm nay: ");
        int seats = 1;
        for (String string : queue) {
            System.out.println("Khách hàng " + string + " có số ghế ngồi là " + seats++);
        }
    }
}
