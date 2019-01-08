/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit1;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("Mời bạn nhập thông tin cá nhân");
        System.out.println("Nhập họ và tên: ");
        String name = a.nextLine();
        System.out.println("Nhập vào lớp: ");
        String lop = a.nextLine();
        System.out.println("Nhập vào trường: ");
        String truong = a.nextLine();
        System.out.println("Nhập vào giới tính: ");
        String gt = a.nextLine();
        System.out.println("Nhập vào ngày sinh: ");
        
        int ns = a.nextInt();
         a = new Scanner(System.in);
        System.out.println("Nhập vào quê: ");
        String que = a.nextLine();
        System.out.println("Thông tin cá nhân!");
        System.out.println("Họ tên: " + name);
        System.out.println("Lớp: " + lop);
        System.out.println("Giới tính: " + gt);
        System.out.println("Ngày sinh: " + ns);
        System.out.println("Quê: " + que);
      
    }
}

    