package ru.progwards.java1.lessons.wrappers;

public class NumMetrics {
    public static Integer sumDigits(Integer number) {
        int n100 = (number - number % 100) / 100;
        int n10 = (number % 100 - number % 10) / 10;
        int n1 = number % 10;
        return (n1 + n10 + n100);
    }
    public static Integer mulDigits(Integer number) {
        int n100 = (number - number % 100) / 100;
        int n10 = (number % 100 - number % 10) / 10;
        int n1 = number % 10;
        return(n1 * n10 * n100);
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(234));
        System.out.println(mulDigits(234));
    }
}
