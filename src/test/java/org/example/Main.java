package org.example;

import org.example.task1.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Name");
        book.setAuthor("Author");
        book.setYear(2024);
        book.displayable();

        Student student = new Student();
        student.setName("student");
        student.setNumber(123);
        student.setAvg_point(456);
        student.printable();

        Point point = new Point();
        point.setX(1);
        point.setY(2);
        point.displayPosition();

        Clock clock = new Clock();
        clock.setHours(1);
        clock.setMinute(2);
        clock.setSeconds(3);
        clock.tick();
        clock.readTime();

        Car car = new Car();
        car.setBrand("Brand");
        car.setModel("Model");
        car.setYear(2024);
        car.start();
        car.stop();
        car.distance(10);
    }
}