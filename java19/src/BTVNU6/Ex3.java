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
public class Ex3 {

    /* Viết một chương trình đảo ngược trật tự các ký tự trong từng từ của một xâu(nhập vào từ
    bàn phím). Ví dụ “To Be Or Not To Be” sẽ trở thành “oT eB rO toN oT eB”.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Mời bạn nhập vào chuỗi:");
        s = sc.nextLine();
        String s1 = s.replaceAll("\\s+ ", " ");
        String a[] = s1.split(" ");
        String b;
        for (int i = 0; i < a.length; i++) {
            b = a[i];
            for (int j = b.length() - 1; j >= 0; j--) {
                System.out.print(b.charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println("");
        StringBuilder sb = new StringBuilder(s);
        String arr[] = sb.toString().split(" ");
        String s2;
        for (int i = 0; i < arr.length; i++) {
            s2 = arr[i];
            for (int j = s2.length() - 1; j >= 0; j--) {
                System.out.print(s2.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
