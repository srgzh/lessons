package ru.progwards.java1.lessons.classes1;

public class Time {
    int hours;
    int minutes;
    int seconds;
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String toString() {
        String time;
        if (this.hours < 10) time = "0" + Integer.toString(this.hours);
            else time = Integer.toString(this.hours);
        if (this.minutes < 10) time += ":0" + Integer.toString(this.minutes);
            else time += ":" + Integer.toString(this.minutes);
        if (this.seconds < 10) time += ":0" + Integer.toString(this.seconds);
            else time += ":" + Integer.toString(this.seconds);
        return time;
    }
    public int toSeconds() {
        return this.hours * 360 + this.minutes * 60 + this.seconds;
    }
    public int secondsBetween(Time time) {
        int seconds = 0;
        seconds = this.toSeconds() - time.toSeconds();
        if (seconds < 0) seconds = - seconds;
        return seconds;
    }
    public static void main(String[] args) {
        Time t = new Time(3,45,5);
        Time tnew = new Time(12,45,50);
        System.out.println(t.toString());
        System.out.println(t.toSeconds());
        System.out.println(t.secondsBetween(tnew));
    }
}
