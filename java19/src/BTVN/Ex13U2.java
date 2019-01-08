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
public class Ex13U2 {

    public static void main(String[] args) {
        int s = 0;
        int dem = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                s = s + i;
                dem++;
            }
        }
        System.out.println("Tổng các số thỏa mãn điều kiện " + s);
        System.out.println("Đếm đc có " + dem + " số thỏa mãn");
    }
}
