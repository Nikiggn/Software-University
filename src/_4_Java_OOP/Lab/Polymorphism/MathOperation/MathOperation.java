package _4_Java_OOP.Lab.Polymorphism.MathOperation;

public class MathOperation {
    private int a;
    private int b;
    private int c;
    private int d;


    public int add(int a, int b) {
        return this.sum(a, b);
    }

    public int add(int a, int b, int c) {
        return this.sum(a, b, c);
    }

    public int add(int a, int b, int c, int d) {
        return this.sum(a, b, c, d);
    }

    public int sum(int... arg) {
        int sum = 0;
        for (int a : arg) {
            sum += a;
        }
        return sum;
    }
}
