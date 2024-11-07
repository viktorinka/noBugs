package org.example.task1_1;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    //добавляем студента в нашу струткуру данных Students
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeStudent(String id) {
        //вариант 1:
        // 1) найти студента по id
        // 2) удалить по студенту

        Student targetStudent = null;

        for (Student student: students) {
            //условные операторы если-то-иначе
            if (student.getId().equals(id)) {
                targetStudent = student;
            }
        }

        //если targetStudent не null
        if (targetStudent!= null) {
            students.remove(targetStudent);
        } else{
            System.out.println("Student with id " + id + " not found");
        }
    }
}
