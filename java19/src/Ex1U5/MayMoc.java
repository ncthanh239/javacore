/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1U5;

/**
 *
 * @author Hieu Trung
 */
abstract class MayMoc {
    private String ten;
    private String hangSX;
    private String xuatXu;
    private String mau;
    private int namSX;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getGia() {
        return mau;
    }

    public void setGia(String mau) {
        this.mau = mau;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNam(int namSX) {
        this.namSX = namSX;
    }

}

interface iBay {

}

interface iBoi {

}

interface iThongTin {

    String name = "Zent Group";

    public void InTT();

    public void NhapTT();
}

class MayBay extends MayMoc implements iBay,iChay {

    public void bay() {
        System.out.println("Máy bay thì bay ");
    }
    public void chay(){
        System.out.println("Máy bay thì chạy ");
    }
}

class Thuyen extends MayMoc implements iBoi {

    public void boi() {
        System.out.println("Thuyền thì bơi ");
    }
}
