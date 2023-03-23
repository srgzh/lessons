package ru.progwards.java1.lessons.useclasses;
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
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }
    public int secondsBetween(Time time) {
        int seconds;
        seconds = this.toSeconds() - time.toSeconds();
        if (seconds < 0) seconds = - seconds;
        return seconds;
    }
//    public static void main(String[] args) {
//        Time t = new Time(1, 52,55);
//        Time tnew = new Time(11, 54, 10);
//        System.out.println(t.toString());
//        System.out.println(t.toSeconds());
//        System.out.println(t.secondsBetween(tnew));
//    }
}
class TimeTest {
    public static void main(String[] args) {
        Time time0 = new Time(0,0,0);
        System.out.println(time0.toString());
        Time time1 = new Time(1,2,3);
        System.out.println(time1.toString());
        Time time2 = new Time(11,12,13);
        System.out.println(time2.toString());
        System.out.println("в time0 " + time0.toSeconds() + " секунд");
        System.out.println("в time1 " + time1.toSeconds() + " секунд");
        System.out.println("в time2 " + time2.toSeconds() + " секунд");
        System.out.println("разница между time0 и time1 равна " + time0.secondsBetween(time1));
        System.out.println("разница между time2 и time0 равна " + time2.secondsBetween(time0));
        System.out.println("разница между time1 и time2 равна " + time1.secondsBetween(time2));
    }

}