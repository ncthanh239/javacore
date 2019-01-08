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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import object.khachHang;
import object.sanPham;

/**
 *
 * @author Hieu Trung
 */
public class QuanLiSanPham {

    ArrayList<sanPham> listsp = new ArrayList<>();
    sanPham sp = new sanPham();
    Scanner nhap = new Scanner(System.in);
    int index = 0;
    CheckData ch = new CheckData();
    private String filename = "sanpham.txt";

    public void save() {
        try {
            BufferedWriter bw = null;
            FileWriter fw = null;
            String data = "";
            for (int i = 0; i < listsp.size(); i++) {
                String row = "";
                row += listsp.get(i).getiDSp() + "\t";
                row += listsp.get(i).getTenSp() + "\t";
                row += listsp.get(i).getSoLuongSp() + "\t";
                row += listsp.get(i).getDonGiaSp() + "\n";
                data += row;
            }
            fw = new FileWriter(filename);
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLiSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadFile() {
   
        try {
            BufferedReader br = null;
            FileReader fr = null;
            listsp = new ArrayList<>();
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String s = null;
            try {
                while ((s = br.readLine()) != null) {
                    String arr[] = s.split("\t");
                    sanPham sp = new sanPham();
                    sp.setiDSp(arr[0]);
                    sp.setTenSp(arr[1]);
                    sp.setSoLuongSp(arr[2]);
                    sp.setDonGiaSp(arr[3]);
                    listsp.add(sp);
                }
            } catch (IOException ex) {
                Logger.getLogger(QuanLiSanPham.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLiSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hienThiDS() {
        loadFile();
        System.out.println("");
        if (listsp.isEmpty()) {
            System.out.println("");
            System.out.println(" Chưa có thông tin sản phẩm! ");
        } else {

            System.out.println("+---------------------------------------------------------------------------------+");
            System.out.println("|                                  THÔNG TIN SẢN PHẨM                             |");
            System.out.println("+--------------+-------------------------+--------------------+-------------------+");
            System.out.println("| Mã sản phẩm  |      Tên sản phẩm       |  Số lượng sản phẩm |     Đơn giá       |");
            System.out.println("+--------------+-------------------------+--------------------+-------------------+");
            for (int i = 0; i < listsp.size(); i++) {
                listsp.get(i).chuanHoaTien();
            }

            System.out.println("+---------------------------------------------------------------------------------+");

        }
    }

    public boolean timKiem() {
        System.out.println("");
        System.out.print(" Nhập mã sản phẩm cần tìm kiếm : ");
        String id = nhap.nextLine();
        boolean check = false;
        for (int i = 0; i < listsp.size(); i++) {
            sp = listsp.get(i);
            if (id.equalsIgnoreCase(sp.getiDSp())) {
                check = true;
                index = i;
                break;

            }
        }
        return check;

    }

    public boolean checkID(String id) {
        sanPham sp = new sanPham();
        boolean check = false;
        for (int i = 0; i < listsp.size(); i++) {
            sp = listsp.get(i);
            if (id.equalsIgnoreCase(sp.getiDSp())) {
                check = true;
                index = i;
                break;

            }
        }
        return check;
    }

    public void xoaSanPham() {
        System.out.println("");
        if (timKiem() == true) {
            listsp.remove(sp);
            System.out.println(" Đã xóa thành công sản phẩm! ");
            save();
        } else {
            System.out.println(" Không tìm thấy thông tin sản phẩm! ");
        }
    }

    public void themSanPham() {
        loadFile();
        System.out.println("");
        sanPham sp = new sanPham();
        System.out.println("Nhập thông tin sản phẩm");
        System.out.println("");
        do {
            System.out.print("Nhập mã sản phẩm:");
            sp.setiDSp(nhap.nextLine());
            if (checkID(sp.getiDSp())) {
                System.err.println(" Mã sản phẩm trùng!");
            }
        } while (checkID(sp.getiDSp()));
        do {

            System.out.print("Nhập tên sản phẩm:");
            sp.setTenSp(nhap.nextLine());
            if (ch.kiemTraTen1(sp.getTenSp())) {
                System.err.println(" Tên sản phẩm không được rỗng! ");
            }
        } while (ch.kiemTraTen1(sp.getTenSp()));
        do {
            System.out.print("Nhập số lượng sản phẩm:");
            sp.setSoLuongSp(nhap.nextLine());
            if(Long.parseLong(sp.getSoLuongSp())<0){
                System.err.println("Số lượng sản phẩm không được nhỏ hơn 0");
            }

        } while (ch.kiemSoluong(sp.getSoLuongSp()));
        do {
            System.out.print("Nhập đơn giá sản phẩm:");
            sp.setDonGiaSp(nhap.nextLine());
        } while (ch.kiemTraGia(sp.getDonGiaSp()));
        listsp.add(sp);
        save();
    }

    public void timKiemSanPham() {
        loadFile();
        sanPham sp = new sanPham();
        System.out.println("Nhập thông tin sản phẩm cần tìm kiếm");
        System.out.println("");
        System.out.print(" Nhập ID sản phẩm: ");
        Scanner nhap = new Scanner(System.in);
        String iD = nhap.nextLine();
        int d = 0;
        System.out.println("+---------------------------------------------------------------------------------+");
        System.out.println("|                          THÔNG TIN SẢN PHẨM TÌM THẤY                            |");
        System.out.println("+--------------+-------------------------+--------------------+-------------------+");
        System.out.println("| Mã sản phẩm  |      Tên sản phẩm       |  Số lượng sản phẩm |     Đơn giá       |");
        System.out.println("+--------------+-------------------------+--------------------+-------------------+");
        for (int i = 0; i < listsp.size(); i++) {
            sp = listsp.get(i);
            if (sp.getiDSp().contains(iD)) {

                sp.chuanHoaTien();

                d++;
            }

        }
        System.out.println("+---------------------------------------------------------------------------------+");
        if (d == 0) {
            System.out.println(" Không tìm thấy sản phẩm!");
        }
    }

    public void suaSanPham() {
        loadFile();
        String id;
        int index = 0;
        System.out.print("Nhập mã sản phẩm cần sửa: ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        Scanner sc = new Scanner(System.in);
        sanPham sp = new sanPham();
        int dem = 0;
        for (int i = 0; i < listsp.size(); i++) {
            sp = listsp.get(i);
            if (id.equalsIgnoreCase(sp.getiDSp()) == true) {
                index = i;
                dem++;
                String tenkhongsua = listsp.get(i).getTenSp();
                String soluongkhongsua = listsp.get(i).getSoLuongSp();
                String dongiakhongsua = listsp.get(i).getDonGiaSp();
                dem++;
                System.err.println("Mời bạn cập nhật thông tin sản phẩm!");
                System.out.println("");
                System.err.println("Lưu ý: Nhấn ENTER để bỏ qua nếu bạn không muốn cập nhật thông tin đó !");
                System.out.println("");
                System.out.println("Mã sản phẩm:" + sp.getiDSp());
                System.out.println("Tên sản phẩm cũ: " + sp.getTenSp());
                do {
                    System.out.print("Nhập tên sản phẩm mới: ");
                    sp.setTenSp(sc.nextLine());
                    if ("".equals(sp.getTenSp())) {
                        sp.setTenSp(tenkhongsua);
                    }
                } while ("".equals(sp.getTenSp()));
                System.out.println("Số lượng sản phẩm cũ: " + sp.getSoLuongSp());
                do {
                    System.out.print("Nhập số lượng sản phẩm mới: ");
                    sp.setSoLuongSp(sc.nextLine());
                    if ("".equals(sp.getSoLuongSp())) {
                        sp.setSoLuongSp(soluongkhongsua);
                    }
                } while (ch.kiemSoluong(sp.getSoLuongSp()));
                System.out.println("Đơn giá cũ: " + sp.getDonGiaSp());
                do {
                    System.out.print("Nhập đơn giá mới: ");
                    sp.setDonGiaSp(sc.nextLine());
                    if ("".equals(sp.getDonGiaSp())) {
                        sp.setDonGiaSp(dongiakhongsua);
                    }
                } while (ch.kiemTraGia(sp.getDonGiaSp()));

                listsp.set(index, sp); //Đẩy thông tin mới vào list
            }

            System.out.println("Sửa thông tin sản phẩm thành công !");
            System.out.println("\t");
        }
        if (index == 0) {
            System.err.println("Không tìm thấy sản phẩm có MSSP " + id + " để sửa !");
            System.out.println("");

        }
        save();
    }
    int indexSP;

    public void menu() {
        int chon;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("---------   QUẢN LÍ SẢN PHẨM   -------");
            System.out.println("+------------------------------------+");
            System.out.println("|     1.Xem toàn bộ danh sách        |");
            System.out.println("+------------------------------------+");
            System.out.println("|     2.Thêm mới 1 sản phẩm          |");
            System.out.println("+------------------------------------+");
            System.out.println("|     3.Sửa 1 sản phẩm               |");
            System.out.println("+------------------------------------+");
            System.out.println("|     4.Xóa 1 sản phẩm               |");
            System.out.println("+------------------------------------+");
            System.out.println("|     5.Tìm kiếm sản phẩm            |");
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
                    this.themSanPham();
                    break;
                }
                case 3: {
                    this.suaSanPham();
                    break;
                }
                case 4: {
                    this.xoaSanPham();
                    break;
                }
                case 5: {
                    this.timKiemSanPham();
                    break;
                }

                default: {
                    this.save();
                }
            }
        } while (chon != 6);
    }

    public static void main(String[] args) {
        QuanLiSanPham qlsp = new QuanLiSanPham();
        qlsp.menu();
        qlsp.save();
    }
}
