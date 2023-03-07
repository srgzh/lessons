package ru.progwards.java1.lessons.custing;

public class OneLine {
    public static String strValue(String value) {
        return ("Передана строка со значением " + value);
    }
    public static String intValue(String variable,  int value) {
        return ("Значение " + variable + " равно " + String.valueOf(value));
    }
    public static String square(int n) {
        return ("Число " + String.valueOf(n) + " в квадрате равно " + String.valueOf(n * n));
    }
    public static String sum(int n, int m) {
        return ("Сумма " + String.valueOf(n) + " и " + String.valueOf(m) + " равна " + String.valueOf(n + m));
    }

    public static void main(String[] args) {
        System.out.println(strValue("str"));
        System.out.println(intValue("str", 3));
        System.out.println(square(8));
        System.out.println(sum(2, 5));
    }
}
