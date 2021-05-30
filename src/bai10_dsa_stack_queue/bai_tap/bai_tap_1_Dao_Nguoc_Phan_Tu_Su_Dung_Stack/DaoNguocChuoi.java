package bai10_stack_queue.bai_tap.bai_tap_1_Dao_Nguoc_Phan_Tu_Su_Dung_Stack;

import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        String string = "Mỗi ngày đến trường là một ngày vui";
        String[] stringArr = string.split(" ");
        System.out.println("Chuỗi ban đầu là: " + string);

        Stack<String> stringReverse = new Stack<>();
        for (String i : stringArr) {
            stringReverse.push(i);
        }
        string = "";
        while (!stringReverse.isEmpty()) {
            string += stringReverse.pop() + " ";
        }
        System.out.println("Chuỗi sau khi đảo ngược là: " + string);
    }
}
