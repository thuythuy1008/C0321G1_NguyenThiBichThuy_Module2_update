package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    int chieuDai;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập chiều dài");
                    chieuDai = scanner.nextInt();
                    int chieuRong;
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhập chiều rộng");
                    chieuRong = scanner1.nextInt();
                    for (int i = 0; i < chieuRong; i++) {
                        for (int j = 0; j < chieuDai; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;
                case 2:
                    int chonHinh = -1;
                    Scanner input1 = new Scanner(System.in);
                    while (chonHinh != 5) {
                        System.out.println("Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
                        System.out.println("1. top-left");
                        System.out.println("2. top-right");
                        System.out.println("3. botton-left");
                        System.out.println("4. botton-right");
                        System.out.println("5. Exit");
                        System.out.println("Nhập loại hình muốn vẽ");
                        chonHinh = input1.nextInt();
                        switch (chonHinh) {
                            case 1:
                                System.out.println("Print the square triangle: top-left");
                                int chieuCao1;
                                Scanner chieucao1 = new Scanner(System.in);
                                System.out.println("Nhập chiều cao");
                                chieuCao1 = chieucao1.nextInt();
                                for (int i = 0; i < chieuCao1; i++) {
                                    for (int j = 0; j < chieuCao1; j++) {
                                        if (i <= j) {
                                            System.out.print("*");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                System.out.println("Print the square triangle: top-right");
                                int chieuCao2;
                                Scanner chieucao2 = new Scanner(System.in);
                                System.out.println("Nhập chiều cao");
                                chieuCao2 = chieucao2.nextInt();
                                for (int i = 0; i <= chieuCao2; i++) {
                                    for (int j = 0; j <= chieuCao2; j++) {
                                        if (i >= j) {
                                            System.out.print(" ");
                                        } else {
                                            System.out.print("*");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                System.out.println("Print the square triangle: botton-left");
                                int chieuCao3;
                                Scanner chieucao3 = new Scanner(System.in);
                                System.out.println("Nhập chiều cao");
                                chieuCao3 = chieucao3.nextInt();
                                for (int i = 0; i < chieuCao3; i++) {
                                    for (int j = 0; j < chieuCao3; j++) {
                                        if (i >= j) {
                                            System.out.print("*");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                System.out.println("Print the square triangle: botton-right");
                                int chieuCao4;
                                Scanner chieucao4 = new Scanner(System.in);
                                System.out.println("Nhập chiều cao");
                                chieuCao4 = chieucao4.nextInt();
                                for (int i = 0; i <= chieuCao4; i++) {
                                    for (int j = 0; j <= chieuCao4; j++) {
                                        if (j <= chieuCao4 - i) {
                                            System.out.print(" ");
                                        } else {
                                            System.out.print("*");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            case 5:
                                System.exit(5);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    int chieuCao5;
                    Scanner chieucao5 = new Scanner(System.in);
                    System.out.println("Nhập chiều cao");
                    chieuCao5 = chieucao5.nextInt();
                    for (int i = 1; i <= chieuCao5 * 2 - 1; i++) {
                        for (int j = 1; j <= i; j++) {
                            if (j <= chieuCao5 * 2 - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
