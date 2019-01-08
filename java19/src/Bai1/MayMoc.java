/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Hieu Trung
 */
public class MayMoc {
     private String ten;
    private String hangSx;
    private String xuatSu;
    private int gia;
    private int namSx;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public String getXuatSu() {
        return xuatSu;
    }

    public void setXuatSu(String xuatSu) {
        this.xuatSu = xuatSu;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

}

interface iBay {

    void bay();
}

interface iBoi {

    void boi();
}

interface iChay {

    void chay();
}

interface iThongTin {

    String name = "Zent Group";

    public void InTT();

    public void NhapTT();

}

class chim extends DongVat implements iBay {

    @Override
    public void bay() {
        System.out.println("chim bay rất cao");
    }

}

class ca extends DongVat implements iBoi {

    @Override
    public void boi() {
        System.out.println("cá bơi rất giỏi");
    }

}

class MayBay extends MayMoc implements iBay {

    @Override
    public void bay() {
        System.out.println("Máy bay bay rất nhanh");
    }

    public void chay() {
        System.out.println("Máy bay đang chay đà ");
    }

}

class Thuyen extends MayMoc implements iBoi {

    @Override
    public void boi() {
        System.out.println("Thuyền bơi rất xa");
    }

}

