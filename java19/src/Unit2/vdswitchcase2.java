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
public class vdswitchcase2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----menu-----");
        System.out.println("1.-----Nhập thông tin sinh viên-----");
        System.out.println("2.-----Sửa thông tin sinh viên-----");
        System.out.println("3.-----Xóa thông tin sinh viên-----");
        System.out.println("4.-----Thoát-----");
        System.out.println("Mời bạn chọn menu: ");
        int songuyen = sc.nextInt();
        switch (songuyen) {
            case 1: {
                System.out.println("Nhập thông tin sinh viên");
            }

            break;
            case 2: {
                System.out.println("Sửa thông tin sinh viên");

            }

            break;
            case 3: {
                System.out.println("Xóa thông tin sinh viên");
            }

            break;
            case 4: {
                System.out.println("Thoát");
                System.exit(0);
            }

            break;
            default: {
                System.out.println("Bạn nhập sai rồi");
            }

        }
    }

}
