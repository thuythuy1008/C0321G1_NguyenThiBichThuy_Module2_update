package bai10_stack_queue.bai_tap.bai_tap_Optional_Kiem_Tra_Dau_Ngoac_Su_Dung_Stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static boolean checkBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            } else if (sym == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String string = in.nextLine();
        System.out.println(checkBracket(string));

//        String string = "s * (s – a) * (s – b) * (s – c)";
//        String string1 = "(– b + (b2 – 4*a*c)^0.5) / 2*a ";
//        String string2 = "s * (s – a) * (s – b * (s – c)";
//        String string3= "s * (s – a) * s – b) * (s – c)";
//        String string4 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
//        System.out.println(checkBracket(string));
//        System.out.println(checkBracket(string1));
//        System.out.println(checkBracket(string2));
//        System.out.println(checkBracket(string3));
//        System.out.println(checkBracket(string4));
    }
}
