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
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Main;
import object.nhanVien;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Hieu Trung
 */
public class QuanLiNhanVien {

    ArrayList<nhanVien> listnv = new ArrayList<>();
    nhanVien nv = new nhanVien();
    Scanner nhap = new Scanner(System.in);
    int index = 0;
    CheckData ch = new CheckData();
    private String filename = "nhanvien.txt";
    int maxacnhan = 0;

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
            fw = new FileWriter(filename);
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadFile() {
        try {
            BufferedReader br = null;
            FileReader fr = null;
            listnv = new ArrayList<>();
            fr = new FileReader(filename);
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
                Logger.getLogger(QuanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hienThiDS() {
        loadFile();
        System.out.println("");
        if (listnv.isEmpty()) {
            System.out.println("");
            System.out.println(" Chưa có thông tin nhân viên! ");
        } else {

            System.out.println("+------------------------------------------------------------------------------------------------------------+");
            System.out.println("|                                  THÔNG TIN NHÂN VIÊN                                                       |");
            System.out.println("+--------------+-------------------------+-----------------+-----------------------------+-------------------+");
            System.out.println("| Mã nhân viên |      Tên nhân viên      |  Số điện thoại  |             Email           |     Địa chỉ       |");
            System.out.println("+--------------+-------------------------+-----------------+-----------------------------+-------------------+");
            for (int i = 0; i < listnv.size(); i++) {
                listnv.get(i).inDuLieu();
            }

            System.out.println("+------------------------------------------------------------------------------------------------------------+");

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
        nhanVien nv = new nhanVien();
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
            System.out.println(" Đã xóa thành công nhân viên! ");
            save();
        } else {
            System.out.println(" Không tìm thấy thông tin nhân viên! ");
        }
    }

    public void themNhanVien() {
        loadFile();
        System.out.println("");
        nhanVien nv = new nhanVien();
        System.out.println("Nhập thông tin nhân viên");
        System.out.println("");
        do {
            System.out.print("Nhập mã nhân viên:");
            nv.setID(nhap.nextLine());
            if (checkID(nv.getID())) {
                System.err.println(" Mã nhân viên trùng!");
            }
        } while (checkID(nv.getID()));
        do {

            System.out.print("Nhập họ tên nhân viên:");
            nv.setHoVaTen(nhap.nextLine());
            if (ch.kiemTraTen(nv.getHoVaTen())) {
                System.err.println(" Tên nhân viên không được chứa số và trống! ");
            }
        } while (ch.kiemTraTen(nv.getHoVaTen()));
        do {
            System.out.print("Nhập số điện thoại nhân viên:");
            nv.setSoDienThoai(nhap.nextLine());

        } while (ch.kiemTraSDT(nv.getSoDienThoai()));
        System.out.print("Nhập mật khẩu:");
        nv.setMatKhau(md5(nhap.nextLine()));
        do {
            System.out.print("Nhập email:");
            nv.setEmail(nhap.nextLine());
        } while (ch.kiemTraEmail(nv.getEmail()));
        System.out.print("Nhập địa chỉ:");
        nv.setDiaChi(nhap.nextLine());
        listnv.add(nv);
        save();
    }

    public void timKiemNhanVien() {
        loadFile();
        nhanVien nv = new nhanVien();
        System.out.println("Nhập thông tin nhân viên cần tìm kiếm");
        System.out.println("");
        System.out.print(" Nhập ID hoặc SĐT hoặc Email: ");
        Scanner nhap = new Scanner(System.in);
        String iD = nhap.nextLine();
        int d = 0;
        System.out.println("+------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                THÔNG TIN NHÂN VIÊN TÌM THẤY                                                |");
        System.out.println("+--------------+-------------------------+-----------------+-----------------------------+-------------------+");
        System.out.println("| Mã nhân viên |      Tên nhân viên      |  Số điện thoại  |           Email             |     Địa chỉ       |");
        System.out.println("+--------------+-------------------------+-----------------+-----------------------------+-------------------+");
        for (int i = 0; i < listnv.size(); i++) {
            nv = listnv.get(i);
            if (nv.getID().contains(iD) || nv.getSoDienThoai().contains(iD) || nv.getEmail().contains(iD)) {

                nv.inDuLieu();

                d++;
            }

        }
        System.out.println("+-------------------------------------------------------------------------------------------------------------+");
        if (d == 0) {
            System.out.println(" Không tìm thấy nhân viên!");
        }
    }

    public void suaNhanVien() {
        loadFile();
        String id;
        int index = 0;
        System.out.print("Nhập mã nhân viên cần sửa: ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        Scanner sc = new Scanner(System.in);
        nhanVien nv = new nhanVien();
        int dem = 0;
        for (int i = 0; i < listnv.size(); i++) {
            nv = listnv.get(i);
            if (id.equalsIgnoreCase(nv.getID()) == true) {
                index = i;
                dem++;
                String tenkhongsua = listnv.get(i).getHoVaTen();
                String phonekhongsua = listnv.get(i).getSoDienThoai();
                String emailkhongsua = listnv.get(i).getEmail();
                String mkkhongsua = listnv.get(i).getMatKhau();
                String addkhongsua = listnv.get(i).getDiaChi();
                dem++;
                System.err.println("Mời bạn cập nhật thông tin nhân viên!");
                System.out.println("");
                System.err.println("Lưu ý: Nhấn ENTER để bỏ qua nếu bạn không muốn cập nhật thông tin đó !");
                System.out.println("");
                System.out.println("Mã nhân viên:" + nv.getID());
                System.out.println("Tên nhân viên cũ: " + nv.getHoVaTen());
                do {
                    System.out.print("Nhập tên nhân viên mới: ");
                    nv.setHoVaTen(sc.nextLine());
                    if ("".equals(nv.getHoVaTen())) {
                        nv.setHoVaTen(tenkhongsua);
                    }
                } while (ch.kiemTraTen(nv.getHoVaTen()));
                System.out.println("Số điện thoại cũ: " + nv.getSoDienThoai());
                do {
                    System.out.print("Nhập số điện thoại mới: ");
                    nv.setSoDienThoai(sc.nextLine());
                    if ("".equals(nv.getSoDienThoai())) {
                        nv.setSoDienThoai(phonekhongsua);
                    }
                } while (ch.kiemTraSDT(nv.getSoDienThoai()));
                System.out.println("Email cũ: " + nv.getEmail());
                do {
                    System.out.print("Nhập email mới: ");
                    nv.setEmail(sc.nextLine());
                    if ("".equals(nv.getEmail())) {
                        nv.setEmail(emailkhongsua);
                    }
                } while (ch.kiemTraEmail(nv.getEmail()));

                do {
                    System.out.print("Nhập mật khẩu mới: ");
                    nv.setMatKhau(md5(sc.nextLine()));
                    if ("".equals(nv.getMatKhau())) {
                        nv.setMatKhau(mkkhongsua);
                    }
                } while ("".equals(nv.getMatKhau()));
                System.out.println("Địa chỉ cũ: " + nv.getDiaChi());
                do {
                    System.out.print("Nhập địa chỉ mới: ");
                    nv.setDiaChi(sc.nextLine());
                    if ("".equals(nv.getDiaChi())) {
                        nv.setDiaChi(addkhongsua);
                    }
                } while ("".equals(nv.getDiaChi()));

                listnv.set(index, nv); //Đẩy thông tin mới vào list
            }

            System.out.println("Sửa thông tin nhân viên thành công !");
            System.out.println("\t");
        }
        if (index == 0) {
            System.err.println("Không tìm thấy nhân viên có MSNV " + id + " để sửa !");
            System.out.println("");

        }
        save();
    }
    int indexNV;

    public void menu() {
        int chon;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println(" --------  QUẢN LÍ NHÂN VIÊN  ------- ");
            System.out.println("+------------------------------------+");
            System.out.println("|     1.Xem toàn bộ danh sách        |");
            System.out.println("+------------------------------------+");
            System.out.println("|     2.Thêm mới 1 nhân viên         |");
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
            System.out.print("  Mời chọn chức năng : ");
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

    public static String md5(String str) {
        String result = "";
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(str.getBytes());
            BigInteger bigInteger = new BigInteger(1, digest.digest());
            result = bigInteger.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void phanquyen1() {
        QuanLiNhanVien qlnv = new QuanLiNhanVien();

        int chon;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("----  HỆ THỐNG QUẢN LÍ BÁN HÀNG  -----");
            System.out.println("+------------------------------------+");
            System.out.println("|     1.QUẢN LÍ NHÂN VIÊN            |");
            System.out.println("+------------------------------------+");
            System.out.println("|     2.QUẢN LÍ KHÁCH HÀNG           |");
            System.out.println("+------------------------------------+");
            System.out.println("|     3.QUẢN LÍ SẢN PHẨM             |");
            System.out.println("+------------------------------------+");
            System.out.println("|     4.THOÁT                        |");
            System.out.println("+------------------------------------+");
            System.out.println("");
            System.out.print("  Mời chọn chức năng : ");
            chon = sc.nextInt();

            switch (chon) {
                case 1: {

                    qlnv.menu();
                    qlnv.save();

                }
                break;
                case 2: {
                    QuanLiKhachHang qlkh = new QuanLiKhachHang();
                    qlkh.menu();
                    qlkh.save();

                }
                break;
                case 3: {
                    QuanLiSanPham qlsp = new QuanLiSanPham();
                    qlsp.menu();
                    qlsp.save();

                }
                break;
                default:
                    break;

            }
        } while (chon != 4);
        System.out.println("Cảm ơn bạn đã sử dụng phần mềm! ");
    }

    public void phanquyen2() {
        QuanLiNhanVien qlnv2 = new QuanLiNhanVien();

        int chon;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("----  HỆ THỐNG QUẢN LÍ BÁN HÀNG  -----");
            System.out.println("+------------------------------------+");
            System.out.println("|     1.QUẢN LÍ KHÁCH HÀNG           |");
            System.out.println("+------------------------------------+");
            System.out.println("|     2.QUẢN LÍ SẢN PHẨM             |");
            System.out.println("+------------------------------------+");
            System.out.println("|     3.THOÁT                        |");
            System.out.println("+------------------------------------+");
            System.out.println("");
            System.out.print("  Mời chọn chức năng : ");
            chon = sc.nextInt();

            switch (chon) {

                case 1: {
                    QuanLiKhachHang qlkh = new QuanLiKhachHang();
                    qlkh.menu();
                    qlkh.save();

                }
                break;
                case 2: {
                    QuanLiSanPham qlsp = new QuanLiSanPham();
                    qlsp.menu();
                    qlsp.save();

                }
                break;
                default:
                    break;

            }
        } while (chon != 3);
        
    }

    public void sendmail() {
        maxacnhan = rand();
        try {
            Email email = new SimpleEmail();

            // Cấu hình thông tin Email Server
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("ncthanh239@gmail.com", "nguyenchithanh"));

            // Với gmail cái này là bắt buộc.
            email.setSSLOnConnect(true);

            // Người gửi
            email.setFrom("ncthanh239@gmail.com", "Nguyễn Chí Thành");

            // Tiêu đề
            email.setSubject("EMAIL RESET PASSWORD"); //Tiêu đề khi gửi email

            // Nội dung email
            email.setMsg("Mã xác nhận là: "
                    + "" + maxacnhan); //Nội dung email bạn muốn gửi.
            // Người nhận
            email.addTo("michellenguyen239@gmail.com"); //Đia chỉ email người nhận
            email.send(); //Thực hiện gửi.
            System.err.println("Sent Email Successfull ! Check youremail, please !");
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("Gửi không thành công !");
        }

    }

    public static int rand() {
        try {
            Random rn = new Random();
            int range = 9000 - 1000 + 1;
            int randomNum = 1000 + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void dangNhap() {
        int d = 0;

        Scanner sc = new Scanner(System.in);
        nhanVien nv = new nhanVien();

        loadFile();
        System.out.println("");
        System.out.println("-----ĐĂNG NHẬP-----");
        System.out.print(" Nhập tài khoản :");
        String id = sc.nextLine();
        System.out.print(" Nhập mật khẩu :");
        String pass = md5(sc.nextLine());
        for (int i = 0; i < listnv.size(); i++) {
            nv = listnv.get(i);
            if (id.equalsIgnoreCase(listnv.get(i).getID()) && id.contains("ad") && pass.equals(listnv.get(i).getMatKhau())) {
                index = i;
                System.out.println("");
                System.out.println(" ĐĂNG NHẬP THÀNH CÔNG ");
                System.out.println("");
                System.out.println(" CHÀO MỪNG QUẢN TRỊ VIÊN :" + listnv.get(i).getHoVaTen());
                phanquyen1();
                d++;
            } else if (id.equalsIgnoreCase(listnv.get(i).getID()) && id.contains("nv") && pass.equals(listnv.get(i).getMatKhau())) {
                indexNV = i;
                System.out.println("");
                System.out.println(" ĐĂNG NHẬP THÀNH CÔNG ");
                System.out.println("");
                System.out.println(" CHÀO MỪNG NHÂN VIÊN :" + listnv.get(i).getHoVaTen());
                phanquyen2();
                d++;
            }else if((pass.equals(listnv.get(i).getMatKhau()))==false){
                //capNhatMK();
                menu2();
            }
        }

    }
    public static void main(String[] args) {
        QuanLiNhanVien ql = new QuanLiNhanVien();
        ql.themNhanVien();
    }
    int vitripass;
    
    public void capNhatMK() {
        Scanner sc = new Scanner(System.in);
        loadFile();
        
        System.out.println("Mời bạn nhập mã nhân viên: ");
        String maNV = sc.nextLine();
        for (int i = 0; i < listnv.size(); i++) {
            if (maNV.equals(listnv.get(i).getID())) {
                sendmail();
                vitripass = i;
                System.out.println("Mời bạn nhập mã xác nhận:");
                int mxn = sc.nextInt();
                do {
                    if (mxn == maxacnhan) {
                        nhanVien nv = new nhanVien();
                        nv = listnv.get(vitripass);
                        sc = new Scanner(System.in);
                        System.out.println("Mời bạn nhập mật khẩu mới:");
                        nv.setMatKhau(md5(sc.nextLine()));
                        listnv.set(vitripass, nv);
                        save();
                        dangNhap();
                    } else {
                        System.out.println("Mời bạn nhập lại mã xác nhận:");
                    }
                } while (mxn != maxacnhan);
            }
        }

    }
     public void menu2() {
        
        int chon;
        QuanLiNhanVien qlnv = new QuanLiNhanVien();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("----    MỜI BẠN CHỌN CHỨC NĂNG   -----");
            System.out.println("+------------------------------------+");
            System.out.println("|     1.QUÊN MẬT KHẨU                |");
            System.out.println("+------------------------------------+");
            System.out.println("|     2.THOÁT                        |");
            System.out.println("+------------------------------------+");
            System.out.println("");
            System.out.print("  Mời chọn chức năng : ");
            chon = sc.nextInt();

            switch (chon) {

                case 1: {
                   
                    qlnv.capNhatMK();
                }
                break;

                default:
                    break;

            }
        } while (chon != 2);
    }


    public void dangNhap2() {
        int chon;
        QuanLiNhanVien qlnv = new QuanLiNhanVien();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("----    MỜI BẠN CHỌN CHỨC NĂNG   -----");
            System.out.println("+------------------------------------+");
            System.out.println("|     1.ĐĂNG NHẬP                    |");
            System.out.println("+------------------------------------+");
            System.out.println("|     2.THOÁT                        |");
            System.out.println("+------------------------------------+");
            System.out.println("");
            System.out.print("  Mời chọn chức năng : ");
            chon = sc.nextInt();

            switch (chon) {

                case 1: {

                    qlnv.dangNhap();
                }
                break;

                default:
                    break;

            }
        } while (chon != 2);
    }
}
