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
public class QuanLiXe {

    int n;
    Scanner sc = new Scanner(System.in);
    float tgdoanhthu = 0;
    float tgdoanhthu1 = 0;
    XeNT[] noithanh;
    XeNgT[] ngoaithanh;

    public void nhapXeNT() {
        do {
            System.out.print("Mời nhập số lượng xe: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Mời nhập lại! ");
            }
        } while (n <= 0);
        noithanh = new XeNT[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập xe thứ: " + (i + 1));
            noithanh[i] = new XeNT();
            noithanh[i].nhapTT();
            tgdoanhthu = tgdoanhthu + noithanh[i].getDoanhThu();
        }
    }

    public void inXeNT() {
        System.out.println("Thông tin tuyến xe: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Mã số xe: " + noithanh[i].getSoXe());
            System.out.println("Họ tên Lái Xe: " + noithanh[i].getHoTenTaiXe());
            System.out.println("Biển kiểm soát: " + noithanh[i].getSoXe());
            System.out.println("Số tuyến: " + noithanh[i].getSoTuyen());
            System.out.println("Số Km: " + noithanh[i].getSoKmDiDuoc());
            System.out.println("Doanh thu: " + noithanh[i].getDoanhThu());
        }
        System.out.println("Tổng doanh thu: " + tgdoanhthu);
    }

    public void nhapXeNgT() {
        do {
            System.out.print("Mời nhập số lượng xe: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Mời nhập lại! ");
            }
        } while (n <= 0);
        ngoaithanh = new XeNgT[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập xe thứ " + (i + 1));
            ngoaithanh[i] = new XeNgT();
            ngoaithanh[i].nhapTT();
            tgdoanhthu1 = tgdoanhthu1 + ngoaithanh[i].getDoanhThu();
        }
    }

    public void inXeNgT() {
        System.out.println("Thông tin tuyến xe: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Mã số xe: " + ngoaithanh[i].getSoXe());
            System.out.println("Họ tên Lái Xe: " + ngoaithanh[i].getHoTenTaiXe());
            System.out.println("Biển kiểm soát: " + ngoaithanh[i].getSoXe());
            System.out.println("Nơi đến: " + ngoaithanh[i].getNoiDen());
            System.out.println("Số ngày đi được: "+ ngoaithanh[i].getSoNgayDiDuoc());
            System.out.println("Doanh thu: " + ngoaithanh[i].getDoanhThu());
        }
        System.out.println("Tổng doanh thu :"+ tgdoanhthu1);
    }
}
