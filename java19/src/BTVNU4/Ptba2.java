/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVNU4;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ptba2 {

    private float a, b, c;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào a: ");
        a = sc.nextFloat();
        System.out.print("Mời bạn nhập vào b: ");
        b = sc.nextFloat();
        System.out.print("Mời bạn nhập vào c: ");
        c = sc.nextFloat();

    }

    public void inTT() {
        if (a == 0) {
            if (b == 0) {
                if (b == 0) {
                    System.out.println("Phương trình vô số nghiệm! ");
                } else {
                    System.out.println("Phương trình vô nghiệm! ");
                }
            } else {
                System.out.println("Phương trình có nghiệm x= " + (-c / b));
            }

        } else {
            double del = (b * b) - (4 * a * c);
            if (del == 0) {
                System.out.println("Phương trình có nghiệm " + (-b / (2 * a)));
            } else if (del > 0) {
                System.out.println("Phương trình có nghiệm :" + ((-b + Math.sqrt(del)) / (2 * a)));
                System.out.println("Phương trình có nghiệm :" + ((-b - Math.sqrt(del)) / (2 * a)));

            } else {
                System.out.println("Phương trình vô nghiệm! ");
            }
        }
    }

}
