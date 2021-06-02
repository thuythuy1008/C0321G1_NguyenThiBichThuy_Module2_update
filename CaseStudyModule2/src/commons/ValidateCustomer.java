package commons;

import commons.exception.CustomerException;

public class ValidateCustomer {

    public static void validateName(String name) throws CustomerException {
        String regex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        if (!name.matches(regex)) {
            throw new CustomerException("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ!!!");
        }
    }

    public static void validateBirthDay(String birthday) throws CustomerException {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[-|/](0[1-9]|1[12])[-|/](19[0-9]{2}|200[0123])$";
        if (!birthday.matches(regex)) {
            throw new CustomerException("Vui lòng nhập ngày tháng năm sinh theo đúng yêu cầu dd/mm/yyyy hoặc dd-mm-yyyy \n" +
                    "Trong đó: dd: từ 01-31; mm: từ 01-12; yyyy: từ 1900-2003");
        }
    }

    public static void validateGender(String gender) throws CustomerException {
        String regex = "^([Mm][Aa][Ll][Ee]|[Ff][Ee][Mm][Aa][Ll][Ee]|[Uu][Nn][Kk][Nn][Oo][Ww])$";
        if (!gender.matches(regex)) {
            throw new CustomerException("Vui lòng nhập giới tính: male, female, unknow!!! Có thể viết hoa viết thường tùy ý!");
        }
    }

    public static void validateIdCard(String idCard) throws CustomerException {
        String regex = "^(([0-9]{3}[\\s]{1}){2}[0-9]{3})$";
        if (!idCard.matches(regex)) {
            throw new CustomerException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX!!!");
        }
    }

    public static void validatePhoneNumber(String phoneNumber) throws CustomerException {
        String regex = "^0[0-9]{9}$";
        if (!phoneNumber.matches(regex)) {
            throw new CustomerException("Vui lòng nhập số điện thoại theo định dạng: 0XXXXXXXXX");
        }
    }

    public static void validateEmail(String email) throws CustomerException {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        if (!email.matches(regex)) {
            throw new CustomerException("Email phải đúng định dạng abc@abc.abc");
        }
    }

    public static void validateCustomerType(String customerType) throws CustomerException {
        String regex = "^(Diamond|Platinium|Gold|Silver|Member)$";
        if (!customerType.matches(regex)) {
            throw new CustomerException("Vui lòng nhập loại khách hàng theo đúng yêu cầu!!!");
        }
    }

    public static void validateAddress(String address) throws CustomerException {
        String regex = "^.*$";
        if (!address.matches(regex)) {
            throw new CustomerException("Vui lòng nhập địa chỉ theo đúng yêu cầu!!!");
        }
    }
}
