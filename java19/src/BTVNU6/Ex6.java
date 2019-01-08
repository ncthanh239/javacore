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
public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        String arr1 = "";
        System.out.println("Mời bạn nhập vào chuỗi");
        s = sc.nextLine();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println("Họ:" + arr[0]);
            } else if (i == arr.length - 1) {
                System.out.println("Tên:" + arr[(arr.length - 1)]);
            } else {
                arr1 += arr[i] + " ";
            }
        }
        System.out.println("Tên đệm:" + arr1);
    }
}
