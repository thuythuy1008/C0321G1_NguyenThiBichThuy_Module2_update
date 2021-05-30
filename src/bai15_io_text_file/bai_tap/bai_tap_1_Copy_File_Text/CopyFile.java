package bai15_io_text_file.bai_tap.bai_tap_1_Copy_File_Text;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(new File("src\\bai15_io_text_file\\bai_tap\\bai_tap_1_Copy_File_Text\\source.txt"));
            outputStream = new FileOutputStream(new File("src\\bai15_io_text_file\\bai_tap\\bai_tap_1_Copy_File_Text\\target.txt"));

            int length;
            byte[] temp = new byte[1024];

            while ((length = inputStream.read(temp)) > 0) {
                outputStream.write(temp, 0, length);
            }
            System.out.println("File đã được sao chép thành công!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}