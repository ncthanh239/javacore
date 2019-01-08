/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class vidu1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số nguyên: ");
        int songuyen = sc.nextInt();
        if(songuyen%2==0)
        { System.out.println(songuyen+"là số chẵn");
        
        }
        else
        {System.out.println(songuyen+"là số lẻ");
    }
    }
}
