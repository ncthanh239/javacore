/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyentap;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class vdptb1 {
   public static void main(String[] args) {
        System.out.println("GIẢI PHƯƠNG TRÌNH BẬC NHẤT ax+b=0");
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập hệ số a= ");
        float a = input.nextFloat();
        System.out.print("Nhập hệ số b= ");
        float b = input.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình đã cho có vô số nghiệm.");
            } else {
                System.out.println("Phương trình đã cho vô nghiệm");
            }
        } else {
            float x1;
            x1 = (-b / a);
            System.out.println("Phương trình đã cho có nghiệm x= " + x1);
        }

    }  
}
