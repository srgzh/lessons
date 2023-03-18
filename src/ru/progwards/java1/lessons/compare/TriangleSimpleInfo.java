package ru.progwards.java1.lessons.compare;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a >= b)
            if (a >= c) return a;
            else return c;
        else
            if (b >= c) return b;
            else return c;
    }
    public static int minSide(int a, int b, int c) {
        if (a <= b)
            if (a <= c) return a;
            else return c;
        else
        if (b <= c) return b;
        else return c;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }
    public static void main(String[] args) {
        System.out.println(maxSide(2,2,3));
        System.out.println(maxSide(2,3,2));
        System.out.println(maxSide(3,2,2));
        System.out.println(maxSide(2,2,2));
        System.out.println(maxSide(3,3,3));
        System.out.println(isEquilateralTriangle(2,2,3));
        System.out.println(isEquilateralTriangle(2,3,2));
        System.out.println(isEquilateralTriangle(3,2,2));
        System.out.println(isEquilateralTriangle(2,2,2));
        System.out.println(isEquilateralTriangle(3,3,3));
        System.out.println(minSide(2,2,3));
        System.out.println(minSide(2,3,2));
        System.out.println(minSide(3,2,2));
        System.out.println(minSide(2,2,2));
        System.out.println(minSide(3,3,3));
    }
}
