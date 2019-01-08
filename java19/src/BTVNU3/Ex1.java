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
public class Ex1 {

    /*Viết chương trình nhập vào n số nguyên, tính giá trị trung bình
    của các phần tử trong mảng rồi in ra màn hình n số nguyên đó,
            và giá trị trung bình của n số nguyên vừa nhập.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Mời bạn nhập n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập số nguyên dương !");
            }
        } while (n <= 0);

        int so[] = new int[n];
        float s = 0;
        int dem = 0;
        for (int i = 0; i < so.length; i++) {
            System.out.print("Mời bạn nhập vào phần tử thứ " + i + ":");
            so[i] = sc.nextInt();
            dem++;
            s = s + so[i];
        }
        System.out.print("Dãy vừa nhập là: ");
        for (int i = 0; i < so.length; i++) {
            System.out.print("\t" + so[i]);
        }

        System.out.println("\nTrung bình cộng của dãy số là :" + (float) (s / (dem)));
        System.out.println("");
    }

}
