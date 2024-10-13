package org.example.task1;

public class Clock implements Readable{
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private int hours;
    private int minute;
    private int seconds;

    public void tick() {
        this.seconds = this.seconds + 1;
    }
    @Override
    public void readTime() {
        System.out.println(this.hours + ", " + this.minute + ", "  + this.seconds);
    }
}
