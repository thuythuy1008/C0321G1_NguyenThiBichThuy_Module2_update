package bai11_java_collection_framework.bai_tap.bai_tap_Luyen_Tap_Su_Dung_ArrayList_Va_LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagerOfArrayList {
    static void display(ArrayList<Product> listProduct) {
        System.out.println("--------------------------");
        System.out.println("Danh sách các sản phẩm:");
        for (Product product : listProduct) {
            System.out.println(product);
        }
        System.out.println("--------------------------");
    }

    static void add(ArrayList<Product> listProduct, Scanner input) {
        System.out.println("Nhập id của sản phẩm: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = input.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        int price = input.nextInt();
        Product product = new Product(id, nameProduct, price);
        listProduct.add(product);
        display(listProduct);
    }

    static void remove(ArrayList<Product> listProduct, Scanner input) {
        System.out.println("Nhập id của sản phẩm bạn muốn xoá: ");
        int id = input.nextInt();
        for (Product product : listProduct) {
            if (product.getId() == id) {
                System.out.println(product);
                System.out.println("Bạn có chắc là muốn xóa sản phẩm này không??? \n" +
                        "1.Có \n" +
                        "0.Không");
                int choice = input.nextInt();
                if (choice == 1) {
                    listProduct.remove(product);
                }
            }
        }
        display(listProduct);
    }

    static void edit(ArrayList<Product> listProduct, Scanner input) {
        System.out.println("Nhập id sản phẩm cần sửa: ");
        int id = input.nextInt();
        for (Product product : listProduct) {
            if (product.getId() == id) {
                System.out.print("Nhập tên sản phẩm thay thế: ");
                input.nextLine();
                String name = input.nextLine();
                System.out.print("Nhập giá sản phẩm thay thế: ");
                int price = input.nextInt();
                product.setNameProduct(name);
                product.setPrice(price);
                display(listProduct);
            }
        }
    }

    static void search(ArrayList<Product> listProduct, Scanner input) {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm");
        String name = input.nextLine();
        for (Product product : listProduct) {
            if (product.getNameProduct().equals(name)) {
                System.out.println("Thông tin sản phẩn cần tìm: " + product);
                return;
            }
        }
        System.out.println("Sản phẩm không có trong danh sách");
    }
}
