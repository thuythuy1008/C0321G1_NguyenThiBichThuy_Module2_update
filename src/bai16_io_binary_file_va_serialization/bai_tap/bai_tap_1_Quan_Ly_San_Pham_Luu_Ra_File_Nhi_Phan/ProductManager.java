package bai16_io_binary_file_va_serialization.bai_tap.bai_tap_1_Quan_Ly_San_Pham_Luu_Ra_File_Nhi_Phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static Scanner input = new Scanner(System.in);

    public static void writeToFile(String path, List<Product> listProduct) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listProduct);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void add(ArrayList<Product> listProduct) {
        System.out.println("Nhập mã của sản phẩm: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = input.nextLine();
        System.out.println("Nhập hãn sản xuất: ");
        String manufacturer = input.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Miêu tả sản phẩm: ");
        String discription = input.nextLine();
        Product product1 = new Product(id, name, manufacturer, price, discription);
        listProduct.add(product1);
        writeToFile("src\\bai16_io_binary_file_va_serialization\\bai_tap\\bai_tap_1_Quan_Ly_San_Pham_Luu_Ra_File_Nhi_Phan\\sanPham.txt", listProduct);
        display(listProduct);
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> listProduct = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listProduct = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listProduct;
    }

    public static void display(ArrayList<Product> listProduct) {
        readDataFromFile("src\\bai16_io_binary_file_va_serialization\\bai_tap\\bai_tap_1_Quan_Ly_San_Pham_Luu_Ra_File_Nhi_Phan\\sanPham.txt");
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    static void search(ArrayList<Product> listProduct) {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm");
        String name = input.next();
        readDataFromFile("src\\bai16_io_binary_file_va_serialization\\bai_tap\\bai_tap_1_Quan_Ly_San_Pham_Luu_Ra_File_Nhi_Phan\\sanPham.txt");
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                System.out.println("Thông tin sản phẩn cần tìm: " + product);
                return;
            }
        }
        System.out.println("Sản phẩm không có trong danh sách");
    }
}