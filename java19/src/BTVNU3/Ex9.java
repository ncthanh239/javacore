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
public class Ex9 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Mời bạn nhập vào độ dài n và n phải là số lẻ : ");
            n = sc.nextInt();
            if (n <= 0||n%2==0) {
                System.out.println("Bạn phải nhập n nguyên dương và n phải là số lẻ! ");
            }
        } while (n <= 0||n%2==0);
        if (n % 2 != 0) {
            int a = 0;
            int b = 0;
            int c = n - 2;
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == n - 1) {
                    a = n;
                } else {
                    if (i < (int) n / 2) {
                        a = 2;
                        b = b + 1;
                        c = c - 2;
                    } else if (i == (int) n / 2) {
                        a = 1;
                        b = (int) n / 2;
                        c = -1;
                    } else if (i > (int) n / 2) {
                        a = 2;
                        b = b - 1;
                        c = c + 2;
                    }
                }
                for (int j = 0; j < a; j++) {
                    if (a == n) {
                        System.out.print("#");
                    } else {
                        if (j == 1) {
                            System.out.print("#");
                            for (int h = 0; h < c; h++) {
                                System.out.print(" ");
                            }
                        } else {
                            for (int k = 0; k < b; k++) {
                                System.out.print(" ");
                            }
                            System.out.print("#");
                            for (int h = 0; h < c; h++) {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                System.out.println("");
            }
        }

    }

}
