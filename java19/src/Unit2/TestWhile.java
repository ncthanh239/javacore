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
public class TestWhile {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Anh xin lỗi em lần thứ" + i);

        }
        int i = 1;
        while (i <= 10) {
            System.out.println("Anh xin lỗi em lần thứ" + i);
            i++;
        }
        int n = 1;
        do {
            System.out.println("Anh xin lỗi em lần thứ" + n);
            n++;

        } while (n <= 10);
    }

}
