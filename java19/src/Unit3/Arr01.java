/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Arr01 {

    public static void main(String[] args) {
        String names[] = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.print("Mời bạn nhập vào tên của bạn thứ " + i + ":");
            names[i] = sc.nextLine();
        }
        System.out.println("Danh sách lớp J19: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + "-" + names[i]);
        }
        int points[] = {2, 5, 7, 8, 9, 0};
        for (int i = 0; i < points.length; i++) {
            System.out.print("\t" + points[i]);
        }
        System.out.println("");
    }

}
