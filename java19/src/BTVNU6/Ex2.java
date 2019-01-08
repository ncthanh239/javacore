/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVNU6;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex2 {

    /*Viết chương trình kiểm tra một chuỗi nhập vào
    có phải là palindrome hay không?*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c;
        System.out.println("Mời bạn nhập vào chuỗi: ");
        c = sc.nextLine();
        String c1 = "";
        for (int i = c.length() - 1; i >= 0; i--) {
            c1 += c.charAt(i);
        }
        if (c1.equalsIgnoreCase(c)) {
            System.out.println(c + " là chuỗi Palindrome! ");
        } else {
            System.out.println(c + " không phải là chuỗi Palindrome! ");
        }
    }
}
