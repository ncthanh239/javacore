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
public class Ex7 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Mời bạn nhập độ dài cạnh hình vuông n: ");
            n = sc.nextInt();
            if(n<=0){
                System.out.println("Bạn phải nhập n nguyên dương!");
            }
        } while (n <= 0);
        int a, b = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                a = n;
                b = 0;
            } else {
                a = 2;
                b = n - 2;
            }
            for (int j = 0; j < a; j++) {
                System.out.print("#");
                for (int k = 0; k < b; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
