/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex11U2 {
    //Đề bài: Viết chương trình sử dụng hàm tính diện tích hình tròn với bán kính r bất kỳ được nhập từ bàn phím. ( r được nhập trong hàm Main ).

    public static double tinhdt(double r) {
        double s = (Math.PI) * r * r;
        return s;
    }

    public static void main(String[] args) {
        double r;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào bán kính r: ");
        r = sc.nextFloat();
        System.out.println("Kết quả " + tinhdt(r));
    }
}
