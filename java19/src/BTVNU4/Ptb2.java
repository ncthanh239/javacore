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
public class Ptb2 {

    Scanner sc = new Scanner(System.in);
    private double a, b, c;
    private String x, x1, x2;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

   public String getX1() {
        return x1;
    }

    public void setX1(String x1) {
        this.x1 = x1;
    }

    public String getX2() {
        return x2;
    }

    public void setX2(String x2) {
        this.x2 = x2;
    }
    public void nhapTT() {
        System.out.println("Mời bạn nhập a: ");
        this.setA(sc.nextDouble());
        System.out.println("Mời bạn nhập b: ");
        this.setB(sc.nextDouble());
        System.out.println("Mời bạn nhập c: ");
        this.setC(sc.nextDouble());
    }

    public String inTT() {
        if (getA() == 0) {
            if (getB() == 0) {
                if (getC() == 0) {
                    x = "Phương trình vô số nghiệm! ";
                } else {
                    x = "Phương trình vô nghiệm! ";
                }
            } else {
                x = "Phương trình có nghiệm x= " + (-getC() / getB());
            }

        } else {
            double del = (b * b) - (4 * a * c);
            if (del == 0) {
                x = "Phương trình có nghiệm kép " + (-b / (2 * a));
            } else if (del > 0) {
                x1 = "Phương trình có nghiệm " + ((-b + Math.sqrt(del)) / (2 * a));
                x2 = "Phương trình có nghiệm " + ((-b - Math.sqrt(del)) / (2 * a));
            } else {
                x = "Phương trình vô nghiệm! ";
            }
        }
        return x;
    }
}
