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
public class Ex02 {
    public static void main(String[] args) {
        Scanner ban_phim = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên: ");
        String name = ban_phim.nextLine();
        System.out.println("Mời bạn nhập vào tuổi: ");
        int age = ban_phim.nextInt();
        System.out.println("Hello" + name + "Age:"+age);
    }
    
}
