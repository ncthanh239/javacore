/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN;

/**
 *
 * @author Hieu Trung
 */
public class Ex8U2 {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int k = 8; k > 8 - i; k--) {
                System.out.print("   ");
            }
            for (int j = 8; j > i; j--) {

                System.out.print(" # ");
            }

            System.out.println("  ");
        }

    }
}