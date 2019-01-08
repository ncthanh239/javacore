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
public class Ex1 {

    /*Viết chương trình nhập vào n số nguyên, tính giá trị trung bình
    của các phần tử trong mảng rồi in ra màn hình n số nguyên đó,
            và giá trị trung bình của n số nguyên vừa nhập.*/
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
        float s = 0;
        int dem = 0;
        for (int i = 0; i < so.length; i++) {
            System.out.print("Mời bạn nhập vào số thứ " + i + ":");
            so[i] = sc.nextInt();
            dem++;
            s = s + so[i];
        }
        System.out.println("Dãy vừa nhập là: ");
        for (int i = 0; i < so.length; i++) {
            System.out.print("\t" + so[i]);
        }
        System.out.println("\nTrung bình cộng của dãy trên là " + (float) (s / dem));
    }

}
