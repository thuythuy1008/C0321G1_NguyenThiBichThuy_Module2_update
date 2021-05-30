package bai16_io_binary_file_va_serialization.bai_tap.bai_tap_Optional_Copy_File_Nhi_Phan;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void copyFile(File source, File target) throws FileNotFoundException, IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        if (!source.exists()) {
            throw new FileNotFoundException("File không tồn tại!!!");
        } else {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File đã được sao chép thành công!!!");
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            String source = ("src\\bai16_io_binary_file_va_serialization\\bai_tap\\bai_tap_Optional_Copy_File_Nhi_Phan\\source.jpg");
            String target = ("src\\bai16_io_binary_file_va_serialization\\bai_tap\\bai_tap_Optional_Copy_File_Nhi_Phan\\target.jpg");
            File sourceFile = new File(source);
            File targetFile = new File(target);
            if (targetFile.exists()) {
                System.err.println("File đã tồn tại! Bạn có muốn ghi đè file không? \n" +
                        "1. Có \n" +
                        "2. Không \n");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        copyFile(sourceFile, targetFile);
                        System.exit(1);
                    case "2":
                        System.exit(1);
                }
            }
            copyFile(sourceFile, targetFile);
        } catch (FileNotFoundException e) {
            System.err.println("Ecxeption occured:" + e);
            System.out.println("Vui lòng chọn file!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
