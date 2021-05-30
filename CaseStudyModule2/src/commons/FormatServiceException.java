package commons;

public class FormatServiceException extends Exception {
    public FormatServiceException(String message) {
        super(message);
    }

    public static void checkIdVilla(String string) throws FormatServiceException {
        String regex = "^(SVVL)-[0-9]{4}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập mã dịch vụ theo đúng yêu cầu!!!");
        }
    }

    public static void checkIdRoom(String string) throws FormatServiceException {
        String regex = "^(SVRO)-[0-9]{4}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập mã dịch vụ theo đúng yêu cầu!!!");
        }
    }

    public static void checkIdHouse(String string) throws FormatServiceException {
        String regex = "^(SVHO)-[0-9]{4}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập mã dịch vụ theo đúng yêu cầu!!!");
        }
    }

    public static void checkVerviceName(String string) throws FormatServiceException {
        String regex = "^[A-Z]{1}+[a-z]{0,}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập tên theo đúng yêu cầu!!!");
        }
    }

    public static void checkAcreageUser(String string) throws FormatServiceException {
        String regex = "^[3-9][0-9].\\d{2}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập diện tích sử dụng theo đúng yêu cầu!!!");
        }
    }

    public static void checkTotalPrice(String string) throws FormatServiceException {
        String regex = "^[1-9][0-9]{0,}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập chi phí thuê theo đúng yêu cầu!!!");
        }
    }

    public static void checkTotalPeople(String string) throws FormatServiceException {
        String regex = "^([1-9]|1[0-9]|20)$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập số lượng người tối đa theo đúng yêu cầu!!!");
        }
    }

    public static void checkTotalDate(String string) throws FormatServiceException {
        String regex = "^[A-Z]{1}+[a-z]{0,}+\\ +[a-z]{0,}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập kiểu thuê theo đúng yêu cầu!!!");
        }
    }

    public static void checkRoomStandard(String string) throws FormatServiceException {
        String regex = "^[A-Z]{1}+[a-z]{0,}+\\ +[a-z]{0,}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập tiêu chuẩn phòng theo đúng yêu cầu!!!");
        }
    }

    public static void checkDescription(String string) throws FormatServiceException {
        String regex = "^[A-Z]{1}+[a-z]{0,}+\\ +[a-z]{0,}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập mô tả tiện nghi theo đúng yêu cầu!!!");
        }
    }

    public static void checkSwimmingPoolArea(String string) throws FormatServiceException {
        String regex = "^[3-9][0-9].\\d{2}$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập diện tích hồ bơi theo đúng yêu cầu!!!");
        }
    }

    public static void checkFloors(String string) throws FormatServiceException {
        String regex = "^[\\d{1}|\\d{2}]$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập số tầng theo đúng yêu cầu!!!");
        }
    }

    public static void checkFreeService(String string) throws FormatServiceException {
        String regex = "^[massage|karaoke|food|drink|car]$";
        if (!string.matches(regex)) {
            throw new FormatServiceException("Vui lòng nhập dịch vụ đi kèm theo đúng yêu cầu!!!");
        }
    }
}
