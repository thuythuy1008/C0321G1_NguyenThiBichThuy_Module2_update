package bai11_java_collection_framework.bai_tap.bai_tap_Luyen_Tap_Su_Dung_ArrayList_Va_LinkedList;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int id;
    private String nameProduct;
    private int price;

    public Product() {
    }

    public Product(int id, String nameProduct, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\t" +
                "NameProduct: " + nameProduct + "\t" +
                "Price: " + price + "\t";
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.getPrice() - o.getPrice());
    }
}
