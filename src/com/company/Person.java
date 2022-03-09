package com.company;

import java.util.UUID;

public class Person {

    private final String name;
    private final UUID personID;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.personID = UUID.randomUUID();
        this.age = age;
    }

    public void sayHelloTo(Person person){
        System.out.println("Hi " + person.getName() + "!");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    public UUID getPersonID() {
        return personID;
    }
}
