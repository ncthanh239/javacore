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
public class Test {
    public static void main(String[] args) {
        Scanner chu= new Scanner(System.in);
        Scanner so= new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin:");
        System.out.println("Mời bạn nhập vào họ tên:");
        String name = chu.nextLine();
        System.out.println("Mời bạn nhập vào lớp:");
        String lop= chu.nextLine();
        System.out.println("Mời bạn nhập vào trường:");
        String trg=chu.nextLine();
        System.out.println("Mời bạn nhập vào ngay sinh:");
        int ns= so.nextInt();
        System.out.println("họ tên:"+ name);
        System.out.println("lop"+ lop);
        System.out.println("trường");
    }
    
    }
    

