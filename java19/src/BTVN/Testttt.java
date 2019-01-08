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
public class Testttt {
    public static double ktra(double r){
        double s= (Math.PI)*r*r;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0;
                double r;
                System.out.println("Mời bạn nhập bk ");
                r=sc.nextFloat();
                System.out.println("Diện tích "+ktra(r));
    }
    
}
