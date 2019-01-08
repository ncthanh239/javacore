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
public class Ex07Ham {

    public static void InTT(String name, String email, String phone) {
        System.out.println("---------");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone; " + phone);
    }
    public static int Tinhtong(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        InTT("Mguyen Chi Thanh", "michellenguyen239@gmail.com", "01657839922");
        InTT("Mguyen Chi Thanh", "michellenguyen239@gmail.com", "01657839922");
        Tinhtong(10, 20);
        Tinhtong(100, 200);

    }
}
