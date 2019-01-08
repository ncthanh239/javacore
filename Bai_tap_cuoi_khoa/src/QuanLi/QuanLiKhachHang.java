/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLi;

import Objects.KhachHang;
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
public class QuanLiKhachHang {

    ArrayList<KhachHang> listkh = new ArrayList<>();
    private String file = "khachhang.txt";
    KhachHang kh = new KhachHang();
    private String khachhang;

    public void save() {
        try {
            BufferedWriter bw = null;
            FileWriter fw = null;
            String data = "";
            for (int i = 0; i < listkh.size(); i++) {
                String row = "";
                row += listkh.get(i).getMakh() + "\t";
                row += listkh.get(i).getTenkh() + "\t";
                row += listkh.get(i).getSdt() + "\t";
                row += listkh.get(i).getEmail() + "\t";
                row += listkh.get(i).getDiachi() + "\n";

                data += row;
            }
            fw = new FileWriter("khachhang.txt");
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLiKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    int chiso = 0;

    public boolean checkID(String id) {
        boolean check = false;
        KhachHang kh = new KhachHang();
        for (int i = 0; i < listkh.size(); i++) {
            kh = (KhachHang) listkh.get(i);
            if (id.equalsIgnoreCase(kh.getMakh()) == true) {
                check = true;
                chiso = i;
            }
        }
        return check;
    }

    public void nhapTTKH() {
        KhachHang kh = new KhachHang();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin khách hàng:");
        do {
            System.out.print("Nhập mã số khách hàng: ");
            kh.setMakh(sc.nextLine());
            if ("".equals(kh.getMakh()) == true) {
                System.err.println("Mã KH không được bỏ trống ! ");
                System.out.println("\t");
            }
        } while ("".equals(kh.getMakh()));
        if (checkID(kh.getMakh()) == true) {
            System.err.println("Mã khách hàng đã tồn tại ! Thêm không thành công ");
            System.out.println("");
        } else {
            do {
                System.out.print("Nhập tên khách hàng: ");
                kh.setTenkh(sc.nextLine());
                if ("".equals(kh.getTenkh())) {
                    System.err.println("Tên không được rỗng");
                    System.out.println("");
                }
            } while ("".equals(kh.getTenkh()));
            kh.setTenkh(kh.chuanHoaVietHoa(kh.getTenkh()));
            do {
                System.out.print("Nhập số điện thoại: ");
                kh.setSdt(sc.nextLine());
                if ("".equals(kh.getSdt())) {
                    System.err.println("Số không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(kh.getSdt()));
            do {
                System.out.print("Nhập địa chỉ email: ");
                kh.setEmail(sc.nextLine());
                if ("".equals(kh.getEmail())) {
                    System.err.println("Email không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(kh.getEmail()));
            do {
                System.out.print("Nhập địa chỉ: ");
                kh.setDiachi(sc.nextLine());
                if ("".equals(kh.getDiachi())) {
                    System.err.println("Địa chỉ không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(kh.getDiachi()));

            listkh.add(kh);
            save();
            System.out.println("Thêm mới khách hàng thành công !");
        }

    }
    int index = 0;

    public void suaThongTinKH() {
        docfile();
        String id;
        System.out.print("Nhập mã khách hàng cần sửa: ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        Scanner sc = new Scanner(System.in);
        KhachHang kh = new KhachHang();
        int dem = 0;
        for (int i = 0; i < listkh.size(); i++) {
            kh = (KhachHang) listkh.get(i);
            if (id.equalsIgnoreCase(kh.getMakh()) == true) {
                index = i;
                String tenkhongsua = listkh.get(i).getTenkh();
                String sdtkhongsua = listkh.get(i).getSdt();
                String emailkhongsua = listkh.get(i).getEmail();
                String dckhongsua = listkh.get(i).getDiachi();
                dem++;
                System.err.println("Mời bạn cập nhật thông tin khách hàng");
                System.out.println("");
                System.err.println("Lưu ý: Nhấn ENTER để bỏ qua nếu bạn không muốn cập nhật thông tin đó !");
                System.out.println("");
                System.out.println("Mã khách hàng:" + kh.getMakh());
                System.out.println("Tên khách hàng cũ: " + kh.getTenkh());
                System.out.print("Nhập tên khách hàng mới: ");
                kh.setTenkh(sc.nextLine());
                if ("".equals(kh.getTenkh())) {
                    kh.setTenkh(tenkhongsua);

                }

                kh.setTenkh(kh.chuanHoaVietHoa(kh.getTenkh()));
                System.out.println("Số điện thoại cũ:" + kh.getSdt());
                System.out.print("Nhập số điện thoại mới: ");
                kh.setSdt(sc.nextLine());
                if ("".equals(kh.getSdt())) {
                    kh.setSdt(sdtkhongsua);

                }
                System.out.println("Email cũ: " + kh.getEmail());
                System.out.print("Nhập Email mới: ");
                kh.setEmail(sc.nextLine());
                if ("".equals(kh.getEmail())) {
                    kh.setEmail(emailkhongsua);
                }
                System.out.println("Địa chỉ cũ: " + kh.getDiachi());
                System.out.print("Địa chỉ mới: ");
                kh.setDiachi(sc.nextLine());
                if ("".equals(kh.getDiachi())) {
                    kh.setDiachi(dckhongsua);
                }
                listkh.set(index, kh); //Đẩy thông tin mới vào list
                save();
                System.err.println("Cập nhật thông tin của nhân viên có MSKH " + listkh.get(i).getMakh() + " thành công !");
                System.out.println("\t");
            }
        }
        if (dem == 0) {
            System.err.println("Không tìm thấy nhân viên có MSKH " + id + " để sửa !");
            System.out.println("");

        }
    }

    public void xoaThongTinKH() {
        String id;
        System.out.print("Nhập mã khách hàng cần xóa: ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        int dem = 0;
        for (int i = 0; i < listkh.size(); i++) {
            kh = (KhachHang) listkh.get(i);
            if (id.equalsIgnoreCase(kh.getMakh()) == true) {
                listkh.remove(kh);
                save();
                System.err.println("Xóa thành công khách hàng có MSKH " + kh.getMakh() + " !");
                System.out.println("");
                dem++;
            }
        }
        if (dem == 0) {
            System.err.println("Không tìm thấy khách hàng có MSKH " + id + " để xóa !");
            System.out.println("");
        }
    }

    public void docfile() {
        try {
            BufferedReader br = null;
            FileReader fr = null;
            listkh = new ArrayList<>();

            fr = new FileReader("khachhang.txt");
            br = new BufferedReader(fr);
            String s = null; //Tạo 1 biến s kiểu String
            try {
                while ((s = br.readLine()) != null) {
                    //Cắt chuỗi:
                    String arr[] = s.split("\t");
                    //Khởi tạo
                    KhachHang kh = new KhachHang();
                    kh.setMakh(arr[0]);
                    kh.setTenkh(arr[1]);
                    kh.setSdt(arr[2]);
                    kh.setEmail(arr[3]);
                    kh.setDiachi(arr[4]);
                    listkh.add(kh);
                }
            } catch (IOException ex) {
                Logger.getLogger(QuanLiKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLiKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void danhSachKhachHang() {

        System.out.println("+--------------------------------------------------------------------------------+");
        System.out.println("|                                      DANH SÁCH NHÂN VIÊN                       |");
        System.out.println("+----------+----------------+-------------+---------------------+----------------+");
        System.out.println("|  MÃ KH   |     HỌ TÊN     |     SĐT     |        EMAIL        |     ĐỊA CHỈ    |");
        System.out.println("+----------+----------------+-------------+---------------------+----------------+");
        for (int i = 0; i < listkh.size(); i++) {
            listkh.get(i).showThongTinKhachHang();
        }
        System.out.println("+--------------------------------------------------------------------------------+");
    }

    public void menu() {
        int chon;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("+--------------------------------------------------+");
            System.out.println("|            CHƯƠNG TRÌNH QUẢN LÝ KHÁCH HÀNG       |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [1] Xem danh sách toàn bộ khách hàng   |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [2] Thêm mới 1 khách hàng vào file     |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [3] Sửa thông tin khách hàng           |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [4] Xóa thông tin khách hàng           |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [5] Thoát                              |");
            System.out.println("+--------------------------------------------------+");
            System.out.print("Mời bạn chọn chức năng: ");
            chon = input.nextInt();
            switch (chon) {
                case 1: {
                    docfile();
                    danhSachKhachHang();
                    break;
                }
                case 2: {
                    nhapTTKH();
                    break;
                }
                case 3: {
                    suaThongTinKH();
                    break;
                }
                case 4: {
                    xoaThongTinKH();
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
        QuanLiKhachHang qlkh = new QuanLiKhachHang();
        qlkh.menu();

        qlkh.save();
    }
}
