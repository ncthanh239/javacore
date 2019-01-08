/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex5U2 {

    

    public static int giaithua(int n) {
        int gt = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
               gt = gt * i;
            }
        }
        return gt;
    }

    public static void main(String[] args) {
        int n;
        float s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            s = s + (float)i / giaithua(i);
        }
        System.out.println("Kết quả:= " + s);
    }
}
