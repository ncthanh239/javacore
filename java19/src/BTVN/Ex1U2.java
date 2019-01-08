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
public class Ex1U2 {

    public static void main(String[] args) {

        for (int i = 31; i < 127; i++) {
            System.out.println(i + " ----  " + (char) i);
        }
        int j = 31;
        while (j < 127) {
            System.out.println(j + " ====  " + (char) j);
            j++;
        }
        int n = 31;
        do {
            System.out.println(n + " ____  " + (char) n);
            n++;
        } while (n < 127);

    }
}
