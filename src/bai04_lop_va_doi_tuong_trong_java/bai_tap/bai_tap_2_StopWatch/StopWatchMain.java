package bai4_lop_va_doi_tuong_trong_java.bai_tap.bai_tap_2_StopWatch;

import java.time.LocalTime;

public class StopWatchMain {
    public static int[] selectionSort(int... a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Time: " + stopWatch.getElapsedTime());
    }
}
