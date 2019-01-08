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
public class ChuyenXe {
    String maChuyenXe;
    String hoTenTaiXe;
    String soXe;
    float doanhThu;
    public String getMaChuyenXe() {
        return maChuyenXe;
    }

    public void setMaChuyenXe(String maChuyenXe) {
        this.maChuyenXe = maChuyenXe;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }

    public ChuyenXe() {
    }

    public ChuyenXe(String maChuyenXe, String hoTenTaiXe, String soXe, float doanhThu) {
        this.maChuyenXe = maChuyenXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số chuyến xe: ");
        maChuyenXe= sc.nextLine();
        System.out.print("Nhập tên tài xế :");
        hoTenTaiXe=sc.nextLine();
        System.out.print("Nhập số xe: ");
        soXe=sc.nextLine();
        System.out.print("Nhập doanh thu: ");
        doanhThu=sc.nextFloat();
    }
    public void inTT(){
        System.out.println("Mã chuyến xe : "+ maChuyenXe);
        System.out.println("Họ tên tài xế: "+ hoTenTaiXe);
        System.out.println("Biển kiểm soát: "+ soXe);
        System.out.println("Doanh thu; "+ doanhThu);
    }
}


