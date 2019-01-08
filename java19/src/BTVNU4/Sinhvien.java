/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVNU4;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Sinhvien {
  private  String hoten;
  private  String lop;
  private  String ns;
  private  String que;
  private  float diem;
  private  String truong;
  private  String gt;
  private  String khoa;
  private  String sothich;
  private  String hocluc;
  public Sinhvien(){
      
  }
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

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getSothich() {
        return sothich;
    }

    public void setSothich(String sothich) {
        this.sothich = sothich;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }
   
  public void Sinhvien(){
    
  }
  public Sinhvien(String hoten){
      this.hoten=hoten;
      
      
  }
  public Sinhvien(String hoten, String lop){
     this.hoten=hoten;
     this.lop=lop;
    
  }
  public Sinhvien(String hoten, String lop, float diem){
      this.hoten=hoten;
      this.lop=lop;
      this.diem=diem;
      
  }
  public Sinhvien(String hocluc, String sothich, String ns , String khoa){
      this.hocluc=hocluc;
      this.khoa=khoa;
      this.sothich=sothich;
      this.ns=ns;
      
  }
  public void nhapTT(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhập tên: ");
      setHoten(sc.nextLine());
      System.out.print("Nhập lớp: ");
      setLop(sc.nextLine());
      System.out.print("Nhập điểm: ");
      setDiem(sc.nextFloat());
      sc = new Scanner(System.in);
      System.out.print("Nhập ngày sinh: ");
      setNs(sc.nextLine());
      System.out.print("Nhập giới tính: ");
      setGt(sc.nextLine());
      System.out.print("Nhập trường: ");
      setTruong(sc.nextLine());
      System.out.print("Nhập khoa: ");
      setKhoa(sc.nextLine());
      System.out.print("Nhập học lực: ");
      setHocluc(sc.nextLine());
      System.out.print("Quê: ");
      setQue(sc.nextLine());
      System.out.print("Sở thích: ");
      setSothich(sc.nextLine());
  }
  public void inTT(){
      System.out.println("Họ tên: "+ getHoten());
      System.out.println("Lớp: "+ getLop());
      System.out.println("Điểm: "+ getDiem());
      System.out.println("Ngày sinh: "+ getNs());
      System.out.println("Giới tính: "+ getGt());
      System.out.println("Trường: "+ getTruong());
      System.out.println("Khoa: "+ getKhoa());
      System.out.println("Học lực: "+ getHocluc());
      System.out.println("Quê: "+ getQue());
      System.out.println("Sở thích: "+ getSothich());
  }
}
