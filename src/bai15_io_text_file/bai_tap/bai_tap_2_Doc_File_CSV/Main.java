package bai15_io_text_file.bai_tap.bai_tap_2_Doc_File_CSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\bai15_io_text_file\\bai_tap\\bai_tap_2_Doc_File_CSV\\countries.csv"));

            while ((line = bufferedReader.readLine()) != null) {
                display(readLine(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readLine(String line) {
        List<String> listCountry = new ArrayList<>();
        if (line != null) {
            String[] strings = line.split(",");
            for (int i = 0; i < strings.length; i++) {
                listCountry.add(strings[i]);
            }
        }
        return listCountry;
    }

    private static void display(List<String> country) {
        System.out.println(
                "Đất nước [Mã : " + country.get(0)
                        + ", Tên viết tắt : " + country.get(1)
                        + " , Tên đất nước : " + country.get(2)
                        + "]");
    }
}
