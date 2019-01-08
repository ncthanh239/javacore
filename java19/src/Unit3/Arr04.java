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
public class Arr04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[1];
        arr[2] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Mời bạn nhập vào phần tử 0 dòng " + i + " cột " + j + ":");
                arr[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println("");
        }

    }
}
