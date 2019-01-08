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
public class Ptb1 {

    Scanner nhap = new Scanner(System.in);
    private double a, b;
    private String x;

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

    public void nhapTT() {
        System.out.print("Mời bạn nhập a: ");
        this.setA(nhap.nextDouble());
        System.out.print("Mời bạn nhập b: ");
        this.setB(nhap.nextDouble());
    }

    public String inTT() {
        if (getA() == 0) {
            if (getB() == 0) {
                x = "Phương trinh vô số nghiệm";
            } else {
                x = "Phương trình vô nghiệm";
            }
        } else {
            x = "Nghiệm của phương trình là x= " + (-getB() / getA());
        }
        return x;
    }
}
