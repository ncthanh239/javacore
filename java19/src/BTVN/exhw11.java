/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN;

import java.util.Scanner;

/**
 *
 * @author phamvantai
 */
public class exhw11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("nhập n: ");
            n = input.nextInt();
            if (n < 0) {
                System.out.println("nhập lại");
            }
        } while (n < 0);
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ":");
            a[i] = input.nextInt();
        }
        System.out.println("Mảng đầu vào là:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i] + "");
        }
        System.out.println("");

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tg;
                tg = a[i];
                a[i] = a[min];
                a[min] = tg;
            }
        }
        System.out.println("Mảng đã sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
    }
}
