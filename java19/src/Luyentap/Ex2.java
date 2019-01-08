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
public class Ex2 {

    /*Viết chương trình nhập vào n số nguyên dương và tìm số nguyên lớn nhất 
    của mảng rồi in ra màn hình số nguyên lớn nhất đó kèm theo chỉ mục của nó.*/
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Mời bạn nhập vào n nguyên dương: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập n nguyên dương!");
            }
        } while (n <= 0);
        int so[] = new int[n];
        float max = so[0];
        int vitrimax = 0;
        for (int i = 0; i < so.length; i++) {
            System.out.print("Mời bạn nhập số thứ " + i + ":");
            so[i] = sc.nextInt();
            if (max < so[i]) {
                max = so[i];
                vitrimax = i;
            }
        }
        System.out.println("Số nguyên lớn nhất trong dãy là: " + max);
        System.out.println("Vị trí max là " + vitrimax);
    }
}
