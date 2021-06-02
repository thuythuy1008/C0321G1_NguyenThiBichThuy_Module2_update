package commons;

import commons.exception.ServiceException;

public class ValidateService {

    public static void validateIdVilla(String idVilla) throws ServiceException {
        String regex = "^(SVVL)-[0-9]{4}$";
        if (!idVilla.matches(regex)) {
            throw new ServiceException("Vui lòng nhập mã dịch vụ theo đúng yêu cầu!!!");
        }
    }

    public static void validateIdRoom(String idRoom) throws ServiceException {
        String regex = "^(SVRO)-[0-9]{4}$";
        if (!idRoom.matches(regex)) {
            throw new ServiceException("Vui lòng nhập mã dịch vụ theo đúng yêu cầu!!!");
        }
    }

    public static void validateIdHouse(String idHouse) throws ServiceException {
        String regex = "^(SVHO)-[0-9]{4}$";
        if (!idHouse.matches(regex)) {
            throw new ServiceException("Vui lòng nhập mã dịch vụ theo đúng yêu cầu!!!");
        }
    }

    public static void validateServiceName(String serviceName) throws ServiceException {
        String regex = "^([A-Z][a-z0-9]*[\\s]?)+$";
        if (!serviceName.matches(regex)) {
            throw new ServiceException("Vui lòng nhập tên theo đúng yêu cầu!!!");
        }
    }

    public static void validateAcreageUser(String acreageUser) throws ServiceException {
        String regex = "^[3-9][0-9].\\d{2}$";
        if (!acreageUser.matches(regex)) {
            throw new ServiceException("Vui lòng nhập diện tích sử dụng theo đúng yêu cầu!!!");
        }
    }

    public static void validateTotalPrice(String totalPrice) throws ServiceException {
        String regex = "^[1-9][0-9]{0,}$";
        if (!totalPrice.matches(regex)) {
            throw new ServiceException("Vui lòng nhập chi phí thuê theo đúng yêu cầu!!!");
        }
    }

    public static void validateTotalPeople(String totalPeople) throws ServiceException {
        String regex = "^([1-9]|1[0-9]|20)$";
        if (!totalPeople.matches(regex)) {
            throw new ServiceException("Vui lòng nhập số lượng người tối đa theo đúng yêu cầu!!!");
        }
    }

    public static void validateTotalDate(String totalDate) throws ServiceException {
        String regex = "^(Ngày|Tuần|Tháng)$";
        if (!totalDate.matches(regex)) {
            throw new ServiceException("Vui lòng nhập kiểu thuê theo đúng yêu cầu!!!");
        }
    }

    public static void validateRoomStandard(String roomStandard) throws ServiceException {
        String regex = "^([A-Za-z][a-z]*[\\s]?)+$";
        if (!roomStandard.matches(regex)) {
            throw new ServiceException("Vui lòng nhập tiêu chuẩn phòng theo đúng yêu cầu!!!");
        }
    }

    public static void validateDescription(String description) throws ServiceException {
        String regex = "^([A-Za-z][a-z]*[\\s]?)+$";
        if (!description.matches(regex)) {
            throw new ServiceException("Vui lòng nhập mô tả tiện nghi theo đúng yêu cầu!!!");
        }
    }

    public static void validateSwimmingPoolArea(String swimmingPoolArea) throws ServiceException {
        String regex = "^[3-9][0-9].\\d{2}$";
        if (!swimmingPoolArea.matches(regex)) {
            throw new ServiceException("Vui lòng nhập diện tích hồ bơi theo đúng yêu cầu!!!");
        }
    }

    public static void validateFloors(String floors) throws ServiceException {
        String regex = "^[\\d{1}|\\d{2}]$";
        if (!floors.matches(regex)) {
            throw new ServiceException("Vui lòng nhập số tầng theo đúng yêu cầu!!!");
        }
    }

    public static void validateFreeService(String freeService) throws ServiceException {
        String regex = "^(massage|karaoke|food|drink|car)$";
        if (!freeService.matches(regex)) {
            throw new ServiceException("Vui lòng nhập dịch vụ đi kèm theo đúng yêu cầu!!!");
        }
    }
}
