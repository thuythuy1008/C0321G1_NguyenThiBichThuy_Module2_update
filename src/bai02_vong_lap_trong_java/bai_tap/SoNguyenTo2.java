package bai2_vong_lap_trong_java.bai_tap;

public class SoNguyenTo2 {
    public static void main(String[] args) {
        String soNT = " ";
        boolean check = true;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                soNT += i + " ";
            }
        }
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: " + soNT);
    }
}
