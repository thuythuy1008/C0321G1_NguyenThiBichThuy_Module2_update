package bai13_thuat_toan_sap_xep.bai_tap.bai_tap_2_Cai_Dat_Thuat_Toan_Sap_Xep_Chen;

public class InsertionSortAlgorithm {
    static int[] list = {22, 3, -10, 15, 0, 1, -2, 36, 4, 2};

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
