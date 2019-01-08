/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyentap;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex3 {

    /* Viết chương trình nhập vào n số nguyên, đếm số lần xuất hiện của 
    một số nguyên trong mảng vừa nhập.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Mời bạn nhập n :");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập số nguyên dương !");
            }
        } while (n <= 0);
        int so[] = new int[n];
        int dem = 0;
        for (int i = 0; i < so.length; i++) {
            System.out.print("Mời bạn nhập vào phần tử thứ " + i + ":");
            so[i] = sc.nextInt();
        }
        System.out.print("Mời bạn nhập vào số cần kiểm tra :");
        int a = sc.nextInt();
        for (int i = 0; i < so.length; i++) {
            if (so[i] == a) {
                dem++;
            }
        }
        System.out.println("Số " + a + "xuất hiện " + dem + "lần");
    }

}
