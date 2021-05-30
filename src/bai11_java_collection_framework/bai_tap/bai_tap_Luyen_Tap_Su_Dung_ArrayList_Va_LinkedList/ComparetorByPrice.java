package bai11_java_collection_framework.bai_tap.bai_tap_Luyen_Tap_Su_Dung_ArrayList_Va_LinkedList;

import java.util.Comparator;

public class ComparetorByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
