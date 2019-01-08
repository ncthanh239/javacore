/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import Main.main;
import java.util.ArrayList;
import java.util.Scanner;
import object.nhanVien;
import checkdata.check;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static object.nhanVien.md5;

/**
 *
 * @author Hieu Trung
 */
public class QuanLiNhanVien {
    



    ArrayList<nhanVien> listnv = new ArrayList<>();
    nhanVien nv = new nhanVien();
    Scanner nhap = new Scanner(System.in);
    int index = 0;
    check ch = new check();
    private String filename = "nhanvien.txt";

    public void save() {
        try {
            BufferedWriter bw = null;
            FileWriter fw = null;
            String data = "";
            for (int i = 0; i < listnv.size(); i++) {
                String row = "";
                row += listnv.get(i).getID() + "\t";
                row += listnv.get(i).getHoVaTen() + "\t";
                row += listnv.get(i).getMatKhau() + "\t";
                row += listnv.get(i).getSoDienThoai() + "\t";
                row += listnv.get(i).getDiaChi() + "\t";
                row += listnv.get(i).getEmail() + "\n";
                data += row;
            }
            fw = new FileWriter(this.filename);
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(quanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadFile() {
        try {
            BufferedReader br = null;
            FileReader fr = null;
            listnv = new ArrayList<>();
            fr = new FileReader(this.filename);
            br = new BufferedReader(fr);
            String s = null;
            try {
                while ((s = br.readLine()) != null) {
                    String arr[] = s.split("\t");
                    nhanVien nv = new nhanVien();
                    nv.setID(arr[0]);
                    nv.setHoVaTen(arr[1]);
                    nv.setMatKhau(arr[2]);
                    nv.setSoDienThoai(arr[3]);
                    nv.setDiaChi(arr[4]);
                    nv.setEmail(arr[5]);
                    listnv.add(nv);
                }
            } catch (IOException ex) {
                Logger.getLogger(quanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(quanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hienThiDS() {
        System.out.println("");
        if (listnv.isEmpty()) {
            System.out.println("");
            System.out.println(" CHƯA CÓ THÔNG TIN! ");
        } else {

            System.out.println("+----------------------------------------------------------------------------------------------+");
            System.out.println("|                                  THÔNG TIN NHÂN VIÊN                                         |");
            System.out.println("+--------------+-------------------------+-----------------+---------------+-------------------+");
            System.out.println("| Mã nhân viên |      Tên nhân viên      |  Số điện thoại  |    Địa chỉ    |       Email       |");
            System.out.println("+--------------+-------------------------+-----------------+---------------+-------------------+");
            for (int i = 0; i < listnv.size(); i++) {
                listnv.get(i).inDuLieu();
            }

            System.out.println("+----------------------------------------------------------------------------------------------+");

        }
    }

    public boolean timKiem() {
        System.out.println("");
        System.out.print(" Nhập mã nhân viên cần tìm kiếm : ");
        String id = nhap.nextLine();
        boolean check = false;
        for (int i = 0; i < listnv.size(); i++) {
            nv = listnv.get(i);
            if (id.equalsIgnoreCase(nv.getID())) {
                check = true;
                index = i;
                break;

            }
        }
        return check;

    }

    public boolean checkID(String id) {

        boolean check = false;
        for (int i = 0; i < listnv.size(); i++) {
            nv = listnv.get(i);
            if (id.equalsIgnoreCase(nv.getID())) {
                check = true;
                index = i;
                break;

            }
        }
        return check;
    }

    public void xoaNhanVien() {
        System.out.println("");
        if (timKiem() == true) {
            listnv.remove(nv);
            System.out.println(" ĐÃ XÓA THÔNG TIN NHÂN VIÊN! ");
            save();
        } else {
            System.out.println(" KHÔNG TÌM THẤY THÔNG TIN NHÂN VIÊN! ");
        }
    }

    public void themNhanVien() {
        System.out.println("");
        nhanVien nv = new nhanVien();
        loadFile();
        System.out.println("---- NHẬP THÔNG TIN NHÂN VIÊN ----");
        System.out.println("");
        do {
            System.out.print(" 1.Nhập mã nhân viên:");
            nv.setID(nhap.nextLine());
            if (checkID(nv.getID())) {
                System.err.println(" Mã nhân viên trùng!");
            }
        } while (checkID(nv.getID()));
        do {

            System.out.print(" 2.Nhập họ tên nhân viên:");
            nv.setHoVaTen(nhap.nextLine());
            if (ch.kiemTraTen(nv.getHoVaTen())) {
                System.err.println(" Tên nhân viên không được chứa số va trống! ");
            }
        } while (ch.kiemTraTen(nv.getHoVaTen()));
        do {
            System.out.print(" 3.Nhập số điện thoại nhân viên:");
            nv.setSoDienThoai(nhap.nextLine());

        } while (ch.kiemTraSDT(nv.getSoDienThoai()));
        System.out.print(" 4.Nhập mật khẩu nhân viên:");
        nv.setMatKhau(md5(nhap.nextLine()));
        do {
            System.out.print(" 5.Nhập emial nhân viên:");
            nv.setEmail(nhap.nextLine());
        } while (ch.kiemTraEmail(nv.getEmail()));
        System.out.print(" 5.Nhập địa chỉ nhân viên:");
        nv.setDiaChi(nhap.nextLine());
        listnv.add(nv);
        save();

    }

    public void timKiemNhanVien() {
        System.out.println("");
        String timKiem;
        System.out.println("---- NHẬP THÔNG TIN NHÂN VIÊN CẦN TÌM KIẾM ----");
        System.out.println("");
        System.out.print(" Nhập ID/SĐT/Email: ");
        Scanner nhap = new Scanner(System.in);
        timKiem = nhap.nextLine();
        int d = 0;
        for (int i = 0; i < listnv.size(); i++) {
            if (timKiem.equals(listnv.get(i).getID()) || timKiem.equals(listnv.get(i).getEmail()) || timKiem.equals(listnv.get(i).getSoDienThoai())) {
                System.out.println("+----------------------------------------------------------------------------------------------+");
                System.out.println("|                                THÔNG TIN NHÂN VIÊN TÌM THẤY                                  |");
                System.out.println("+--------------+-------------------------+-----------------+---------------+-------------------+");
                System.out.println("| Mã nhân viên |      Tên nhân viên      |  Số điện thoại  |    Địa chỉ    |       Email       |");
                System.out.println("+--------------+-------------------------+-----------------+---------------+-------------------+");
                listnv.get(i).inDuLieu();
                System.out.println("+----------------------------------------------------------------------------------------------+");
                d++;
            }

        }
        if (d == 0) {
            System.out.println(" KHÔNG TÌM THẤY NHÂN VIÊN!");
        }
    }

    public void suaNhanVien() {
        System.out.println("");
         System.out.println("---- CẬP NHẬT THÔNG TIN NHÂN VIÊN ----");
         System.out.println("");
        if (timKiem() == true) {

            System.out.println(" 1.Tên nhân viên cũ:" + nv.getHoVaTen());
            do {
                System.out.print(" -> Nhập tên nhân viên mới:");
                nv.setHoVaTen(nhap.nextLine());
                if (ch.kiemTraTen(nv.getHoVaTen())) {
                    System.err.println(" Tên không được để trống và nhập số!");
                }
            } while (ch.kiemTraTen(nv.getHoVaTen()));

            System.out.println(" 2.Số điện thoại nhân viên cũ:" + nv.getSoDienThoai());
            do {

                System.out.print(" -> Nhập số điện thoại nhân viên mới:");
                nv.setSoDienThoai(nhap.nextLine());

            } while (ch.kiemTraSDT(nv.getSoDienThoai()));

            System.out.print(" -> Nhập mật khẩu nhân viên mới:");
            nv.setMatKhau(md5(nhap.nextLine()));

            System.out.println(" 4.Địa chỉ nhân viên cũ:" + nv.getDiaChi());
            System.out.print(" -> Nhập địa chỉ nhân viên mới:");
            nv.setDiaChi(nhap.nextLine());

            do {
                System.out.println(" 5.Email nhân viên cũ:" + nv.getEmail());
                System.out.print(" -> Nhập Email nhân viên mới:");
                nv.setEmail(nhap.nextLine());
            } while (ch.kiemTraEmail(nv.getEmail()));

            System.out.println(" ĐÃ SỬA THÔNG TIN NHÂN VIÊN! ");
            listnv.set(index, nv);
            save();
        } else {
            System.out.println(" KHÔNG TÌM THẤY NHÂN VIÊN! ");
        }
    }
    int indexNV;
    public void dangNhap() {
        int d = 0;

        do {
            main htbh = new main();
            Scanner nhap = new Scanner(System.in);
            loadFile();
            System.out.println("");
            System.out.println("==> ĐĂNG NHẬP <==");
            System.out.print(" Nhập tài khoản :");
            String TK = nhap.nextLine();
            System.out.print(" Nhập mật khẩu :");
            String MK = md5(nhap.nextLine());

            for (int i = 0; i < listnv.size(); i++) {
                
                if (TK.equalsIgnoreCase(listnv.get(i).getID()) && TK.contains("ad") && MK.equals(listnv.get(i).getMatKhau())) {
                    index = i;
                    System.out.println("");
                    System.out.println(" ĐĂNG NHẬP THÀNH CÔNG ");
                    System.out.println("");
                    System.out.println(" CHÀO MỪNG QUẢN TRỊ VIÊN :" + listnv.get(i).getHoVaTen());
                    htbh.heThongBanHangAD();
                    d++;
                }
                else if(TK.equalsIgnoreCase(listnv.get(i).getID()) && TK.contains("nv") && MK.equals(listnv.get(i).getMatKhau())){
                    indexNV = i;
                    System.out.println("");
                    System.out.println(" ĐĂNG NHẬP THÀNH CÔNG ");
                    System.out.println("");
                    System.out.println(" CHÀO MỪNG NHÂN VIÊN :" + listnv.get(i).getHoVaTen());
                    htbh.heThongBanHangNV();
                    d++;
            }
            }
            if (d == 0) {
                System.out.println("");
                System.out.println(" ĐĂNG NHẬP THẤT BẠI! ");
            }

        } while (d == 0);
    }

    public void menu() {
        int chon;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println(" ======>   QUẢN LÍ NHÂN VIÊN   <===== ");
            System.out.println("+------------------------------------+");
            System.out.println("|     1.Xem toàn bộ danh sách         ");
            System.out.println("+------------------------------------+");
            System.out.println("|     2.Thêm mới 1 nhân viên          ");
            System.out.println("+------------------------------------+");
            System.out.println("|     3.Sửa 1 nhân viên              |");
            System.out.println("+------------------------------------+");
            System.out.println("|     4.Xóa 1 nhân viên              |");
            System.out.println("+------------------------------------+");
            System.out.println("|     5.Tìm kiếm nhân viên           |");
            System.out.println("+------------------------------------+");
            System.out.println("|     6.Thoát                        |");
            System.out.println("+------------------------------------+");
            System.out.println("");
            System.out.print(" -> Mời chọn chức năng : ");
            chon = sc.nextInt();

            switch (chon) {
                case 1: {

                    this.hienThiDS();
                    break;
                }
                case 2: {
                    this.themNhanVien();
                    break;
                }
                case 3: {
                    this.suaNhanVien();
                    break;
                }
                case 4: {
                    this.xoaNhanVien();
                    break;
                }
                case 5: {
                    this.timKiemNhanVien();
                    break;
                }

                default: {
                    this.save();
                }
            }
        } while (chon != 6);
    }
}
}
