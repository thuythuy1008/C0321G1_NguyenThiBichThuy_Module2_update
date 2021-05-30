package bai10_stack_queue.bai_tap.bai_tap_1_Dao_Nguoc_Phan_Tu_Su_Dung_Stack;

import java.util.Stack;

public class DaoNguocMangSoNguyen {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<>();
        for (int i = 1; i < 6; i++) {
            array.push(i);
        }
        System.out.println("Mảng ban đầu là: " + array);

        Stack<Integer> arrayReverse = new Stack<>();
        for (int i : array) {
            arrayReverse.push(i);
        }
        for (int i = 0; i < array.size(); i++) {
            array.set(i, arrayReverse.pop());
        }
        System.out.println("Mảng sau khi đảo ngược là: " + array);
    }
}
