package ru.progwards.java1.lessons.compare;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        return a < (b + c) & b < (a + c) & c < (a +b);
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        return a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || a == c || b == c;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(2,2,3));
        System.out.println(isTriangle(2,3,4));
        System.out.println(isTriangle(3,2,5));
        System.out.println(isTriangle(2,3,6));
        System.out.println(isTriangle(3,3,9));
        System.out.println(isIsoscelesTriangle(2,2,3));
        System.out.println(isIsoscelesTriangle(2,3,2));
        System.out.println(isIsoscelesTriangle(3,2,2));
        System.out.println(isIsoscelesTriangle(2,2,2));
        System.out.println(isIsoscelesTriangle(3,3,3));
        System.out.println(isRightTriangle(2,2,3));
    }
}
