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
public class XeNT extends ChuyenXe{
    private int soTuyen;
    private float soKmDiDuoc;

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(float soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
    @Override
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        super.nhapTT();
        System.out.print("Nhập số tuyến: ");
        setSoTuyen(sc.nextInt());
        System.out.print("Nhập số Km đi được: ");
        setSoKmDiDuoc(sc.nextFloat());
    }
    @Override
    public void inTT(){
        super.inTT();
        System.out.println("Số tuyến: "+ getSoTuyen());
        System.out.println("Km đi được :"+ getSoKmDiDuoc());
    }

    String getSoNgayDiDuoc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
