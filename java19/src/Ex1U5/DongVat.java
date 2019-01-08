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
abstract class DongVat {

    private String loai;
    private String ten;
    private String lop;
    private int tuoi;
    private String moitruong;

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setNoiSong(String lop) {
        this.lop = lop;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMoitruong() {
        return moitruong;
    }

    public void setDacDiem(String moitruong) {
        this.moitruong = moitruong;
    }
}

interface iChay {

}

class Chim extends DongVat implements iBay {

    public void Bay() {
        System.out.println("Chim thì bay ");
    }
}

class Ca extends DongVat implements iBoi {

    public void Boi() {
        System.out.println("Cá thì bơi ");
    }
}
