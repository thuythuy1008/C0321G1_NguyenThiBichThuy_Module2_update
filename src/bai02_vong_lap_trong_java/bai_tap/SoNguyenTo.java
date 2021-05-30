package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        String s = " ";
        while (count < number) {
            int i;
            boolean check = true;
            for (i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                s += N + " ";
                count++;
            }
            N++;
        }
        System.out.println("Dãy gồm 20 số nguyên tố đầu tiên là:" + s);
    }
}
