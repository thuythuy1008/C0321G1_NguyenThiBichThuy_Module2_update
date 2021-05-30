package manager;

import commons.FuncWriteRead;
import models.Villa;

public class ManagerServices {
    //    các chức năng quản lí CRUD
    public void addVilla() {
//        nhập từ bàn phím
//        validate dữ liệu
        Villa villa=new Villa();
        FuncWriteRead.writeVillaToCSV(villa);
    }

    public void addRoom() {
//        nhập từ bàn phím
//        validate dữ liệu
    }
}
