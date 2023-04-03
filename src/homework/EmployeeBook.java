package homework;

import exception.EmployeeNotFoundException;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeBook {

    private final Map<Employee, Integer> employeeBook;


    public EmployeeBook() {
        this.employeeBook = new HashMap<>();
    }

    public EmployeeBook(Map<Employee, Integer> employeeBook) {
        this.employeeBook = employeeBook;
    }


    public void addEmployee(Employee employee) {
        employeeBook.put(employee, employee.getDepartment());
    }


    public void removeEmployee(Employee employee) {
        if (!employeeBook.containsKey(employee)) {
            throw new EmployeeNotFoundException("Данный работник не найден!");
        }
        employeeBook.remove(employee);

    }


    public Employee findEmployee(Employee employee) {
        if (employeeBook.containsKey(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException("Данный работник не найден!");
    }


    public List<Employee> findEmployeeByDepartment(int department) {
        List<Employee> result = new ArrayList<>();
        for (Map.Entry<Employee, Integer> entry : employeeBook.entrySet()) {
            if (entry.getValue() == department) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public Map<Employee, Integer> printAllEmployees() {
        return employeeBook;
    }
}
