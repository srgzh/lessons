package ru.progwards.java1.lessons.repo;

public class Base {
    static String X_EQUALS = "x = ";
    static String Y_EQUALS = "y = ";
    static String A_EQUALS = "a = ";
    static String B_EQUALS = "b = ";
    static  String C_EQUALS = "c = ";
    public static int subtraction(int x, int y) {
        int r = x - y;
        System.out.println("Вызвана функция subtraction() с параметрами " + X_EQUALS + x + ", " + Y_EQUALS + y);
        return r;
    }
    public static int addition(int x, int y) {
        int r = x + y;
        System.out.println("Вызвана функция addition() с параметрами " + X_EQUALS + x + ", " + Y_EQUALS + y);
        return r;
    }
    public static int multiplication(int x, int y) {
        int r = x * y;
        System.out.println("Вызвана функция multiplication() с параметрами " + X_EQUALS + x + ", " + Y_EQUALS + y);
        return r;
    }
    public static void calculation() {
        int a, b, c;
        a = 34;
        b = 55;
        System.out.println(A_EQUALS + a);
        System.out.println(B_EQUALS + b);
        System.out.println("a + b = " + addition(a,b));
        System.out.println("a - b = " + subtraction(a,b));
        System.out.println("a * b = " + multiplication(a,b));
    }
    public static void calculation(int a, int b, int c) {
        System.out.println("Вызвана функция calculation() с параметрами " + A_EQUALS + a + ", " + B_EQUALS + b
                + ", "  + C_EQUALS + c);
        System.out.println("a + b + c = " + addition(addition(a,b),c));
        System.out.println("a^3 = " + multiplication(multiplication(a,a),a));
        System.out.println("a - (b + c^2) = " + subtraction(a,addition(b,multiplication(c,c))));
    }
    public static void main(String[] args) {
        subtraction(45,12);
        subtraction(23,55);
        addition(128,787);
        addition(528,387);
        multiplication(124,87);
        multiplication(1528,3);
        calculation();
        calculation(11,25,410);
        calculation(100,9,98);
    }
}
