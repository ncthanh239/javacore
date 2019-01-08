/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5;

/**
 *
 * @author Hieu Trung
 */
public class OverLoadingDemo {

    public static void main(String[] args) {
        System.out.println(Cong(5, 10));
        System.out.println(Cong("Zent", "Group"));
        System.out.println("" + Cong(5.5, 5));
    }

    public static int Cong(int a, int b) {
        return a + b;
    }

    public static String Cong(String a, String b) {
        return a + "  " + b;
    }

    public static double Cong(double a, double b) {
        return a + b;
    }
}
