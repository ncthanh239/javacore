/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import common.CheckData;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import object.khachHang;
import object.nhanVien;

/**
 *
 * @author Hieu Trung
 */
public class QuanLiKhachHang {
    ArrayList<khachHang> listkh = new ArrayList<>();
    khachHang kh = new khachHang();
    Scanner nhap = new Scanner(System.in);
    int index = 0;
    CheckData ch = new CheckData();
    private String filename = "khachhang.txt";

    public void save() {
        try {
            BufferedWriter bw = null;
            FileWriter fw = null;
            String data = "";
            for (int i = 0; i < listkh.size(); i++) {
                String row = "";
                row += listkh.get(i).getiDKh()+ "\t";
                row += listkh.get(i).getHoTenKh()+ "\t";
                row += listkh.get(i).getSoDienThoaiKh()+ "\t";
                row += listkh.get(i).getDiaChiKh()+ "\t";
                row += listkh.get(i).getEmailKh()+ "\n";
                data += row;
            }
            fw = new FileWriter(filename);
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLiKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadFile() {
       
        try {
            BufferedReader br = null;
            FileReader fr = null;
            listkh = new ArrayList<>();
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String s = null;
            try {
                while ((s = br.readLine()) != null) {
                    String arr[] = s.split("\t");
                    khachHang kh = new khachHang();
                    kh.setiDKh(arr[0]);
                    kh.setHoTenKh(arr[1]);               
                    kh.setSoDienThoaiKh(arr[2]);
                    kh.setDiaChiKh(arr[3]);
                    kh.setEmailKh(arr[4]);
                    listkh.add(kh);
                }
            } catch (IOException ex) {
                Logger.getLogger(QuanLiKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLiKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hienThiDS() {
        loadFile();
        System.out.println("");
        if (listkh.isEmpty()) {
            System.out.println("");
            System.out.println(" Chưa có thông tin khách hàng! ");
        } else {

            System.out.println("+----------------------------------------------------------------------------------------------+");
            System.out.println("|                                  THÔNG TIN KHÁCH HÀNG                                         |");
            System.out.println("+--------------+-------------------------+-----------------+---------------+-------------------+");
            System.out.println("| Mã nhân viên |      Tên nhân viên      |  Số điện thoại  |    Email      |     Địa chỉ       |");
            System.out.println("+--------------+-------------------------+-----------------+---------------+-------------------+");
            for (int i = 0; i < listkh.size(); i++) {
                listkh.get(i).inDuLieu();
            }

            System.out.println("+----------------------------------------------------------------------------------------------+");

        }
    }

    public boolean timKiem() {
        System.out.println("");
        System.out.print(" Nhập mã khách hàng cần tìm kiếm : ");
        String id = nhap.nextLine();
        boolean check = false;
        for (int i = 0; i < listkh.size(); i++) {
            kh = listkh.get(i);
            if (id.equalsIgnoreCase(kh.getiDKh())) {
                check = true;
                index = i;
                break;

            }
        }
        return check;

    }

    public boolean checkID(String id) {
        khachHang kh = new khachHang();
        boolean check = false;
        for (int i = 0; i < listkh.size(); i++) {
            kh = listkh.get(i);
            if (id.equalsIgnoreCase(kh.getiDKh())) {
                check = true;
                index = i;
                break;

            }
        }
        return check;
    }

    public void xoaKhachHang() {
        System.out.println("");
        if (timKiem() == true) {
            listkh.remove(kh);
            System.out.println(" Đã xóa thành công khách hàng! ");
            save();
        } else {
            System.out.println(" Không tìm thấy thông tin khách hàng! ");
        }
    }

    public void themKhachHang() {
        loadFile();
        System.out.println("");
        khachHang kh = new khachHang();
        System.out.println("Nhập thông tin khách hàng");
        System.out.println("");
        do {
            System.out.print("Nhập mã khách hàng:");
            kh.setiDKh(nhap.nextLine());
            if (checkID(kh.getiDKh())) {
                System.err.println(" Mã khách hàng trùng!");
            }
        } while (checkID(kh.getiDKh()));
        do {

            System.out.print("Nhập họ tên khách hàng:");
            kh.setHoTenKh(nhap.nextLine());
            if (ch.kiemTraTen(kh.getHoTenKh())) {
                System.err.println(" Tên khách hàng không được chứa số và trống! ");
            }
        } while (ch.kiemTraTen(kh.getHoTenKh()));
        do {
            System.out.print("Nhập số điện thoại khách hàng:");
            kh.setSoDienThoaiKh(nhap.nextLine());

        } while (ch.kiemTraSDT(kh.getSoDienThoaiKh()));
        do {
            System.out.print("Nhập email khách hàng:");
            kh.setEmailKh(nhap.nextLine());
        } while (ch.kiemTraEmail(kh.getEmailKh()));
        System.out.print("Nhập địa chỉ khách hàng:");
        kh.setDiaChiKh(nhap.nextLine());
        listkh.add(kh);
        save();
    }

    public void timKiemKhachHang() {
        loadFile();
        khachHang kh = new khachHang();
        System.out.println("Nhập thông tin khách hàng cần tìm kiếm");
        System.out.println("");
        System.out.print(" Nhập ID hoặc SĐT hoặc Email: ");
        Scanner nhap = new Scanner(System.in);
        String iD = nhap.nextLine();
        int d = 0;
        System.out.println("+----------------------------------------------------------------------------------------------+");
        System.out.println("|                                THÔNG TIN KHÁCH HÀNG TÌM THẤY                                 |");
        System.out.println("+--------------+-------------------------+-----------------+---------------+-------------------+");
        System.out.println("| Mã nhân viên |      Tên nhân viên      |  Số điện thoại  |    Email      |     Địa chỉ       |");
        System.out.println("+--------------+-------------------------+-----------------+---------------+-------------------+");
        for (int i = 0; i < listkh.size(); i++) {
            kh = listkh.get(i);
            if (kh.getiDKh().contains(iD) || kh.getSoDienThoaiKh().contains(iD) || kh.getEmailKh().contains(iD)) {

                kh.inDuLieu();

                d++;
            }

        }
        System.out.println("+----------------------------------------------------------------------------------------------+");
        if (d == 0) {
            System.out.println(" Không tìm thấy khách hàng!");
        }
    }

    public void suaKhachHang() {
        loadFile();
        String id;
        int index = 0;
        System.out.print("Nhập mã khách hàng cần sửa: ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        Scanner sc = new Scanner(System.in);
        khachHang kh = new khachHang();
        int dem = 0;
        for (int i = 0; i < listkh.size(); i++) {
            kh = listkh.get(i);
            if (id.equalsIgnoreCase(kh.getiDKh()) == true) {
                index = i;
                dem++;
                String tenkhongsua = listkh.get(i).getHoTenKh();
                String phonekhongsua = listkh.get(i).getSoDienThoaiKh();
                String emailkhongsua = listkh.get(i).getEmailKh();
                String addkhongsua = listkh.get(i).getDiaChiKh();
                dem++;
                System.err.println("Mời bạn cập nhật thông tin khách hàng!");
                System.out.println("");
                System.err.println("Lưu ý: Nhấn ENTER để bỏ qua nếu bạn không muốn cập nhật thông tin đó !");
                System.out.println("");
                System.out.println("Mã khách hàng:" + kh.getiDKh());
                System.out.println("Tên khách hàng cũ: " + kh.getHoTenKh());
                do {
                    System.out.print("Nhập tên khách hàng mới: ");
                    kh.setHoTenKh(sc.nextLine());
                    if ("".equals(kh.getHoTenKh())) {
                        kh.setHoTenKh(tenkhongsua);
                    }
                } while (ch.kiemTraTen(kh.getHoTenKh()));
                System.out.println("Số điện thoại cũ: " + kh.getSoDienThoaiKh());
                do {
                    System.out.print("Nhập số điện thoại mới: ");
                    kh.setSoDienThoaiKh(sc.nextLine());
                    if ("".equals(kh.getSoDienThoaiKh())) {
                        kh.setSoDienThoaiKh(phonekhongsua);
                    }
                } while (ch.kiemTraSDT(kh.getSoDienThoaiKh()));
                System.out.println("Email cũ: " + kh.getEmailKh());
                do {
                    System.out.print("Nhập email mới: ");
                    kh.setEmailKh(sc.nextLine());
                    if ("".equals(kh.getEmailKh())) {
                        kh.setEmailKh(emailkhongsua);
                    }
                } while (ch.kiemTraEmail(kh.getEmailKh()));
                System.out.println("Địa chỉ cũ: " + kh.getDiaChiKh());
                do {
                    System.out.print("Nhập địa chỉ mới: ");
                    kh.setDiaChiKh(sc.nextLine());
                    if ("".equals(kh.getDiaChiKh())) {
                        kh.setDiaChiKh(addkhongsua);
                    }
                } while ("".equals(kh.getDiaChiKh()));

                listkh.set(index, kh); //Đẩy thông tin mới vào list
            }

            System.out.println("Sửa thông tin khách hàng thành công !");
            System.out.println("\t");
        }
        if (index == 0) {
            System.err.println("Không tìm thấy khách hàng có MSKH " + id + " để sửa !");
            System.out.println("");

        }
        save();
    }
    int indexKH;

    public void menu() {
        int chon;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("---------  QUẢN LÍ KHÁCH HÀNG  -------");
            System.out.println("+------------------------------------+");
            System.out.println("|     1.Xem toàn bộ danh sách        |");
            System.out.println("+------------------------------------+");
            System.out.println("|     2.Thêm mới 1 khách hàng        |");
            System.out.println("+------------------------------------+");
            System.out.println("|     3.Sửa 1 khách hàng             |");
            System.out.println("+------------------------------------+");
            System.out.println("|     4.Xóa 1 khách hàng             |");
            System.out.println("+------------------------------------+");
            System.out.println("|     5.Tìm kiếm khách hàng          |");
            System.out.println("+------------------------------------+");
            System.out.println("|     6.Thoát                        |");
            System.out.println("+------------------------------------+");
            System.out.println("");
            System.out.print("  Mời chọn chức năng : ");
            chon = sc.nextInt();

            switch (chon) {
                case 1: {

                    this.hienThiDS();
                    break;
                }
                case 2: {
                    this.themKhachHang();
                    break;
                }
                case 3: {
                    this.suaKhachHang();
                    break;
                }
                case 4: {
                    this.xoaKhachHang();
                    break;
                }
                case 5: {
                    this.timKiemKhachHang();
                    break;
                }

                default: {
                    this.save();
                }
            }
        } while (chon != 6);
    }

    public static void main(String[] args) {
        QuanLiKhachHang qlkh = new QuanLiKhachHang();
        qlkh.menu();
        qlkh.save();
    }
}
