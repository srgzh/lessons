package ru.progwards.java1.lessons.cycles;

public class GoldenFibo {
    public static int fiboNumber(int n) {
        if (n == 1 || n == 2) return 1;
        n--;
        int fNew = 1;
        int fPrev = 0;
        int fNow = 1;
        int i = 1;
        while (i <= n) {
            fNew = fNow + fPrev;
            fPrev = fNow;
            fNow = fNew;
            i++;
        }
        return fNew;
    }
    public static boolean isGoldenTriangle(int a, int b, int c) {
        if (a == b)
            if (((double) a / c >= 1.61703) & ((double) a / c <= 1.61903)) return true;
        if (a == c)
            if (((double) a / b >= 1.61703) & ((double) a / b <= 1.61903)) return true;
        if (b == c)
            if (((double) b / a >= 1.61703) & ((double) b / a <= 1.61903)) return true;
        return false;
   }
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println(fiboNumber(i));
        }
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    if (isGoldenTriangle(fiboNumber(i), fiboNumber(j), fiboNumber(k)))
                        System.out.println(fiboNumber(i) + " " + fiboNumber(j) + " " + fiboNumber(k));
                }
            }
        }
    }
}
