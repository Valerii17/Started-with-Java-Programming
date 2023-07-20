package org.example.oop5.classWork.controller;

import org.example.oop5.classWork.model.Student;
import org.example.oop5.classWork.model.Type;
import org.example.oop5.classWork.model.User;
import org.example.oop5.classWork.service.UserService;
import org.example.oop5.classWork.view.StudentView;

import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStuden(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> studentList = service.readOnlyStudent();
        for (User user : studentList) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }
}
