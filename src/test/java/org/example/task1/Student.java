package org.example.task1;

public class Student implements Printable{
    private String name;
    private int number;
    private int avg_point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAvg_point() {
        return avg_point;
    }

    public void setAvg_point(int avg_point) {
        this.avg_point = avg_point;
    }

    @Override
    public void printable() {
        System.out.println(this.name + ", " + this.number + ", "  + this.avg_point);
    }
}
