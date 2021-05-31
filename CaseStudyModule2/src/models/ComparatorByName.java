package models;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getNameCustomer().compareTo(o2.getNameCustomer()) == 0) {
            return o1.getBirthDay().compareTo(o2.getBirthDay());
        }
        return o1.getNameCustomer().compareTo(o2.getNameCustomer());
    }
}
