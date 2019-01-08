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
public class Ex1 {

    /*Viết chương trình nhập vào một chuỗi bất kỳ rồi in ra ký
    tự đầu tiên và ký tự cuối cùng trong chuỗi.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Mời bạn nhập vào chuỗi: ");
        s = sc.nextLine();
        System.out.println("Chuỗi vừa nhập là: " + s);
        System.out.print("Ký tự đầu tiên của chuỗi là: ");
        System.out.println(s.charAt(0));
        System.out.print("Ký tự cuối cùng của chuỗi là: ");
        System.out.println(s.charAt(s.length() - 1));

    }
}
