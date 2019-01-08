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
public class Ex11 {

    /*Nhập vào mảng n phần tử từ bàn phím và sử dụng thuật toán 
    Selection sort để sắp xếp theo chiều tăng dần.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Mời bạn nhập vào n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập n nguyên dương!");
            }
        } while (n <= 0);
        int so[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Mời bạn nhập vào phần tử thứ " + i + ":");
            so[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (so[min] > so[j]) {
                    min = j;
                }
                if (min != i) {
                    int tg;
                    tg = so[i];
                    so[i] = so[min];
                    so[min] = tg;
                }
            }
        }
        System.out.println("Mảng đã sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + so[i]);
        }
    }
}
