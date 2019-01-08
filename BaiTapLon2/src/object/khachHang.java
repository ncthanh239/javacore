/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import common.CheckData;
import java.util.ArrayList;

/**
 *
 * @author Hieu Trung
 */ //Mã khách hàng, Tên khách hàng, số điện thoại, email, địa chỉ
public class khachHang {
   private String iDKh;
   private String hoTenKh;
   private String soDienThoaiKh;
   private String emailKh;
   private String diaChiKh;
CheckData check = new CheckData();

   
   ArrayList<khachHang> listkh = new ArrayList<>();
    public khachHang() {
    }

    public khachHang(String iDKh, String hoTenKh, String soDienThoaiKh, String emailKh, String diaChiKh) {
        this.iDKh = iDKh;
        this.hoTenKh = hoTenKh;
        this.soDienThoaiKh = soDienThoaiKh;
        this.emailKh = emailKh;
        this.diaChiKh = diaChiKh;
    }

    public String getiDKh() {
        return iDKh;
    }

    public void setiDKh(String iDKh) {
        this.iDKh = iDKh;
    }

    public String getHoTenKh() {
        return hoTenKh;
    }

    public void setHoTenKh(String hoTenKh) {
        this.hoTenKh = hoTenKh;
    }

    public String getSoDienThoaiKh() {
        return soDienThoaiKh;
    }

    public void setSoDienThoaiKh(String soDienThoaiKh) {
        this.soDienThoaiKh = soDienThoaiKh;
    }

    public String getEmailKh() {
        return emailKh;
    }

    public void setEmailKh(String emailKh) {
        this.emailKh = emailKh;
    }

    public String getDiaChiKh() {
        return diaChiKh;
    }

    public void setDiaChiKh(String diaChiKh) {
        this.diaChiKh = diaChiKh;
    }
    public void inDuLieu(){
    System.out.printf("|%14s|%25s|%17s|%15s|%19s|\n", getiDKh(), getHoTenKh(), getSoDienThoaiKh(), getEmailKh(),getDiaChiKh());
}
}
