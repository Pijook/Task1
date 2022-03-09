package com.company;

import java.util.UUID;

public class Student extends Person {

    private final UUID studentID;

    public Student(String name, Integer age) {
        super(name, age);
        studentID = UUID.randomUUID();
    }

    public UUID getStudentID() {
        return studentID;
    }
}
