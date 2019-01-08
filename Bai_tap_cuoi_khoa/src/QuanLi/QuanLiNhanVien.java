/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLi;

import Objects.NhanVien;
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
public class QuanLiNhanVien {

    ArrayList<NhanVien> listnv = new ArrayList<>();
    private String file = "nhanvien.txt";
    NhanVien nv = new NhanVien();
    CheckData check = new CheckData();
    
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
            Logger.getLogger(QuanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    int chiso = 0;

    public boolean checkID(String id) {
        boolean check = false;
        NhanVien nv = new NhanVien();
        for (int i = 0; i < listnv.size(); i++) {
            nv = (NhanVien) listnv.get(i);
            if (id.equalsIgnoreCase(nv.getManv()) == true) {
                check = true;
                chiso = i;
            }
        }
        return check;
    }

    public void nhapTTNV() {
        NhanVien nv = new NhanVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin nhân viên:");
        do {
            System.out.print("Nhập mã số nhân viên: ");
            nv.setManv(sc.nextLine());
            if ("".equals(nv.getManv()) == true) {
                System.err.println("Mã NV không được bỏ trống ! ");
                System.out.println("\t");
            }
        } while ("".equals(nv.getManv()));
        if (checkID(nv.getManv()) == true) {
            System.err.println("Mã nhân viên đã tồn tại ! Thêm không thành công ");
            System.out.println("");
        } else {
            do {
                System.out.print("Nhập tên nhân viên: ");
                nv.setTennv(sc.nextLine());
                
                if ((!check.ktraTenNV(nv.getTennv()))) {
                    System.err.println("Tên không được rỗng và tên không được chứa số");
                    System.out.println("");
                }
            } while ((!check.ktraTenNV(nv.getTennv())));
            nv.setTennv(nv.chuanHoaVietHoa(nv.getTennv()));
            do {
                System.out.print("Nhập số điện thoại: ");
                nv.setSdt(sc.nextLine());
                if ("".equals(nv.getSdt())) {
                    System.err.println("Số không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(nv.getSdt()));
            do {
                System.out.print("Nhập địa chỉ email: ");
                nv.setEmail(sc.nextLine());
                if ("".equals(nv.getEmail())) {
                    System.err.println("Email không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(nv.getEmail()));

            do {
                System.out.print("Nhập mật khẩu: ");
                nv.setMatkau(sc.nextLine());
                if ("".equals(nv.getMatkau())) {
                    System.err.println("Mật khẩu không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(nv.getMatkau()));

            do {
                System.out.print("Nhập địa chỉ: ");
                nv.setDiachi(sc.nextLine());
                if ("".equals(nv.getDiachi())) {
                    System.err.println("Địa chỉ không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(nv.getDiachi()));

            listnv.add(nv);
            save();
            System.out.println("Thêm mới nhân viên thành công !");
        }

    }
    int index = 0;
    public void suaThongTinNV() {
        docfile();
        String id;
        System.out.print("Nhập mã nhân viên cần sửa: ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        int dem = 0;
        for (int i = 0; i < listnv.size(); i++) {
            nv = (NhanVien) listnv.get(i);
            if (id.equalsIgnoreCase(nv.getManv()) == true) {
                index = i;
                String tenkhongsua = listnv.get(i).getTennv();
                String sdtkhongsua = listnv.get(i).getSdt();
                String emailkhongsua = listnv.get(i).getEmail();
                String mkkhongsua = listnv.get(i).getMatkau();
                String dckhongsua = listnv.get(i).getDiachi();
                dem++;
                System.err.println("Mời bạn cập nhật thông tin nhân viên");
                System.out.println("");
                System.err.println("Lưu ý: Nhấn ENTER để bỏ qua nếu bạn không muốn cập nhật thông tin đó !");
                System.out.println("");
                System.out.println("Mã nhân viên:" + nv.getManv());
                System.out.println("Tên nhân viên cũ: " + nv.getTennv());
                System.out.print("Nhập tên nhân viên mới: ");
                nv.setTennv(sc.nextLine());
                if ("".equals(nv.getTennv())) {
                    nv.setTennv(tenkhongsua);

                }

                nv.setTennv(nv.chuanHoaVietHoa(nv.getTennv()));
                System.out.println("Số điện thoại cũ:" + nv.getSdt());
                System.out.print("Nhập số điện thoại mới: ");
                nv.setSdt(sc.nextLine());
                if ("".equals(nv.getSdt())) {
                    nv.setSdt(sdtkhongsua);

                }
                System.out.println("Email cũ: " + nv.getEmail());

                System.out.print("Nhập Email mới: ");
                nv.setEmail(sc.nextLine());
                if ("".equals(nv.getEmail())) {
                    nv.setEmail(emailkhongsua);
                }
                System.out.println("Mật khẩu cũ: " + nv.getMatkau());
                System.out.print("Nhập mật khẩu mới: ");
                nv.setMatkau(sc.nextLine());
                if ("".equals(nv.getMatkau())) {
                    nv.setMatkau(mkkhongsua);
                }
                System.out.println("Địa chỉ cũ: " + nv.getDiachi());
                System.out.print("Địa chỉ mới: ");
                nv.setDiachi(sc.nextLine());
                if ("".equals(nv.getDiachi())) {
                    nv.setDiachi(dckhongsua);
                }
                listnv.set(index, nv); //Đẩy thông tin mới vào list
                save();
                System.err.println("Cập nhật thông tin của nhân viên có MSNV " + listnv.get(i).getManv() + " thành công !");
                System.out.println("\t");
            }
        }
        if (dem == 0) {
            System.err.println("Không tìm thấy nhân viên có MSNV " + id + " để sửa !");
            System.out.println("");

        }
    }
    /*public boolean search() {
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
    }*/
    public void xoaThongTinNV() {
        String id;
        System.out.print("Nhập mã nhân viên cần xóa: ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        int dem = 0;
        for (int i = 0; i < listnv.size(); i++) {
            nv = (NhanVien) listnv.get(i);
            if (id.equalsIgnoreCase(nv.getManv()) == true) {
                listnv.remove(nv);
                save();
                System.err.println("Xóa thành công nhân viên có MSNV " + nv.getManv() + " !");
                System.out.println("");
                dem++;
            }
        }
        if (dem == 0) {
            System.err.println("Không tìm thấy nhân viên có MSNV " + id + " để xóa !");
            System.out.println("");
        }
    }

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
                Logger.getLogger(QuanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void danhSachNhanVien() {

        System.out.println("+-----------------------------------------------------------------------------------------------------+");
        System.out.println("|                                      DANH SÁCH NHÂN VIÊN                                            |");
        System.out.println("+----------+----------------+-------------+---------------------+----------------+--------------------+");
        System.out.println("|  MÃ NV   |     HỌ TÊN     |     SĐT     |       EMAIL         |    MẬT KHẨU    |       ĐỊA CHỈ      |");
        System.out.println("+----------+----------------+-------------+---------------------+----------------+--------------------+");
        for (int i = 0; i < listnv.size(); i++) {
            listnv.get(i).showThongTinNhanVien();
        }
        System.out.println("+-----------------------------------------------------------------------------------------------------+");
    }

    public void menu() {
        int chon;
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
            chon = input.nextInt();
            switch (chon) {
                case 1: {
                    docfile();
                    danhSachNhanVien();
                    break;
                }
                case 2: {
                    nhapTTNV();
                    break;
                }
                case 3: {
                    suaThongTinNV();
                    break;
                }
                case 4: {
                    xoaThongTinNV();
                    break;
                }
                case 5: {
                    System.out.println("Cảm ơn đã sử dụng chương trình !");
                    System.exit(0);
                }
                default: {
                    System.out.println("Bạn chọn sai chức năng ! ss");
                }
            }
        } while (chon != 5);
    }

    public static void main(String[] args) {
        QuanLiNhanVien qlnv = new QuanLiNhanVien();
        qlnv.menu();

        qlnv.save();
    }
}
