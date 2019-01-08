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
public class Ex3 {
    public static void main(String[] args) {
        int a,b;
        Scanner so = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số a: ");
        a = so.nextInt();
        System.out.println("Mời bạn nhập vào số b: ");
        b = so.nextInt();
        System.out.println("Số lớn hơn là: " + (a>b? a : b));
        
    }
}
