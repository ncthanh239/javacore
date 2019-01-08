/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVNU4;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hocsinh a= new Hocsinh();
        Hocsinh b= new Hocsinh();
        System.out.println("Nhập thông tin học sinh a: ");
        a.nhapTT();
        System.out.println("Nhập thông tin học sinh b: ");
        b.nhapTT();
        Hocsinh.kiemtra(a, b);
    }
}
