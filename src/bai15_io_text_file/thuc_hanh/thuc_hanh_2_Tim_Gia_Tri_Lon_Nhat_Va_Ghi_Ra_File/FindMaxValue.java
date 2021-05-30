package bai15_io_text_file.thuc_hanh.thuc_hanh_2_Tim_Gia_Tri_Lon_Nhat_Va_Ghi_Ra_File;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\bai15_io_text_file\\thuc_hanh\\thuc_hanh_2_Tim_Gia_Tri_Lon_Nhat_Va_Ghi_Ra_File\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src\\bai15_io_text_file\\thuc_hanh\\thuc_hanh_2_Tim_Gia_Tri_Lon_Nhat_Va_Ghi_Ra_File\\result.txt", maxValue);
    }
}
