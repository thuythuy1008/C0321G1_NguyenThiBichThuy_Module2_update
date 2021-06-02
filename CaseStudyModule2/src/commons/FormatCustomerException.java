package commons;

public class FormatCustomerException extends Exception {
    public FormatCustomerException(String message) {
        super(message);
    }

    public static void nameException(String string) throws FormatCustomerException {
        String regex = "^([A-Z][a-z]*[\\s]?)+$";
        if (!string.matches(regex)) {
            throw new FormatCustomerException("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ!!!");
        }
    }

    public static void checkBirthDay(String string) throws FormatCustomerException {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[-|/](0[1-9]|1[12])[-|/](19[0-9]{2}|200[0123])$";
        if (!string.matches(regex)) {
            throw new FormatCustomerException("Vui lòng nhập ngày tháng năm sinh theo đúng yêu cầu dd/mm/yyyy hoặc dd-mm-yyyy \n" +
                    "Trong đó: dd: từ 01-31; mm: từ 01-12; yyyy: từ 1900-2003");
        }
    }

    public static void genderException(String string) throws FormatCustomerException {
        String regex = "^([Mm][Aa][Ll][Ee]|[Ff][Ee][Mm][Aa][Ll][Ee]|[Uu][Nn][Kk][Nn][Oo][Ww])$";
        if (!string.matches(regex)) {
            throw new FormatCustomerException("Vui lòng nhập giới tính: male, female, unknow!!! Có thể viết hoa viết thường tùy ý!");
        }
    }

    public static void idCardException(String string) throws FormatCustomerException {
        String regex = "^(([0-9]{3}[\\s]{1}){2}[0-9]{3})$";
        if (!string.matches(regex)) {
            throw new FormatCustomerException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX!!!");
        }
    }

    public static void phoneNumberException(String string) throws FormatCustomerException {
        String regex = "^0[0-9]{9}$";
        if (!string.matches(regex)) {
            throw new FormatCustomerException("Vui lòng nhập số điện thoại theo định dạng: 0XXXXXXXXX");
        }
    }

    public static void emailException(String string) throws FormatCustomerException {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        if (!string.matches(regex)) {
            throw new FormatCustomerException("Email phải đúng định dạng abc@abc.abc");
        }
    }

    public static void customerTypeException(String string) throws FormatCustomerException {
        String regex = "^(Diamond|Platinium|Gold|Silver|Member)$";
        if (!string.matches(regex)) {
            throw new FormatCustomerException("Vui lòng nhập loại khách hàng theo đúng yêu cầu!!!");
        }
    }

    public static void addressException(String string) throws FormatCustomerException {
        String regex = "^.*$";
        if (!string.matches(regex)) {
            throw new FormatCustomerException("Vui lòng nhập địa chỉ theo đúng yêu cầu!!!");
        }
    }
}
