package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int n100 = (number - number % 100) / 100;
        int n = ((number - n100 * 100) % 10);
        int n10 = (number - 100 * n100 - n) / 10;
        return(n * 100 + n10 * 10 + n100);
    }
    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
        System.out.println(reverseDigits(456));
        System.out.println(reverseDigits(789));
    }
}
