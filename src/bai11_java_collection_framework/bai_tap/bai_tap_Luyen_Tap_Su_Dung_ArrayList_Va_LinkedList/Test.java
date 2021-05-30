package bai11_java_collection_framework.bai_tap.bai_tap_Luyen_Tap_Su_Dung_ArrayList_Va_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product(3, "Bánh", 20000));
        listProduct.add(new Product(6, "Kẹo", 35000));
        listProduct.add(new Product(1, "mứt", 40000));
        listProduct.add(new Product(2, "Hạt", 45000));
        listProduct.add(new Product(4, "Coca", 10000));
        listProduct.add(new Product(5, "Socola", 50000));

        while (true) {
            System.out.println("QUẢN LÝ SẢN PHẨM: \n" +
                    "Vui lòng chọn 1 trong các chức năng sau: \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm \n" +
                    "3. Xoá sản phẩm \n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm \n" +
                    "6. Sắp xếp sản phẩm tăng dần theo giá \n" +
                    "7. Sắp xếp sản phẩm giảm dần theo giá \n" +
                    "8. Thoát chương trình");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    ProductManagerOfArrayList.add(listProduct, input);
                    break;
                case 2:
                    ProductManagerOfArrayList.edit(listProduct, input);
                    break;
                case 3:
                    ProductManagerOfArrayList.remove(listProduct, input);
                    break;
                case 4:
                    ProductManagerOfArrayList.display(listProduct);
                    break;
                case 5:
                    ProductManagerOfArrayList.search(listProduct, input);
                    break;
                case 6:
                    Collections.sort(listProduct);
                    ProductManagerOfArrayList.display(listProduct);
                    break;
                case 7:
                    Collections.sort(listProduct, new ComparetorByPrice());
                    ProductManagerOfArrayList.display(listProduct);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn này không có trong danh sách. Vui lòng chọn lại!!!");
            }
        }
    }
}
