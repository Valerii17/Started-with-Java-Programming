package org.example.oop5.classWork.service;

import org.example.oop5.classWork.model.Type;
import org.example.oop5.classWork.model.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, String patron, Type type);

    List<User> read();

    List<User> readOnlyStudent();
}
