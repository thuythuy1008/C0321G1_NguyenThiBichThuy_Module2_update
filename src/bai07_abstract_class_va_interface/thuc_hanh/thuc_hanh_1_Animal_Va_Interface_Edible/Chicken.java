package bai7_abstract_class_va_interface.thuc_hanh.thuc_hanh_1_Animal_Va_Interface_Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
