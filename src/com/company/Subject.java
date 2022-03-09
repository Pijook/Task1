package com.company;

public class Subject {

    private final String subjectCode;
    private Person teacher;
    private final Student[] students;

    public Subject(String subjectCode) {
        this.subjectCode = subjectCode;
        this.students = new Student[30];
    }

    public void addStudent(Student student) throws TooManyStudentsException {
        for(int i = 0; i < students.length; i++){
            if(students[i] == null){
                students[i] = student;
                return;
            }
        }
        throw new TooManyStudentsException();
    }

    public void removeStudent(Student student){
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(student)){
                students[i] = null;
                sortStudents();
                return;
            }
        }

    }

    public void sortStudents(){
        for(int x = 0; x < students.length; x++){
            for(int i = 1; i < students.length; i++){
                if(students[i] != null && students[i - 1] == null){
                    students[i - 1] = students[i];
                    students[i] = null;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(subjectCode + ", " + "teacher: " + teacher + ", students: ");
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                if(i != 0){
                    builder.append(", ");
                }
                builder.append(students[i]);
            }
        }
        return builder.toString();
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }
}
