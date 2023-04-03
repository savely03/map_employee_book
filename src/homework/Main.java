package homework;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание homework.EmployeeBook при помощи Map");

        Employee emp1 = new Employee("Иван", "Иванов", "Иванович", 5, 1000);
        Employee emp2 = new Employee("Петр", "Петров", "Петрович", 4, 5000);
        Employee emp3 = new Employee("Иван", "Петров", "Иванович", 4, 10000);
        EmployeeBook employeeBook = new EmployeeBook(new HashMap<>(Map.of(emp1, emp1.getDepartment(), emp2, emp2.getDepartment())));

        System.out.println(employeeBook.printAllEmployees());
        System.out.println("-----------------------------");
        System.out.println(employeeBook.findEmployee(emp1));
        System.out.println("-----------------------------");
        System.out.println(employeeBook.findEmployeeByDepartment(5));
        System.out.println("-----------------------------");
        employeeBook.removeEmployee(emp2);
        System.out.println(employeeBook.printAllEmployees());
        System.out.println("-----------------------------");
        employeeBook.addEmployee(emp3);
        System.out.println(employeeBook.printAllEmployees());
    }
}