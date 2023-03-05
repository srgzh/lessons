package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    public static final double R = 6371.2d;
    public static final float PI = 3.14f;
    public static Double volumeBallDouble(Double radius) {
        double v = 4 * PI * radius * radius * radius / 3;
        System.out.println(v);
        return v;
    }
    public static Float volumeBallFloat(Float radius) {
        float v = 4 * PI * radius * radius * radius / 3;
        System.out.println(v);
        return v;
    }
    public static Double calculateAccuracy(Double radius) {
        double v = (volumeBallDouble(radius) - volumeBallFloat(radius.floatValue()));
        return v;
    }

    public static void main(String[] args) {
        System.out.println(calculateAccuracy(R));
    }
}
