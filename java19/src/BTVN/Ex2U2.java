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
public class Ex2U2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào n nguyên dương:= ");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + i;

        }
        System.out.println("Tổng:= " + s);

    }

}
