package ru.progwards.java1.lessons.classes1;

public class Count {
    int count = 0;
    public Count(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }
    public void inc() {
        count++;
    }
    public boolean dec() {
        count--;
        if (count <= 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Count count = new Count(10);
        do {} while (!count.dec());
        System.out.println("count равен 0");
  }
}
