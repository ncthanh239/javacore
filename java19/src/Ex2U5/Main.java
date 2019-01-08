/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2U5;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Main {
    QuanLiXe qlx = new QuanLiXe();
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("1- XE NỘI THÀNH! ");
            System.out.println("2- XE NGOẠI THÀNH! ");
            System.out.println("3- THOÁT! ");
            System.out.print("Mời bạn chọn menu: ");
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    qlx.nhapXeNT();
                    qlx.inXeNT();
                    break;
                }
                case 2: {
                    qlx.nhapXeNgT();
                    qlx.inXeNgT();
                    break;
                }
                case 3: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Bạn chọn sai chức năng! ");
                }
            }
        } while (n != 3);
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.menu();
    }
}
