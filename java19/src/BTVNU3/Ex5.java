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
public class Ex5 {

    /*Viết chương trình xóa đi một phần tử tại chỉ mục k,
    với k được nhập vào từ bàn phím.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Mời bạn nhập vào n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("bạn phải nhập số nguyên dương ! ");
            }
        } while (n <= 0);
        int so[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Mời bạn nhập vào phần tử thứ " + i + ":");
            so[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + so[i]);
        }
        System.out.print("\nNhập vị trí xóa k :");
        int k = sc.nextInt();
        int j;
        for (int i = j = 0; i < n; i++) {
            if (i != k) {
                so[j] = so[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            so[i] = so[i];
        }
        System.out.println("Mảng sau khi xóa là ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print("\t" + so[i]);
        }
    }
}
