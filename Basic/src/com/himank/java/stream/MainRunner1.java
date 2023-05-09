package com.himank.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunner1 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John", 2500, "ABC");
        Employee emp2 = new Employee(2, "David", 3000, "DEF");
        Employee emp3 = new Employee(3, "Mike", 3500, "GHI");
        Employee emp4 = new Employee(4, "Robert", 4000, "JKL");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        employeeList.stream().filter(employee -> employee.salary > 3000).forEach(employee -> employee.department = "XYZ");

        // filtering out employees with salary > 3000 and assigning them dept = "XYZ"
        List<Employee> filteredList = employeeList.stream().filter(employee -> employee.salary > 3000)
                .peek(employee -> employee.department = "XYZ").collect(Collectors.toList());

        filteredList.forEach(System.out::println);
    }
}
