package bai16_io_binary_file_va_serialization.bai_tap.bai_tap_1_Quan_Ly_San_Pham_Luu_Ra_File_Nhi_Phan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product(1, "Samsung", "Samsung", 20000000, "Màu đỏ"));
        listProduct.add(new Product(2, "Galaxy", "Samsung", 30000000, "Màu xanh"));
        listProduct.add(new Product(3, "Iphone", "Iphone", 35000000, "Màu trắng"));
        listProduct.add(new Product(4, "Oppo", "Oppo", 25000000, "Màu hồng"));
        listProduct.add(new Product(5, "Siaomi", "Siaomi", 15000000, "Màu đen"));

        while (true) {
            System.out.println("QUẢN LÝ SẢN PHẨM: \n" +
                    "Vui lòng chọn 1 trong các chức năng sau: \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Hiển thị danh sách sản phẩm \n" +
                    "3. Tìm kiếm sản phẩm \n" +
                    "4. Thoát chương trình");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    ProductManager.add((ArrayList<Product>) listProduct);
                    break;
                case 2:
                    ProductManager.display((ArrayList<Product>) listProduct);
                    break;
                case 3:
                    ProductManager.search((ArrayList<Product>) listProduct);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn này không có trong danh sách. Vui lòng chọn lại!!!");
            }
        }
    }
}
