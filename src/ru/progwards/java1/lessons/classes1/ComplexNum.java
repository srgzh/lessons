package ru.progwards.java1.lessons.classes1;

public class ComplexNum {
    int a;
    int b;
    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString() {
        String s;
        s = Integer.toString(this.a) + "+" + Integer.toString(b) + "i";
        return s;
    }
    public ComplexNum add(ComplexNum num) {
        ComplexNum n = new ComplexNum(0,0);
        n.a = this.a + num.a;
        n.b = this.b + num.b;
        return n;
    }
    public ComplexNum sub(ComplexNum num) {
        ComplexNum n = new ComplexNum(0,0);
        n.a = this.a - num.a;
        n.b = this.b - num.b;
        return n;
    }
    public ComplexNum mul(ComplexNum num) {
        ComplexNum n = new ComplexNum(0,0);
        n.a = this.a * num.a - this.b * num.b;
        n.b = this.b * num.a + this.a * num.b;
        return n;
    }
    public ComplexNum div(ComplexNum num) {
        ComplexNum n = new ComplexNum(0,0);
        n.a = (this.a * num.a + this.b * num.b) / (num.a * num.a + num.b * num.b);
        n.b = (this.b * num.a - this.a * num.b) / (num.a * num.a + num.b * num.b);
        return n;
    }

    public static void main(String[] args) {

    }
}
