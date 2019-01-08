/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Object.NhanVien;
import common.CheckData;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hieu Trung
 */
public class QuanLyNhanVien {

    ArrayList<NhanVien> listnv = new ArrayList<>();
    public String file = "nhanvien.txt";
    int index = 0;
    NhanVien nv = new NhanVien();
    CheckData check = new CheckData();
    public void docfile() {
        try {
            BufferedReader br = null;
            FileReader fr = null;
            listnv = new ArrayList<>();

            fr = new FileReader("nhanvien.txt");
            br = new BufferedReader(fr);
            String s = null; //Tạo 1 biến s kiểu String
            try {
                while ((s = br.readLine()) != null) {
                    //Cắt chuỗi:
                    String arr[] = s.split("\t");
                    //Khởi tạo
                    NhanVien nv = new NhanVien();
                    nv.setManv(arr[0]);
                    nv.setTennv(arr[1]);
                    nv.setSdt(arr[2]);
                    nv.setEmail(arr[3]);
                    nv.setMatkau(arr[4]);
                    nv.setDiachi(arr[5]);
                    listnv.add(nv);
                }
            } catch (IOException ex) {
                Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showAll() {
        for (int i = 0; i < 10; i++) {
            listnv.get(i).showThongTinNhanVien();
        }
    }

    public void add() {
        NhanVien nv = new NhanVien();
        nv.add();
        if(checkExist(nv.getManv())){
            listnv.add(nv);
            this.showAll();
            save();
        }else{
            System.err.println("Mã nhân viên đã tồn tại thêm mới thất bại");
        }

    }

    public boolean checkExist(String id) {
        boolean flag = false;
        for (int i = 0; i < listnv.size(); i++) {
            nv = listnv.get(i);
            if (id.equalsIgnoreCase(nv.getManv())) {
                flag = true;
                index = i;
                break;

            }
        }
        return flag;
    }

    public boolean search() {
        System.out.println("Mời bạn nhập mã nhân viên cần tìm");
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for (int i = 0; i < listnv.size(); i++) {
            nv = listnv.get(i);
            if (id.equalsIgnoreCase(nv.getManv())) {
                flag = true;
                index = i;
                break;
            }
        }
        return flag;
    }

    public void delete() {
        search();
        if (search() == true) {
            System.out.println("Thông tin nhân viên tim thấy " + nv);
            listnv.remove(nv);
            save();
            System.err.println("Đã xóa thành công nhân viên!");
            System.out.println("");
        } else {
            System.out.println("Không tìm thấy nhân viên !");
        }
    }

    public void edit() {
        search();
        Scanner sc = new Scanner(System.in);
        if (search() == true) {
            System.out.println("Thông tin nhân viên tìm thấy:" + nv);
            System.out.println("Cập nhật thông tin nhân viên:");
            System.out.println("\tTên nhân viên cũ" + nv.getTennv());
            System.out.println("\tNhập vào tên nhân viên mới");
            nv.setManv(sc.nextLine());
            System.out.println("\tSố điện thoại cũ" + nv.getSdt());
            System.out.println("\tNhập vào số điện thoại mới");
            nv.setSdt(sc.nextLine());
            System.out.println("\tEmail cũ" + nv.getEmail());
            System.out.println("\tNhập vào email mới");
            nv.setEmail(sc.nextLine());
            System.out.println("\tMật khẩu cũ" + nv.getMatkau());
            System.out.println("\tNhập vào mật khẩu mới");
            nv.setMatkau(sc.nextLine());
            System.out.println("\tĐịa chỉ cũ" + nv.getDiachi());
            System.out.println("\tNhập vào địa chỉ mới");
            nv.setDiachi(sc.nextLine());

            listnv.set(index, nv);
            save();
            System.out.println("Cập nhật thông tin thành công!");

        } else {
            System.out.println("Không tìm thấy nhân viên!");
        }
    }

    public void save() {
        try {
            BufferedWriter bw = null;
            FileWriter fw = null;
            String data = "";
            for (int i = 0; i < listnv.size(); i++) {
                String row = "";
                row += listnv.get(i).getManv() + "\t";
                row += listnv.get(i).getTennv() + "\t";
                row += listnv.get(i).getSdt() + "\t";
                row += listnv.get(i).getEmail() + "\t";
                row += listnv.get(i).getMatkau() + "\t";
                row += listnv.get(i).getDiachi() + "\n";

                data += row;
            }
            fw = new FileWriter("nhanvien.txt");
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void showInfo(){
         System.out.println("+-----------------------------------------------------------------------------------------------------+");
        System.out.println("|                                      DANH SÁCH NHÂN VIÊN                                            |");
        System.out.println("+----------+----------------+-------------+---------------------+----------------+--------------------+");
        System.out.println("|  MÃ NV   |     HỌ TÊN     |     SĐT     |       EMAIL         |    MẬT KHẨU    |       ĐỊA CHỈ      |");
        System.out.println("+----------+----------------+-------------+---------------------+----------------+--------------------+");
        for (int i = 0;i< listnv.size(); i++) {
            listnv.get(i).showThongTinNhanVien();
        }
        System.out.println("+-----------------------------------------------------------------------------------------------------+");
    }


    public void menu() {
        int func=0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("+--------------------------------------------------+");
            System.out.println("|            CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN        |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [1] Xem danh sách toàn bộ nhân viên    |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [2] Thêm mới 1 nhân viên vào file      |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [3] Sửa thông tin nhân viên            |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [4] Xóa thông tin nhân viên            |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [5] Thoát                              |");
            System.out.println("+--------------------------------------------------+");
            System.out.print("Mời bạn chọn chức năng: ");
            func = input.nextInt();
            switch (func) {
                case 1: {
                    docfile();
                    showAll();
                    break;
                }
                case 2: {
                    add();
                    break;
                }
                case 3: {
                    edit();
                    break;
                }
                case 4: {
                    delete();
                    break;
                }
                case 5: {
                    System.out.println("Cảm ơn đã sử dụng chương trình !");
                    System.exit(0);
                }
                default: {
                    System.out.println("Bạn chọn sai chức năng ! ");
                }
            }
        } while (func ==1||func==2|| func==3|| func==4|| func==5);
    }

}
