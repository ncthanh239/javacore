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
public class Ex1U2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,x;
        System.out.print("Mời bạn nhập vào số a: ");
        a = sc.nextFloat();
        System.out.print("Mời bạn nhập vào số b: ");
        b = sc.nextFloat();
        x = (-b/a);
        if(a==0)
        {
            if(b==0)
                System.out.print("Phương trình có vô số nghiệm");
            else
                System.out.print("Phương trình vô nghiệm");
        }
        else
        {
            System.out.print("Phương trình có nghiệm là "+ x);
        }
    }
}
