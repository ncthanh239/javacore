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
public class Ex6 {

    /*Viết chương trình nhập vào n số nguyên, in ra danh sách số chẵn, số lẻ.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Mời bạn nhập vào n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập n nguyên dương! ");
            }
        } while (n <= 0);
        int so[] = new int[n];
        int chan[] = new int[n];
        int le[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Mời bạn nhập vào phần tử thứ " + i + ":");
            so[i] = sc.nextInt();
        }
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (so[i] % 2 == 0) {
                chan[j] = so[i];
                j++;
            } else {
                le[k] = so[i];
                k++;
            }
        }
        System.out.println("Mảng chẵn là: ");
        for (int i = 0; i < j; i++) {
            System.out.print("\t" + chan[i]);
        }
        System.out.println("\nMảng lẻ là: ");
        for (int i = 0; i < k; i++) {
            System.out.print("\t" + le[i]);
        }
    }

}
