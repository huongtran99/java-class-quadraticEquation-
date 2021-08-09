package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        double delta = qe.getDiscriminant();
        double r1, r2;
        r1 = qe.getRoot1(delta);
        r2 = qe.getRoot2(delta);
        if(delta > 0) {
            System.out.print("r1 = " + r1 + " , " + "r2 = " + r2);
        } else if( delta == 0) {
            System.out.print("r1 = r2 = " + r1);
        } else {
            System.out.print("vô nghiệm");
        }
    }
}
