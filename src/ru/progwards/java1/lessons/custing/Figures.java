package ru.progwards.java1.lessons.custing;

public class Figures {
    public static final double PI = 3.14d;
    public static double circle(double r) {
        return PI * r * r;
    }
    public static double square(double n) {
        return n * n;
    }
    public static Double triangle(double k) {
        double p = 3.0 * k / 2.0;
        double s = p * (p - k) * (p - k) * (p - k);
        return Math.sqrt(s);
    }

    public static double squareVsTraiange(double p) {
        return square(p) / triangle(p);
    }
    public static double squareVsCircle(double p) {
        return square(p) / circle(p);
    }
    public static double triangleVsCircle(double p) {
        return triangle(p) / circle(p);
    }

    public static void main(String[] args) {
        System.out.println(squareVsTraiange(10.0));
        System.out.println(squareVsCircle(10.0));
        System.out.println(triangleVsCircle(12.93397579321476));
    }
}
