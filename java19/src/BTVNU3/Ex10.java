/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVNU3;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Mời bạn nhập vào n nguyên dương: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập n nguyên dương!");
            }
        } while (n <= 0);

        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            a++;
            System.out.println(" ");
        }
    }
}
