package bai1_introduction_to_java.bai_tap;

import org.omg.CosNaming.BindingIterator;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int so = scanner.nextInt();
        String chu;
        String chu2;
        if (0 <= so && so < 10) {

            switch (so) {
                case 0:
                    chu = "Zero";
                    break;
                case 1:
                    chu = "One";
                    break;
                case 2:
                    chu = "Two";
                    break;
                case 3:
                    chu = "Three";
                    break;
                case 4:
                    chu = "Four";
                    break;
                case 5:
                    chu = "Five";
                    break;
                case 6:
                    chu = "Six";
                    break;
                case 7:
                    chu = "Seven";
                    break;
                case 8:
                    chu = "Eight";
                    break;
                case 9:
                    chu = "Nine";
                    break;
                default:
                    chu = "Ngoài khả năng";
                    break;
            }

            if (!chu.equals("Ngoài khả năng")) System.out.printf("Đọc thành chữ là: %s ", chu);
            else System.out.print("Ngoài khả năng!");
        } else if (so < 20) {
            int so1 = so % 10;

            switch (so1) {
                case 0:
                    chu2 = "Ten";
                    break;
                case 1:
                    chu2 = "Eleven";
                    break;
                case 2:
                    chu2 = "Twelve";
                    break;
                case 3:
                    chu2 = "Thirteen";
                    break;
                case 4:
                    chu2 = "Fourteen";
                    break;
                case 5:
                    chu2 = "Fifteen";
                    break;
                case 6:
                    chu2 = "Sixteen";
                    break;
                case 7:
                    chu2 = "Seventeen";
                    break;
                case 8:
                    chu2 = "Eightteen";
                    break;
                case 9:
                    chu2 = "Nineteen";
                    break;
                default:
                    chu2 = "Ngoài khả năng";
                    break;
            }
            if (!chu2.equals("Ngoài khả năng")) System.out.printf("Đọc thành chữ là: %s ", chu2);
            else System.out.print("Ngoài khả năng!");
        } else if (so < 100) {
            int so2 = so / 10;
            int so3 = so % 10;
            String chu3;
            String chu4;

            switch (so2) {
                case 2:
                    chu3 = "Twenty";
                    break;
                case 3:
                    chu3 = "Thurty";
                    break;
                case 4:
                    chu3 = "Fourty";
                    break;
                case 5:
                    chu3 = "Fifty";
                    break;
                case 6:
                    chu3 = "Sixty";
                    break;
                case 7:
                    chu3 = "Seventy";
                    break;
                case 8:
                    chu3 = "Eightty";
                    break;
                case 9:
                    chu3 = "Ninety";
                    break;
                default:
                    chu3 = "Ngoài khả năng";
                    break;
            }

            switch (so3) {
                case 0:
                    chu4 = "";
                    break;
                case 1:
                    chu4 = "One";
                    break;
                case 2:
                    chu4 = "Two";
                    break;
                case 3:
                    chu4 = "Three";
                    break;
                case 4:
                    chu4 = "Four";
                    break;
                case 5:
                    chu4 = "Five";
                    break;
                case 6:
                    chu4 = "Six";
                    break;
                case 7:
                    chu4 = "Seven";
                    break;
                case 8:
                    chu4 = "Eight";
                    break;
                case 9:
                    chu4 = "Nine";
                    break;
                default:
                    chu4 = "Ngoài khả năng";
                    break;
            }
            if (!chu3.equals("Ngoài khả năng") && (!chu4.equals("Ngoài khả năng")))
                System.out.printf("Đọc thành chữ là: %s %s", chu3, chu4);
            else System.out.print("Ngoài khả năng!");
        } else {
            int so4 = so / 100;
            int so5 = (so % 100) / 10;
            int so6 = (so % 100) % 10;
            String chu5;
            String chu6;
            String chu7;
            String chu8;

            switch (so4) {
                case 1:
                    chu5 = "One hundred";
                    break;
                case 2:
                    chu5 = "Two hundred";
                    break;
                case 3:
                    chu5 = "Three hundred";
                    break;
                case 4:
                    chu5 = "Four hundred";
                    break;
                case 5:
                    chu5 = "Five hundred";
                    break;
                case 6:
                    chu5 = "Six hundred";
                    break;
                case 7:
                    chu5 = "Seven hundred";
                    break;
                case 8:
                    chu5 = "Eight hundred";
                    break;
                case 9:
                    chu5 = "Nine hundred";
                    break;
                default:
                    chu5 = "Ngoài khả năng";
                    break;
            }

            switch (so5) {
                case 0:
                    chu6 = "";
                    break;

                case 2:
                    chu6 = "Twenty";
                    break;
                case 3:
                    chu6 = "Thurty";
                    break;
                case 4:
                    chu6 = "Fourty";
                    break;
                case 5:
                    chu6 = "Fifty";
                    break;
                case 6:
                    chu6 = "Sixty";
                    break;
                case 7:
                    chu6 = "Seventy";
                    break;
                case 8:
                    chu6 = "Eightty";
                    break;
                case 9:
                    chu6 = "Ninety";
                    break;
                default:
                    chu6 = "Ngoài khả năng";
                    break;
            }

            switch (so6) {
                case 0:
                    chu7 = "";
                    break;
                case 1:
                    chu7 = "One";
                    break;
                case 2:
                    chu7 = "Two";
                    break;
                case 3:
                    chu7 = "Three";
                    break;
                case 4:
                    chu7 = "Four";
                    break;
                case 5:
                    chu7 = "Five";
                    break;
                case 6:
                    chu7 = "Six";
                    break;
                case 7:
                    chu7 = "Seven";
                    break;
                case 8:
                    chu7 = "Eight";
                    break;
                case 9:
                    chu7 = "Nine";
                    break;
                default:
                    chu7 = "Ngoài khả năng";
                    break;
            }
            if (!chu5.equals("Ngoài khả năng") && (!chu6.equals("Ngoài khả năng")) && (!chu7.equals("Ngoài khả năng"))) {
                if (chu6 == "" && chu7 == "") {
                    System.out.printf("Đọc thành chữ là: %s", chu5);
                } else {
                    System.out.printf("Đọc thành chữ là: %s and %s %s", chu5, chu6, chu7);
                }
            }

            switch (so5) {
                case 1:
                    switch (so6) {
                        case 0:
                            chu8 = "Ten";
                            break;
                        case 1:
                            chu8 = "Eleven";
                            break;
                        case 2:
                            chu8 = "Twelve";
                            break;
                        case 3:
                            chu8 = "Thirteen";
                            break;
                        case 4:
                            chu8 = "Fourteen";
                            break;
                        case 5:
                            chu8 = "Fifteen";
                            break;
                        case 6:
                            chu8 = "Sixteen";
                            break;
                        case 7:
                            chu8 = "Seventeen";
                            break;
                        case 8:
                            chu8 = "Eightteen";
                            break;
                        case 9:
                            chu8 = "Nineteen";
                            break;
                        default:
                            chu8 = "Ngoài khả năng";
                            break;
                    }
                    break;
                default:
                    chu8 = "Ngoài khả năng";
                    break;
            }
            if (!chu5.equals("Ngoài khả năng") && (!chu8.equals("Ngoài khả năng")))
                System.out.printf("Đọc thành chữ là: %s and %s", chu5, chu8);

        }

    }
}
