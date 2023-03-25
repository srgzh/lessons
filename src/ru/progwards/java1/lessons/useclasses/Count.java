package ru.progwards.java1.lessons.useclasses;

public class Count {
    int count;
    public Count(int count) {
        this.count = count;
    }
    public Count() {

    }
    public int getCount() {
        return this.count;
    }
    public void inc() {
        this.count++;
    }
    public boolean dec() {
        this.count--;
        return this.count <= 0;
    }
//    public static void main(String[] args) {
//        Count count = new Count(10);
//        do {} while (!count.dec());
//        System.out.println("count равен 0");
//    }
}
class CountTest {
    public static void testInc(int count) {
        Count testCount = new Count();
        if (count <= 0) {
            System.out.println("тест inc окончен");
            return;
        }
        for(int i = 0; i < count; i++) {
            testCount.inc();
            System.out.print(testCount.getCount() + " ");
        }
        System.out.println("\nтест inc окончен");
    }
    public static void testDec(int count) {
        Count testCount = new Count(count);
        do {
            if (testCount.dec()) {
                System.out.print(testCount.getCount() + " ");
                System.out.println("\ncount равен 0");
                break;
            }
            else System.out.print(testCount.getCount() + " ");
        } while (testCount.getCount() >= 0);
        System.out.println("тест dec окончен");
    }

    public static void main(String[] args) {
        testInc(7);
        testInc(0);
        testInc(-1);
        testDec(9);
        testDec(0);
        testDec(-5);
    }
}