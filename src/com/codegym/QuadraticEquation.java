package com.codegym;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1(double delta) {
        return (-b + Math.sqrt(delta)) / 2 * a;
    }

    public double getRoot2(double delta) {
        return (-b - Math.sqrt(delta)) / 2 * a;
    }
}
