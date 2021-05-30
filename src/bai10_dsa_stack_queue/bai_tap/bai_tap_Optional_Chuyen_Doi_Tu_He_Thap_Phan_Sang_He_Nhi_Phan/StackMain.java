package bai10_stack_queue.bai_tap.bai_tap_Optional_Chuyen_Doi_Tu_He_Thap_Phan_Sang_He_Nhi_Phan;

import java.util.Scanner;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack <Integer> stack = new Stack<>();
        System.out.println("Nhập vào một số thập phân: ");
        int num = in.nextInt();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num = num / 2;
        }
        System.out.println("Giá trị nhị phân là: ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop() + "\t");
        }
    }
}
