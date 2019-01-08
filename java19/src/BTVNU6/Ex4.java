/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVNU6;
import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex4 {

    /*Viết một chương trình đọc vào chuỗi số bất kỳ : ví dụ 1132422323, sau đó in ra
    màn hình dưới dạng : 1,132,422,323*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Mời bạn nhập chuỗi số : ");
        s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int dem = sb.length() - 3;
        do {
            sb.insert(dem, ",");
            dem = dem - 3;
        } while (dem > 0);
        System.out.println("Chuỗi được thay đổi:" + sb);
    }
}
