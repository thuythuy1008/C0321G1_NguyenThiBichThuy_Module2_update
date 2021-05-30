package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TongCacSoODuongCheoChinhCuaMaTran {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của mảng ma trận vuông: ");
        size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhập phần tử thứ [" + i + " , " + j + " ]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int dem1 = 0;
        int dem2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    dem1 += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số ở đường chéo thứ nhất là: " + dem1);
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == arr.length - 1) {
                    dem2 += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số ở đường chéo thứ hai là: " + dem2);
    }
}
