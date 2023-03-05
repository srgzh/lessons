package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    public static final double R = 6371.2d;
    public static final float PI = 3.14f;
    public static Double volumeBallDouble(Double radius) {
        return (4 / (3 * PI * radius * radius * radius));
    }
    public static Float volumeBallFloat(Float radius) {
        return (4 / (3 * PI * radius * radius * radius));
    }
    public static Double calculateAccuracy(Double radius) {
        return (volumeBallDouble(radius) - volumeBallFloat(radius.floatValue()));
    }

    public static void main(String[] args) {
        System.out.println(calculateAccuracy(R));
    }
}
