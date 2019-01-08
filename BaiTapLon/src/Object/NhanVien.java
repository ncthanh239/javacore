/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import common.CheckData;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class NhanVien {
    private String manv;
    private String tennv;
    private String sdt;
    private String email;
    private String matkau;
    private String diachi;
    CheckData check = new CheckData();

   
   ArrayList<NhanVien> listnv = new ArrayList<>();
        
       
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatkau() {
        return matkau;
    }

    public void setMatkau(String matkau) {
        this.matkau = matkau;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    /*@Override
    public String toString(){
        return this.manv+ "-" +this.tennv; 
    }*/
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin nhân viên:");
        System.out.print("Nhập mã nhân viên:");
        this.manv = sc.nextLine();
        do {
           System.out.print("Nhập tên nhân viên:");
           this.tennv = sc.nextLine();
           if (check.ktraTenNV(this.tennv)){
               System.err.println("Tên nhân viên không được chứa số hoặc rỗng!");
        }
        } while (check.ktraTenNV(this.tennv));
        do {
             System.out.print("Nhập số điện thoại:");
             this.sdt = sc.nextLine();
        } while (check.ktraSoDT(this.sdt));
        do {
             System.out.print("Nhập email:");
             this.email = sc.nextLine();
        } while (check.ktraEmail(this.email));
        
        System.out.print("Nhập mật khẩu:");
        this.matkau = sc.nextLine();
        System.out.print("Nhập địa chỉ:");
        this.diachi = sc.nextLine();
    }
    public void showThongTinNhanVien(){
    System.out.printf("|%10s|%16s|%13s|%21s|%16s|%20s|\n", getManv(), getTennv(), getSdt(), getEmail(), getMatkau(), getDiachi());
}

       @Override
    public String toString() {
        return this.manv +"\t"+this.tennv+"\t"+this.sdt+"\t"+this.email+"\t"+this.matkau+"\t"+this.diachi;
    }

   


}
