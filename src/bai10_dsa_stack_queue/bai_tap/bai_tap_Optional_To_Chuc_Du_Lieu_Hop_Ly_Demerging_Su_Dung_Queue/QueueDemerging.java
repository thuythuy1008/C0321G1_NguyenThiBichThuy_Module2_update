package bai10_stack_queue.bai_tap.bai_tap_Optional_To_Chuc_Du_Lieu_Hop_Ly_Demerging_Su_Dung_Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class QueueDemerging {
    public static void main(String[] args) {
        ArrayList<Personnel> personnels = new ArrayList<>();
        ArrayList<Personnel> listSort = new ArrayList<>();

        personnels.add(new Personnel("Nguyễn Văn A", "10/04/1994", "Nam"));
        personnels.add(new Personnel("Huỳnh Thị B", "20/07/1992", "Nữ"));
        personnels.add(new Personnel("Võ Văn C", "01/12/1997", "Nam"));
        personnels.add(new Personnel("Hồ Thị D", "05/10/1994", "Nữ"));
        personnels.add(new Personnel("Trần Văn E", "30/01/1995", "Nam"));

        System.out.println("Danh sách ban đầu: ");
        for (Personnel personnel : personnels) {
            System.out.println(personnel);
        }

        System.out.println("Danh sách sau khi sắp xếp theo ngày tháng năm sinh: ");
        Collections.sort(personnels);
        for (Personnel personnel : personnels) {
            System.out.println(personnel);
        }

        Queue<Personnel> male = new ArrayDeque();
        Queue<Personnel> female = new ArrayDeque();
        for (Personnel personnel : personnels) {
            if (personnel.getGender().equals("Nam")) {
                male.add(personnel);
            } else {
                female.add(personnel);
            }
        }

        while (!female.isEmpty()) {
            listSort.add(female.poll());
        }
        while (!male.isEmpty()) {
            listSort.add(male.poll());
        }

        System.out.println("Danh sách sắp xếp theo ngày tháng năm sinh và giới tính: ");
        for (Personnel personnel : listSort) {
            System.out.println(personnel.toString());
        }
    }
}
