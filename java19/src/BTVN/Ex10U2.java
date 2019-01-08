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
public class Ex10U2 {

    public static boolean ktra(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập n: ");
        n = sc.nextInt();
        if (ktra(n) == true) {
            System.out.println(n + " là số chẵn!");
        } else {
            System.out.println(n + " là số lẻ!");
        }

    }
}
