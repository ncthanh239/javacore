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
public class Ex03 {
    public static void main(String[] args) {
        float s=0;
        for (float i = 1; i <= 100; i++) {
            s=s+ (float)1/i;
            
        }
        System.out.println("Tổng: ="+ s);
    }
    
}
