package org.example.oop6.homeWork;

import org.example.oop5.homeWork.model.Employee;

public class Hw6 {
    public static void main(String[] args) {
        /**
         * @apiNote Взять реализованный код в рамках последних семинаров (4-5) и продемонстрировать применение принципов,
         * усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые
         * рефакторим, какой принцип применяем и почему.
         * return  коменты добавил в файлы
         */
        EmployeeRepository repository = new EmployeeListRepository();
        EmployeeView view = new ConsoleEmployeeView();

        Employee employee1 = new Employee("John Doe", 30);
        Employee employee2 = new Employee("Jane Smith", 35);

        repository.addEmployee(employee1);
        repository.addEmployee(employee2);

        EmployeeController controller = new EmployeeController(repository, view);

        controller.updateView();
        controller.setEmployeeName(0, "Иван Петров");
        controller.setEmployeeAge(0, 28);
        controller.updateView();
        controller.deleteEmployee(1);
        controller.updateView();
    }
}
