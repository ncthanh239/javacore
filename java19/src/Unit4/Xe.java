/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Xe {

    //Thuộc tính
    private String tenXe;
    public String getTenXe(){
        return tenXe;
    }
    public void setTenXe(String name){
        tenXe= name;
    }
    private String hangSX;
    private int namSX;
    private int soCho;
    private String mauSac;

    //phuong thức
    
    public void chay() {
        System.out.println("Đây là phương thức chạy!");
    }
    public Xe(){
        System.out.println("Range Rover");
    }
    public Xe(String name){
        tenXe= name;
    }
    public Xe(String name, int year){
        tenXe= name;
        namSX= year;
    }
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên xe :");
        tenXe=sc.nextLine();
        System.out.print("Mời bạn nhập hãng xe :");
        hangSX=sc.nextLine();
        System.out.print("Mời bạn nhập năm sx :");
        namSX=sc.nextInt();
        System.out.print("Mời bạn nhập số chỗ :");
        soCho=sc.nextInt();
        sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập màu sắc :");
        mauSac=sc.nextLine();
    }
    public void InTT(){
        System.out.println("Tên xe :"+ tenXe);
        System.out.println("Hãng xe :"+ hangSX);
        System.out.println("Số chỗ :"+ soCho);      
        System.out.println("Màu sắc :"+ mauSac);
        System.out.println("Năm SX :"+ namSX);
    }
}
