package com.company;

public class Circle {
    public double radius;
    public Circle(double r) {
       radius = r;
    }
    public double diameter() {
        double d = 2 * radius;
        return d;
    }
}
