/*
 * To change this license header, choose License Headers in Project Properties.
+ * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6;

/**
 *
 * @author Hieu Trung
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Start");
        String arr[] = new String[4];
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println(arr[i]);
            }
            System.out.println(10 / 1);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("End");
    }
}
