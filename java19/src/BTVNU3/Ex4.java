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
public class Ex4 {

    /*Viết chương trình nhập vào n số nguyên và in mảng
    đó theo thứ tự ngược lại*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Mời bạn nhập vào n :");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập số nguyên dương!");
            }
        } while (n <= 0);
        int so[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Mời bạn nhập vào phần tử thứ " + i + ":");
            so[i] = sc.nextInt();
        } System.out.println("Mảng được đảo ngược là: ");
        for (int j = n - 1; j >= 0; j--) {
            System.out.print("\t" + so[j]);
            
        }
    }
}
