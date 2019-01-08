/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import object.NhanVien;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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

    ArrayList<NhanVien> ListNhanVien = new ArrayList<>();
    public String tenfile = "NhanVien.txt";
    
    NhanVien nv = new NhanVien();

    public void loadfile() {
        try {
            BufferedReader br = null;
            FileReader fr = null;
            ListNhanVien = new ArrayList<>();
            fr = new FileReader(tenfile);
            br = new BufferedReader(fr);
            String s = null;
            while ((s = br.readLine()) != null) {
                String arr[] = s.split("\t");
                NhanVien nv = new NhanVien();
                nv.setMaNv(arr[0]);
                nv.setTenNv(arr[1]);
                nv.setSdt(arr[2]);
                nv.setEmail(arr[3]);
                nv.setMatkhau(arr[4]);
                nv.setDiaChi(arr[5]);
                ListNhanVien.add(nv);

            }
            fr.close();
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public boolean checkMaNv(String MaNv) {
        boolean check = false;
        NhanVien nv = new NhanVien();
        for (int i = 0; i < ListNhanVien.size(); i++) {
            nv = ListNhanVien.get(i);
            if (MaNv.equalsIgnoreCase(nv.getMaNv()) == true) {
                check = true;
                int chiso = i;
            }
        }
        return check;

    }
/* public boolean search() {
        System.out.println("Mời bạn nhập mã nhân viên cần tìm");
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for (int i = 0; i < listNhanVien.size(); i++) {
            nv = listNhanVien.get(i);
            if (id.equalsIgnoreCase(nv.getMaNv())) {
                flag = true;
                index = i;
                break;
            }
        }
        return flag;
    } */
 public void menu() {
        int click;
        Scanner sd = new Scanner(System.in);
        do {
            System.out.println("+--------------------------------------------------+");
            System.out.println("|           CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN         |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [1] Xem danh sách nhân viên            |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [2] Tìm kiếm nhân viên                 |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [3] Thêm mới 1 nhân viên               |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [4] Sửa thông tin nhân viên            |");
            System.out.println("+--------------------------------------------------+");
            System.out.println("|           [5] Xóa thông tin nhân viên            |");
            System.out.println("+--------------------------------------------------+");
            System.out.println("|           [6] Thoát                              |");
            System.out.println("+--------------------------------------------------+");
            System.out.print("Mời bạn chọn chức năng: ");
            click = sd.nextInt();
            switch (click) {
                case 1: {
                    loadfile();
                    DanhSachNhanVien();
                    break;
                }
                case 2: {
                    timNhanVien();
                    break;
                }
                case 3: {
                    ThemMoiNhanVien();
                    break;
                }
                case 4: {
                    SuaThongTinNhanVien();
                    break;
                }
                case 5: {
                    XoaNhanVien();
                    break;
                }
                case 6: {
                    System.out.println("Cảm ơn bạn đã sử đụng chương trình ^-^ ");
                    System.exit(0);
                }

                default:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình ! ");
            }
        } while (click != 6);

    }
    

    public void DanhSachNhanVien() {
        int dem = 0;
        if (ListNhanVien.isEmpty()) {
            System.out.println("Chưa có nhân viên nào trong danh sách:");
            System.out.println("");
            dem++;
        }
        if (dem == 0) {
            System.out.println("+---------------------------------------------------------------------------------------------+");
            System.out.println("|                                    DANH SÁCH NHÂN VIÊN                                      |");
            System.out.println("+-----------+------------------+------------+-------------------+---------------+-------------+");
            System.out.println("|  MẪ       |     Họ TÊN       |     SĐT    |    EMAIL          |    MẬT KHẨU   |   ĐỊA CHỉ   |");
            System.out.println("+-----------+------------------+------------+-------------------+---------------+-------------+");
            for (int i = 0; i < ListNhanVien.size(); i++) {
                ListNhanVien.get(i).SapxepThongTin();
            }
            System.out.println("+---------------------------------------------------------------------------------------------+");
        }
    }
    public void timNhanVien(){
         int click;
        Scanner sd = new Scanner(System.in);
        do {
            System.out.println("+--------------------------------------------------+");
            System.out.println("|           CHƯƠNG TRÌNH TÌM KIẾM NHÂN VIÊN        |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [1] Tìm bằng mã nhân viên              |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [2] Tìm bằng số điện thoại             |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [3] Tìm bằng email nhân viên           |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [4] thoát                              |");
            System.out.println("+--------------------------------------------------+");
            System.out.print("Mời Bạn Chọn Chức Nằng Để Tìm Kiếm:");
            click = sd.nextInt();
            switch (click) {
                case 1: {
                    loadfile();
                    System.out.print("Mời bạn nhập mã nhân viên cần tìm kiếm:");
                    Scanner sc = new Scanner(System.in);
                    String MaKH = sc.nextLine();
                    if ((ListNhanVien.contains(MaKH)) == true) {
                        System.out.println("Tìm kiếm Thành Công ! ");
                        System.out.println("Đây là nhân viên bạn cần tìm kiếm:" + ListNhanVien);

                    } else {
                        System.err.println("Tìm kiếm thất bại !");
                    }

                    break;

                }
                case 2: {
                    System.out.print("Mời bạn nhập số điện thoại cần tìm kiếm:");
                    Scanner sc = new Scanner(System.in);
                    String Sdt = sc.nextLine();
                    if ((ListNhanVien.contains(Sdt)) == true) {
                        System.out.println("Tìm kiếm thành công! ");
                        System.out.println("Đây là nhân viên bạn cần tìm kiếm:" + ListNhanVien);
                    }else{
                        System.err.println("Tìm kiếm thất bại");
                    }
                    break;

                }
                case 3: {
                    System.out.println("Mời bạn nhập email nhân viên cần tìm kiếm:");
                    Scanner sc = new Scanner(System.in);
                    String Email = sc.nextLine();
                    if (ListNhanVien.contains(Email)) {
                        System.out.println("Tìm kiếm thành công ! ");
                        System.out.println("Đây là nhân viên bạn cần tìm kiếm:"+ListNhanVien);
                    }else{
                        System.err.println("tìm kiếm thất bại");
                    }

                    break;
                }
                case 4: {
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình");
                    System.out.println("");
                }

                break;
                default:
                    throw new AssertionError();
            }
        } while (click !=4);

    }
    

   public void ThemMoiNhanVien() {
        Scanner sd = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        System.out.println("Mời Bạn Nhập Thông Tin Nhân Viên:");
        do {
            System.out.print("Nhập Mã Số Nhân Viên:");
            nv.setMaNv(sd.nextLine());
            if ("".equals(nv.getMaNv()) == true) {
                System.out.println("Mã Nhân Viên Không Được Bỏ Trống");
            }
        } while ("".equals(nv.getMaNv()));
        if (checkMaNv(nv.getMaNv()) == true) {
            System.out.println("Mã Nhân Viên Đã Tồn Tại!");
            System.out.println("Thêm Không Thành Công!");
        } else {
            do {
                System.out.print("Nhập Tên Nhân Viên:");
                nv.setTenNv(sd.nextLine());
                if ("".equals(nv.getTenNv())) {
                    System.out.println("Tên Không Được Rỗng");

                }
            } while ("".equals(nv.getTenNv()));
            nv.setTenNv(nv.chuanHoaVietHoa(nv.getTenNv()));
            do {
                System.out.print("Nhập Số Điện Thoại Nhân Viên:");
                nv.setSdt(sd.nextLine());
                if ("".equals(nv.getSdt())) {
                    System.out.println("Số Điện Thoại Không Được Để Rỗng");
                }
            } while ("".equals(nv.getSdt()));
            do {
                System.out.print("Nhập Email Nhân Viên:");
                nv.setEmail(sd.nextLine());
                if ("".equals(nv.getEmail())) {
                    System.out.println("Email Không Được Để Rỗng");
                }
            } while ("".equals(nv.getEmail()));
            do {
                System.out.print("Nhập Mật Khẩu Nhân Viên:");
                nv.setMatkhau(sd.nextLine());
                if("".equals(nv.getMatkhau())){
                    System.out.println("Mật Khẩu Không Được Để Rỗng");
                }
            } while ("".equals(nv.getMatkhau()));
            
            do {
                System.out.print("Nhập Địa Chỉ Nhân Viên:");
                nv.setDiaChi(sd.nextLine());
                if ("".equals(nv.getDiaChi())) {
                    System.out.println("Địa Chỉ Không Được Để Rỗng");
                }
            } while ("".equals(nv.getDiaChi()));

        }

        ListNhanVien.add(nv);
        save();
        System.out.println("Thêm Mới Khách Hàng Thành Công!");

    }
int index = 0;

    public void SuaThongTinNhanVien() {
        loadfile();
        String MaNv;
        System.out.println("Nhập Mã Nhân Viên Cần Sửa");
        Scanner sd = new Scanner(System.in);
        MaNv = sd.nextLine();
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        int dem = 0;
        for (int i = 0; i < ListNhanVien.size(); i++) {
            nv = ListNhanVien.get(i);
            if (MaNv.equalsIgnoreCase(nv.getMaNv()) == true) {
                index = i;
                String MaMacDinh = ListNhanVien.get(i).getMaNv();
                String TenMacDinh = ListNhanVien.get(i).getTenNv();
                String SdtMacDinh = ListNhanVien.get(i).getSdt();
                String EmailMacDinh = ListNhanVien.get(i).getEmail();
                String MatKhauMacDinh = ListNhanVien.get(i).getMatkhau();
                String DiaChiMacDinh = ListNhanVien.get(i).getDiaChi();
                dem++;
                System.out.println("Mời Bạn Cập Nhật Thông Tin Nhân Viên ^-^ ");
                System.out.println("");
                System.out.println("Mã Nhân Viên Cũ Là:" + nv.getMaNv());
                System.out.println("Nhập Mã Nhân Viên Mới:");
                nv.setMaNv(sc.nextLine());
                if ("".equals(nv.getMaNv())) {
                    nv.setMaNv(MaMacDinh);
                }
                System.out.println("Tên Nhân Viên Cũ Là:" + nv.getTenNv());
                System.out.println("Nhập Tên Mới Của Nhân Viên:");
                nv.setTenNv(sc.nextLine());
                if ("".equals(nv.getTenNv())) {
                    nv.setTenNv(TenMacDinh);
                }
                nv.setTenNv(nv.chuanHoaVietHoa(nv.getTenNv()));
                System.out.println("Số Điện Thoại Cũ Của Nhân Viên Là:" + nv.getSdt());
                System.out.println("Nhập Số Điện Thoại Mới Cho Nhân Viên:");
                if ("".equals(nv.getSdt())) {
                    nv.setSdt(SdtMacDinh);
                }
                System.out.println("Email Cũ Của Nhân Viên là:" + nv.getEmail());
                System.out.println("Nhập Email Mới Cho Nhân Viên:");
                if ("".equals(nv.getEmail())) {
                    nv.setEmail(EmailMacDinh);
                }
                System.out.println("Mật Khẩu Cũ Của Nhân Viên là:"+nv.getMatkhau());
                System.out.println("Nhật Mật Khẩu Mới Cho Nhân Viên");
                if("".equals(nv.getMatkhau())){
                    nv.setMatkhau(MaMacDinh);
                }
                System.out.println("Địa Chỉ Cũ Của Nhân Viên Là:" + nv.getDiaChi());
                System.out.println("Nhập Địa Chỉ Mới Cho Nhân Viên:");
                if ("".equals(nv.getDiaChi())) {
                    nv.setDiaChi(DiaChiMacDinh);
                }
                ListNhanVien.set(index, nv);
                save();
                System.out.println("Cập Nhật Thành Công ^-^ ");

            }
        }
        if (dem == 0) {
            System.out.println("Không Tìm Thấy Khách Hàng ! ");
        }
    }

    public void XoaNhanVien() {
        loadfile();
        String MaNv;
        System.out.println("Nhập Mã Nhân Viên Cần Xóa: ");
        Scanner sd = new Scanner(System.in);
        MaNv = sd.nextLine();
        int dem = 0;
        for (int i = 0; i < ListNhanVien.size(); i++) {
            nv = ListNhanVien.get(i);
            if (MaNv.equalsIgnoreCase(nv.getMaNv()) == true) {
                ListNhanVien.remove(nv);
                save();
                System.out.println("Xóa Thành Công Nhân Viên! ");
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Không Tìm Thấy Nhân Viên ! ");
        }
    }
    public void save() {
        try {
            BufferedWriter bw = null;
            FileWriter fw = null;
            String data = "";
            for (int i = 0; i < ListNhanVien.size(); i++) {
                String hang = "";
                hang += ListNhanVien.get(i).getMaNv() + "\t";
                hang += ListNhanVien.get(i).getTenNv() + "\t";
                hang += ListNhanVien.get(i).getSdt() + "\t";
                hang += ListNhanVien.get(i).getEmail() + "\t";
                hang += ListNhanVien.get(i).getMatkhau() + "\t";
                hang += ListNhanVien.get(i).getDiaChi() + "\n";
                data += hang;
            }
            fw = new FileWriter(tenfile);
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.menu();
       
       

    }
}