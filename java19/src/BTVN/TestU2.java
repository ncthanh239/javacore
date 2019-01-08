/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class TestU2 {
    public static double tinhdt(double r){
         double s= (Math.PI)* r*r;
         return s;
    }
    public static void main(String[] args) {
        float s=0;
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào bk r :");
       r=sc.nextFloat();
        System.out.println("Diện tích "+ tinhdt(r));
        
    }
}
