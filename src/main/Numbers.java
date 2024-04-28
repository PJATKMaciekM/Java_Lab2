package main;
import java.lang.Math;

public class Numbers {
    private int a,b,c;

    public Numbers() {
        a = 0;
        b = 0;
        c = 0;
    }
    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int sum() {
        return a + b + c;
    }
    public double average() {
        return (a + b + c) / 3;
    }
    public int max() {
        return Math.max(Math.max(a, b), c);
    }
    public int min() {
        return Math.min(Math.min(a, b), c);
    }
    public double geometric() {
        return Math.cbrt((double)(a*b*c));
    }
}
