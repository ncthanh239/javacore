/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import common.CheckData;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Hieu Trung
 */
public class sanPham {
     private String iDSp;
    private String tenSp;
    private String soLuongSp;
    private String donGiaSp;

     CheckData check = new CheckData();

   
   ArrayList<sanPham> listsp = new ArrayList<>();
    public sanPham() {
    }

    public sanPham(String iDSp, String tenSp, String soLuongSp, String donGiaSp) {
        this.iDSp = iDSp;
        this.tenSp = tenSp;
        this.soLuongSp = soLuongSp;
        this.donGiaSp = donGiaSp;
    }

    public String getiDSp() {
        return iDSp;
    }

    public void setiDSp(String iDSp) {
        this.iDSp = iDSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getSoLuongSp() {
        return soLuongSp;
    }

    public void setSoLuongSp(String soLuongSp) {
        this.soLuongSp = soLuongSp;
    }

    public String getDonGiaSp() {
        return donGiaSp;
    }

    public void setDonGiaSp(String donGiaSp) {
        this.donGiaSp = donGiaSp;
    }
    public void chuanHoaTien(){
        DecimalFormat fm = new DecimalFormat("#,###");
        System.out.printf("|%14s|%25s|%20s|%19s|\n", getiDSp(), getTenSp(), getSoLuongSp(), fm.format(Long.parseLong(this.donGiaSp)));
    }
    public void inDuLieu(){
    System.out.printf("|%14s|%25s|%20s|%19s|\n", getiDSp(), getTenSp(), getSoLuongSp(), getDonGiaSp());
} 
}
