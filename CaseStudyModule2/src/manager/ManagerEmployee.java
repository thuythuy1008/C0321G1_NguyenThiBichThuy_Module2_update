package manager;

import commons.FuncWriteRead;
import models.Employee;

import java.util.*;

public class ManagerEmployee {
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> listEmployee = new ArrayList();

    public void addEmployee() {
        Employee employee1 = new Employee("Nguyễn Văn A", "19", "Đà Nẵng");
        listEmployee.add(employee1);
        Employee employee2 = new Employee("Nguyễn Văn Bình", "25", "Quảng Trị");
        listEmployee.add(employee2);
        Employee employee3 = new Employee("Nguyễn Ngọc Anh", "20", "Huế");
        listEmployee.add(employee3);
        Employee employee4 = new Employee("Nguyễn Thị Ngọc", "26", "Hồ Chí Minh");
        listEmployee.add(employee4);
        Employee employee5 = new Employee("Nguyễn Gia Khang", "30", "Hà Nội");
        listEmployee.add(employee5);
        Employee employee6 = new Employee("Nguyễn Văn Nhật", "19", "Thái Bình");
        listEmployee.add(employee6);
        Employee employee7 = new Employee("Nguyễn Đức Bảo", "22", "Thanh Hóa");
        listEmployee.add(employee7);
        Employee employee8 = new Employee("Nguyễn Thị Như", "24", "Kon Tum");
        listEmployee.add(employee8);
        Employee employee9 = new Employee("Nguyễn Thị Hà", "20", "Phan Thiết");
        listEmployee.add(employee9);
        Employee employee10 = new Employee("Nguyễn Văn Đức", "28", "Ninh Bình");
        listEmployee.add(employee10);
        FuncWriteRead.writeEmployeeToCSV("src\\data\\employee.csv", listEmployee, true);
        employeeMap();
    }

    public void employeeMap() {
        TreeMap<Integer, Employee> map = new TreeMap();
        listEmployee = FuncWriteRead.readEmployeeFromCSV("src\\data\\employee.csv");
        int idEmployee = 1;
        for (Employee employee : listEmployee) {
            map.put(idEmployee++, employee);
        }
        showEmployee(map);
    }

    public void showEmployee(TreeMap<Integer, Employee> map1) {
        Set<Integer> keySet = map1.keySet();
        System.out.println("Toàn bộ nhân viên có trong Furama: ");
        for (Integer key : keySet) {
            System.out.println(key + " " + map1.get(key).showInfor());
        }
    }
}
