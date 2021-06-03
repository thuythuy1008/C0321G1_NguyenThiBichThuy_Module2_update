package manager;

import commons.FuncWriteRead;
import controllers.MainController;
import models.CinemaTicket;
import models.Customer;

import java.util.*;

public class CinemaForCustomer {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> listCustomer = new ArrayList();
    static Queue<String> queue = new ArrayDeque<>();
    static List<CinemaTicket> cinemaTicketList = new ArrayList();

    public void addCinemaTicket() {
        CinemaTicket cinemaTicket1 = new CinemaTicket(1, "Lật mặt");
        cinemaTicketList.add(cinemaTicket1);
        CinemaTicket cinemaTicket2 = new CinemaTicket(2, "Lật mặt");
        cinemaTicketList.add(cinemaTicket2);
        CinemaTicket cinemaTicket3 = new CinemaTicket(3, "Lật mặt");
        cinemaTicketList.add(cinemaTicket3);
        CinemaTicket cinemaTicket4 = new CinemaTicket(4, "Lật mặt");
        cinemaTicketList.add(cinemaTicket4);
        CinemaTicket cinemaTicket5 = new CinemaTicket(5, "Lật mặt");
        cinemaTicketList.add(cinemaTicket5);
        CinemaTicket cinemaTicket6 = new CinemaTicket(6, "Lật mặt");
        cinemaTicketList.add(cinemaTicket6);
        CinemaTicket cinemaTicket7 = new CinemaTicket(7, "Lật mặt");
        cinemaTicketList.add(cinemaTicket7);
        CinemaTicket cinemaTicket8 = new CinemaTicket(8, "Lật mặt");
        cinemaTicketList.add(cinemaTicket8);
        CinemaTicket cinemaTicket9 = new CinemaTicket(9, "Lật mặt");
        cinemaTicketList.add(cinemaTicket9);
        CinemaTicket cinemaTicket10 = new CinemaTicket(10, "Lật mặt");
        cinemaTicketList.add(cinemaTicket10);
        FuncWriteRead.writeCinemaTicketToCSV("src\\data\\cinemaTicket.csv", cinemaTicketList, true);
        cinema4D();
    }

    public void cinema4D() {
        System.out.println("Chào mừng quý khách đã đến rạp chiều phim của Furama!!! \n" +
                "Số vé xem phim hôm nay là 10 vé!");
        int number = 10;
        String line = null;
        boolean check = true;
        for (int i = 0; i < cinemaTicketList.size(); i++) {
            line = cinemaTicketList.get(i).toString();
            check = true;
            if (check) {
                try {
                    if (queue.size() != number) {
                        System.out.println("Bạn là khách hàng nào: \n" +
                                "1. Khách hàng đang thuê dịch vụ trong Furama \n" +
                                "2. Khách hàng bên ngoài");
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                boolean yes = true;
                                listCustomer = FuncWriteRead.readCustomerFromCSV("src\\data\\customer.csv");
                                System.out.println("Tên của quý khách là gì?");
                                String nameCustomer = scanner.nextLine();
                                for (Customer customer : listCustomer) {
                                    if (nameCustomer.equals(customer.getNameCustomer())) {
                                        line = customer.getNameCustomer() + "," + line;
                                        queue.add(line);
                                        System.out.println("Bạn đã mua được vé xem phim! Số vé còn lại là: " + (number - queue.size()));
                                        yes = false;
                                    }
                                }
                                if (yes) {
                                    System.out.println("Bạn không có tên trong danh sách khách hàng đang thuê dịch vụ tại Furama! Mời bạn chọn lại!!!");
                                    cinema4D();
                                }
                                break;
                            case 2:
                                System.out.println("Tên của quý khách là gì?");
                                String nameCustomer1 = scanner.nextLine();
                                line = nameCustomer1 + "," + line;
                                queue.add(line);
                                System.out.println("Bạn đã mua được vé xem phim! Số vé còn lại là: " + (number - queue.size()));
                                break;
                            default:
                                System.out.println("Vui lòng chọn 1 hoặc 2!!!");
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }
        }
        if ((queue.size() == number)) {
            System.out.println("Vé hôm nay đã được bán hết!!! Cảm ơn quý khách!");
        }
        System.out.println("Danh sách khách hàng đã mua vé hôm nay: ");
        int seats = 1;
        for (String string : queue) {
            System.out.println("Khách hàng " + string + " có số ghế ngồi là " + seats++);
        }
        MainController.displayMainMenu();
    }
}
