package bai12_thuat_toan_tim_kiem.bai_tap.bai_tap_Optional_Thuat_Toan_Tim_Kiem_Nhi_Phan_Su_Dung_De_Quy;

public class Binary {
    static int binarySearch(int arr[], int left, int right, int x) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return binarySearch(arr, 0, mid - 1, x);
            } else {
                return binarySearch(arr, mid + 1, right, x);
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 4));
    }
}
