/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class vidusswitchcase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số nguyên!");
        int songuyen = sc.nextInt();
        switch (songuyen) {
            case 1: {
                System.out.println("Đây là số 1");
            }

            break;
            case 2: {
                System.out.println("Đây là số 2");
            }

            break;
            case 3: {
                System.out.println("Đây là số 3");
            }

            break;
            case 4: {
                System.out.println("Đây là số 4");
            }

            break;
            default: {
                System.out.println("Bạn nhập sai rồi");
            }

        }
        
    }
}
