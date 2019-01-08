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
public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("Moi ban nhap vao x>0: ");
            x = sc.nextInt();
        } while (x < 0);
    }
}
