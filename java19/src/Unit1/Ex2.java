/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit1;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex2 {
    public static void main(String[] args) {
     float a, b;
        Scanner so = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số a: ");
        a = so.nextInt();
        System.out.println("Mời bạn nhập vào số b: ");
        b = so.nextInt();
        System.out.println("Tổng của hai số đó là: " + (a+b));
        System.out.println("Hiệu của hai số đó là: " + (a-b));
        System.out.println("Tích của hai số đó là: " +(a*b));
        System.out.println("Thương của hai số đó là: " +(a/b));
        System.out.println("Phần dư của hai số đó là: " + (a%b));
    }
    
}
