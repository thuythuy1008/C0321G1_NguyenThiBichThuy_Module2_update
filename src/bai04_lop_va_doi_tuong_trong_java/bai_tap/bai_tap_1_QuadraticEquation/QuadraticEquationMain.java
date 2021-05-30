package bai4_lop_va_doi_tuong_trong_java.bai_tap.bai_tap_1_QuadraticEquation;

import bai4_lop_va_doi_tuong_trong_java.bai_tap.bai_tap_1_QuadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation= new QuadraticEquation (a, b, c);
        quadraticEquation.display();
    }
}
