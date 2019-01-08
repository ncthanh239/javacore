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
public class XeNgT extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
    @Override
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        super.nhapTT();
        System.out.print("Nơi đến: ");
        setNoiDen(sc.nextLine());
        System.out.print("Số ngày đi được: ");
        setSoNgayDiDuoc(sc.nextInt());
    }
    
    @Override
    public void inTT(){
        super.inTT();
        System.out.println("Nơi đến: "+getNoiDen());
        System.out.println("Số ngày đi được: "+ getSoNgayDiDuoc());
    }
}
