package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiên USD!");
        usd=scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Giá trị VND: " +quydoi );
    }
}
