package bai15_io_text_file.thuc_hanh.thuc_hanh_1_Tinh_Tong_Cac_So_Trong_File_Text;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
//        System.out.println("Nhập đường dẫn file: ");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();

        String path = "src\\bai15_io_text_file\\thuc_hanh\\thuc_hanh_1_Tinh_Tong_Cac_So_Trong_File_Text\\text.txt";
//        String path ="src\\bai15_io_text_file\\thuc_hanh\\thuc_hanh_1_Tinh_Tong_Cac_So_Trong_File_Text\\text1.txt";

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
