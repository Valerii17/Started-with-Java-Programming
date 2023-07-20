package org.example.oop5.homeWork;

import org.example.oop5.homeWork.controller.EmployeeController;
import org.example.oop5.homeWork.model.Employee;
import org.example.oop5.homeWork.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class Hw {
    public static void main(String[] args) {
        /**
         * @apiNote Создать информационную систему позволяющую работать с сотрудниками некой компании
         */
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee("John Doe", 30);
        Employee employee2 = new Employee("Jane Smith", 35);

        employees.add(employee1);
        employees.add(employee2);

        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employees, view);

        controller.updateView();

        controller.setEmployeeName(0, "Иван Петров");
        controller.setEmployeeAge(0, 28);

        controller.updateView();

        controller.deleteEmployee(1);

        controller.updateView();



    }
}

