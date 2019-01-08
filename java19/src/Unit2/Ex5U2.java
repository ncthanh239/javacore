/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex5U2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("Mời bạn nhập vào a: ");
        a = sc.nextFloat();
        System.out.print("Mời bạn nhập vào b: ");
        b = sc.nextFloat();
        System.out.print("Mời bạn nhập vào c: ");
        c = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm! ");
                } else {
                    System.out.println("Phương trình vô nghiệm !");

                }
            } else {
                System.out.println("Phương trình có nghiệm là: " + (-c / b));
            }
        } else {
            float delta = (b * b) - (4 * a * c);
            if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: " + (-b / 2 * a));
            } else if (delta < 0) {
                System.out.print("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có nghiệm x1: " + ((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.println("Phương trình có nghiệm x2: " + ((-b - Math.sqrt(delta)) / (2 * a)));

            }
        }
    }

}
