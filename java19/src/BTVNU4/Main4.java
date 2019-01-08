/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVNU4;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Sinhvien sv[];
        do {System.out.print("Mời bạn nhập vào n sinh viên: ");
            n=sc.nextInt();
            if(n<=0){
                System.out.println("Bạn phải nhập n nguyên dương! ");
            }
        } while (n<=0);
        sv= new Sinhvien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ "+ i);
            sv[i] = new Sinhvien();
            sv[i].nhapTT();
        }
        for (int i = 0; i < n; i++) {
            sv[i].inTT();
        }
    }
}
