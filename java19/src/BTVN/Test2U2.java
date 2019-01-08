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
public class Test2U2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào n: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" # ");
            }
            System.out.println("");
        }
    }
}
