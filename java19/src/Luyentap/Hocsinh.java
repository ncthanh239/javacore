/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyentap;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Hocsinh {
 private String hoten;
    private String lop;
    private float diem;
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên :");
        hoten=sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop=sc.nextLine();
        System.out.print("Nhập điểm: ");
        diem=sc.nextFloat();
    }
    public void inTT(){
        System.out.print("Họ tên " + hoten);
        System.out.print("Lớp " + lop);
        System.out.print("Điểm " + diem );
    }
    public static void kiemtra(Hocsinh a, Hocsinh b){
        if(a.diem>b.diem){
            a.inTT();
        }else{
              b.inTT();  
                }
    }
}
