package bai17_string_va_regex.bai_tap.bai_tap_1_Validate_Ten_Cua_Lop_Hoc;

public class ClassNameTest {
    private static ClassName className;

    public static final String[] validClassName = new String[]{"C1234M", "C0321G", "P9540G", "A0324H", "C8952I"};
    public static final String[] invalidClassName = new String[]{"B9654A", "M9876C", "K8976L", "S5641P"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String className1 : validClassName) {
            boolean isvalid = className.validate(className1);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
        for (String className1 : invalidClassName) {
            boolean isvalid = className.validate(className1);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
    }
}
