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
public class vidu2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Moi ban nhap vao so n="); //sout + tab
        int numb = sc.nextInt();

        if (numb > 0) {
            System.out.println("Số " + numb + " là số dương");
            if (numb % 2 == 0) {
                System.out.println("Số " + numb + " là số dương chẵn");
                        
            } else {
                System.out.println("Số " + numb + " là số dương lẻ");
            }
        } else if (numb < 0) {
            System.out.println("Số " + numb + " là số âm");
            if (numb % 2 == 0) {
                System.out.println("Số " + numb + " là số âm chẵn");
            } else {
                System.out.println("Số " + numb + " là số âm lẻ");
            }
        } else {
            System.out.println("Số " + numb + " là số KHÔNG");
        }
    }
}

