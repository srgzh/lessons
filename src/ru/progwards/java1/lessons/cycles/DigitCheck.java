package ru.progwards.java1.lessons.cycles;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit) {
        for (int i = 1; i < number * 10; i *= 10) {
            if ((number % (10 * i) - number % i) == digit * i) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDigit(41235, 6));
    }
}
