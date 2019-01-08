/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

/**
 *
 * @author Hieu Trung
 */
public class Ex04 {

    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                s = s + i;
            }

        }
        System.out.println("Tổng" + s);
        
        
        
        int s1=0;
        for (int i = 1 ; i <= 99; i=i+2) {
            s1 +=i; // s1=s1+i
            
        }
        System.out.println("Tổng :"+s1);
        // for(int i=2; i<=10;i++)
        //s+=(i*i)
    }
}
