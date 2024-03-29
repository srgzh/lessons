package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time {
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }
    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.zone = zone;
    }
    @Override
    public TimeZone getTimeZone() {
        return zone;
    }
    @Override
    public int secondsBetween(Time time) {
        int seconds;
        if (time.getTimeZone() == null) {
            if (this.getTimeZone() == null) {
                seconds = this.toSeconds() - time.toSeconds();
                if (seconds < 0) seconds = -seconds;
                return seconds;
            }
            else {
                seconds = this.toSeconds() + this.zone.hours * 3600 + this.zone.minutes * 60 - time.toSeconds();
                if (seconds < 0) seconds = -seconds;
                return seconds;
            }
        }
        if (this.getTimeZone() == null) {
            seconds = this.toSeconds()
                            - time.toSeconds() + time.getTimeZone().hours * 3600 + time.getTimeZone().minutes * 60;
            if (seconds < 0) seconds = -seconds;
            return seconds;
        }
        else {
            seconds = this.toSeconds() + this.zone.hours * 3600 + this.zone.minutes * 60
                            - time.toSeconds() + time.getTimeZone().hours * 3600 + time.getTimeZone().minutes * 60;
            if (seconds < 0) seconds = -seconds;
            return seconds;
        }

    }

    public static void main(String[] args) {
        ZonedTime t = new ZonedTime(4, 34,0, new TimeZone(-3, 1));
        ZonedTime tnew = new ZonedTime(13, 32, 29);
        System.out.println(t.toString());
        System.out.println(t.toSeconds());
        System.out.println(t.secondsBetween(tnew));
    }
}

