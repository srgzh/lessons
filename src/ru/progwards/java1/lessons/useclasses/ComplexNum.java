package ru.progwards.java1.lessons.useclasses;

public class ComplexNum {
    int a;
    int b;
    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString() {
        String s;
//        if (this.b >= 0) {
            s = Integer.toString(this.a) + "+" + Integer.toString(this.b) + "i";
//        }
//        else {
//            s = Integer.toString(this.a) + Integer.toString(this.b) + "i";
//        }
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


}
class ComplexNumTest {
    public static void main(String[] args) {
        ComplexNum num0 = new ComplexNum(0,0);
        System.out.println(num0.toString());
        ComplexNum num1 = new ComplexNum(1,1);
        System.out.println(num1.toString());
        ComplexNum num2 = new ComplexNum(-2,-2);
        System.out.println(num2.toString());
        ComplexNum num3 = new ComplexNum(3,-5);
        System.out.println(num3.toString());
        System.out.println("сумма num0 и num1 равна " + num0.add(num1));
        System.out.println("сумма num1 и num2 равна " + num1.add(num2));
        System.out.println("разница num1 и num2 равна " + num1.sub(num2));
        System.out.println("разница num2 и num3 равна " + num2.sub(num3));
        System.out.println("частное num1 и num3 равно " + num0.div(num3));
        System.out.println("частное num2 и num3 равно " + num2.div(num3));
        System.out.println("произведение num0 и num3 равно " + num0.mul(num3));
        System.out.println("произведение num1 и num2 равно " + num1.mul(num2));
    }
}