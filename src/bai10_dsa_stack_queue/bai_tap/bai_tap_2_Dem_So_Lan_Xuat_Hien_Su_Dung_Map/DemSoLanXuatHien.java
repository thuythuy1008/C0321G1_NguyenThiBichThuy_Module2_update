package bai10_stack_queue.bai_tap.bai_tap_2_Dem_So_Lan_Xuat_Hien_Su_Dung_Map;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String string = "Tôi tên là Anh và tôi 18 tuổi " + "     Bố tôi tên là Nhật và bố tôi 45 tuổi";
        String[] stringArr = string.toUpperCase().split("\\s+");
        System.out.println("Chuỗi ban đầu là: " + string);
        System.out.println(Arrays.toString(stringArr));

        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < stringArr.length; i++) {
            if (!map.containsKey(stringArr[i])) {
                map.put(stringArr[i], 1);
            } else {
                int count = map.get(stringArr[i]);
                map.put(stringArr[i], count + 1);
            }
        }
        display(map);
    }

    public static void display(TreeMap<String, Integer> map1) {
        Set<String> keySet = map1.keySet();
        System.out.println("Số lần xuất hiện của mỗi từ trong chuỗi là: ");
        for (String key : keySet) {
            System.out.println(key + " : " + map1.get(key));
        }
    }
}
