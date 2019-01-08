/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import common.CheckData;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class nhanVien {
    private String hoVaTen;
    private String iD;
    private String soDienThoai;
    private String diaChi;
    private String email;
    private String matKhau;
 CheckData check = new CheckData();

   
   ArrayList<nhanVien> listnv = new ArrayList<>();
   
    public nhanVien() {
    }

    public nhanVien(String hoVaTen, String iD, String soDienThoai, String diaChi, String email, String matKhau) {
        this.hoVaTen = hoVaTen;
        this.iD = iD;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.email = email;
        this.matKhau = matKhau;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
   public void inDuLieu(){
    System.out.printf("|%14s|%25s|%17s|%29s|%19s|\n", getID(), getHoVaTen(), getSoDienThoai(), getEmail(),getDiaChi());
}
    
}
