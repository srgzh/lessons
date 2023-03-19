package ru.progwards.java1.lessons.classes1;

public class Count {
    int count = 0;
    public Count(int count) {
        this.count = count;
    }
    public int getCount() {
        return this.count;
    }
    public void inc() {
        this.count++;
    }
    public boolean dec() {
        this.count--;
        if (this.count <= 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Count count = new Count(10);
        do {} while (!count.dec());
        System.out.println("count равен 0");
  }
}
