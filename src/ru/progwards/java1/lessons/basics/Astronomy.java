package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static final double PI = 3.14;
    public static Double sphereSquare(Double r) {
        return (4 * PI * r * r);
    }
    public static Double earthSquare() {
        double earthRadius = 6371.2;
        return(sphereSquare(earthRadius));
    }
    public static Double mercurySquare() {
        double mercuryRadius = 2439.7;
        return(sphereSquare(mercuryRadius));
    }
    public static Double jupiterSquare() {
        double jupiterRadius = 71492;
        return(sphereSquare(jupiterRadius));
    }
    public static Double earthVsMercury() {
        return (earthSquare() / mercurySquare());
    }
    public static Double earthVsJupiter() {
        return (earthSquare() / jupiterSquare());
    }
    public static void main(String[] args) {
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }
}
