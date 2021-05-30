package bai10_stack_queue.bai_tap.bai_tap_Optional_Kiem_Tra_Chuoi_Palindrome_Su_Dung_Queue;

import java.util.*;
import java.util.Queue;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String string = in.nextLine().toUpperCase();
        Queue queue = new LinkedList();
        Stack stack = new Stack();

        for (int i = 0; i < string.length(); i++) {
            stack.add(string.charAt(i));
        }
//        System.out.println(stack);

        for (int i = string.length() - 1; i >= 0; i--) {
            queue.add(string.charAt(i));
        }
//        System.out.println(queue);

        boolean check = true;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) != (((LinkedList) queue).get(i))) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Chuỗi là chuỗi đối xứng!!!");
        } else {
            System.out.println("Chuỗi không phải là chuỗi đối xứng!!!");
        }
    }
}
