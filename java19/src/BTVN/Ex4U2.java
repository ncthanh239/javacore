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
public class Ex4U2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào n nguyên dương: ");
        int n = sc.nextInt();
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt = gt * i;
        }
        System.out.println("Kết quả:= " + gt);
    }
}
