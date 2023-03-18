package ru.progwards.java1.lessons.cycles;

public class NumbersRange {
    public static long sumNumbers(int start, int finish) {
        long sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }
    public static long sumOdd(int start, int finish) {
        long sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }
    public static long sumEvenIdx(int start, int finish){
        long sum = 0;
        int n = 0;
        for (int i = start; i <= finish; i++) {
            if (n++ % 2 == 0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(2,6));
        System.out.println(sumOdd(2,6));
        System.out.println(sumEvenIdx(1,6));
    }
}
