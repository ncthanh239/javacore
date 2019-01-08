/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVienDemo;


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
public class QLSV {
    ArrayList<SinhVien> listsv = new ArrayList<>();
    SinhVien sv = new SinhVien();

    public void menu() {
        int chon;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("+--------------------------------------------------+");
            System.out.println("|            CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN        |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [1] Xem danh sách toàn bộ sinh viên    |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [2] Thêm mới 1 sinh viên vào file      |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [3] Sửa thông tin sinh viên            |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [4] Xóa thông tin sinh viên            |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|           [5] Thoát                              |");
            System.out.println("+--------------------------------------------------+");
            System.out.print("Mời bạn chọn chức năng: ");
            chon = input.nextInt();
            switch (chon) {
                case 1: {
                    loadfile();
                    xemDanhSachSV();
                    break;
                }
                case 2: {
                    nhapThongTinSV();
                    break;
                }
                case 3: {
                    suaThongTinSV();
                    break;
                }
                case 4: {
                    xoaThongTinSV();
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

    public void xemDanhSachSV() {
        loadfile();
        int dem = 0;
        if (listsv.isEmpty()) {
            System.err.println("Chưa có sinh viên nào trong danh sách !");
            System.out.println("");
            dem++;
        }
        if (dem == 0) {
            System.out.println("+-----------------------------------------------------------------------------------------------------+");
            System.out.println("|                                   DANH SÁCH SINH VIÊN                                               |");
            System.out.println("+---------+------------------+-----------+--------------------+---------+----------+------------------+");
            System.out.println("|  MÃ SV  |        HỌ TÊN    |    SĐT    |         EMAIL      |GIỚI TÍNH| NGÀY SINH|       QUÊ QUÁN   |");
            System.out.println("+---------+------------------+-----------+--------------------+---------+----------+------------------+");
            for (int i = 0; i < listsv.size(); i++) {
                listsv.get(i).inTT();
            }
            System.out.println("+-----------------------------------------------------------------------------------------------------+");
        }
    }
    public boolean checkID(String id) {
        boolean check = false;
        SinhVien sv = new SinhVien();
        for (int i = 0; i < listsv.size(); i++) {
            sv = (SinhVien) listsv.get(i);
            if (id.equalsIgnoreCase(sv.getID()) == true) {
                check = true;
                chiso = i;
            }
        }
        return check;
    }

    public void nhapThongTinSV() {
        SinhVien sv = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin sinh viên: ");
        do {
            System.out.print("Nhập Mã Số Sinh Viên: ");
            sv.setID(sc.nextLine());
            if ("".equals(sv.getID()) == true) {
                System.err.println("Mã SV không được bỏ trống ! ");
                System.out.println("\t");
            }
        } while ("".equals(sv.getID()));
        if (checkID(sv.getID()) == true) {
            System.err.println("Mã sinh viên đã tồn tại ! Thêm không thành công ");
            System.out.println("");
        } else {
            do {
                System.out.print("Nhập Tên Sinh Viên: ");
                sv.setName(sc.nextLine());
                if ("".equals(sv.getName())) {
                    System.err.println("Tên không được rỗng");
                    System.out.println("");
                }
            } while ("".equals(sv.getName()));
            sv.setName(sv.chuanHoaVietHoa(sv.getName()));
            do {
                System.out.print("Nhập số điện thoại: ");
                sv.setPhone(sc.nextLine());
                if ("".equals(sv.getPhone())) {
                    System.err.println("Số không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(sv.getPhone()));
            do {
                System.out.print("Nhập địa chỉ email: ");
                sv.setEmail(sc.nextLine());
                if ("".equals(sv.getEmail())) {
                    System.err.println("Email không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(sv.getEmail()));

            do {
                System.out.print("Nhập giới tính: ");
                sv.setGender(sc.nextLine());
                if ("".equals(sv.getGender())) {
                    System.err.println("Giới tính không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(sv.getGender()));

            do {
                System.out.print("Nhập ngày sinh: ");
                sv.setBirth(sc.nextLine());
                if ("".equals(sv.getBirth())) {
                    System.err.println("Ngày sinh không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(sv.getBirth()));

            do {
                System.out.print("Nhập quê quán: ");
                sv.setAdd(sc.nextLine());
                if ("".equals(sv.getAdd())) {
                    System.err.println("Quê quán không được để rỗng");
                    System.out.println("");
                }
            } while ("".equals(sv.getAdd()));

            listsv.add(sv);
            savefile();
            System.out.println("Thêm mới sinh viên thành công !");
        }

    }

    int index = 0;

    public void suaThongTinSV() {
        loadfile();
        String id;
        System.out.print("Nhập mã sinh viên cần sửa: ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        int dem = 0;
        for (int i = 0; i < listsv.size(); i++) {
            sv = (SinhVien) listsv.get(i);
            if (id.equalsIgnoreCase(sv.getID()) == true) {
                index = i;
                String tenkhongsua = listsv.get(i).getName();
                String phonekhongsua = listsv.get(i).getPhone();
                String emailkhongsua = listsv.get(i).getEmail();
                String genderkhongsua = listsv.get(i).getGender();
                String birthkhongsua = listsv.get(i).getBirth();
                String addkhongsua = listsv.get(i).getAdd();
                dem++;
                System.err.println("Mời bạn cập nhật thông tin sinh viên");
                System.out.println("");
                System.err.println("Lưu ý: Nhấn ENTER để bỏ qua nếu bạn không muốn cập nhật thông tin đó !");
                System.out.println("");
                System.out.println("Mã sinh viên:" + sv.getID());
                System.out.println("Tên sinh viên cũ: " + sv.getName());
                System.out.print("Nhập tên sinh viên mới: ");
                sv.setName(sc.nextLine());
                if ("".equals(sv.getName())) {
                    sv.setName(tenkhongsua);
                    
                }

                sv.setName(sv.chuanHoaVietHoa(sv.getName()));
                System.out.println("Số điện thoại cũ:" + sv.getPhone());
                System.out.print("Nhập số điện thoại mới: ");
                sv.setPhone(sc.nextLine());
                if ("".equals(sv.getPhone())) {
                    sv.setPhone(phonekhongsua);

                }
                System.out.println("Email cũ: " + sv.getEmail());

                System.out.print("Nhập Email mới: ");
                sv.setEmail(sc.nextLine());
                if ("".equals(sv.getEmail())) {
                    sv.setEmail(emailkhongsua);
                }
                System.out.println("Giới tính cũ: " + sv.getGender());
                System.out.print("Giới tính mới: ");
                sv.setGender(sc.nextLine());
                if ("".equals(sv.getGender())) {
                    sv.setGender(genderkhongsua);
                }
                System.out.println("Ngày sinh cũ: " + sv.getBirth());
                System.out.print("Ngày sinh mới: ");
                sv.setBirth(sc.nextLine());
                if ("".equals(sv.getGender())) {
                    sv.setBirth(birthkhongsua);
                }
                System.out.println("Địa chỉ cũ: " + sv.getAdd());
                System.out.print("Địa chỉ mới: ");
                sv.setAdd(sc.nextLine());
                if ("".equals(sv.getAdd())) {
                    sv.setAdd(addkhongsua);
                }
                listsv.set(index, sv); //Đẩy thông tin mới vào list
                savefile();
                System.err.println("Cập nhật thông tin của sinh viên có MSSV " + listsv.get(i).getID() + " thành công !");
                System.out.println("\t");
            }
        }
        if (dem == 0) {
            System.err.println("Không tìm thấy sinh viên có MSSV " + id + " để sửa !");
            System.out.println("");

        }
    }

    public void xoaThongTinSV() {
        String id;
        System.out.print("Nhập mã sinh viên cần xóa: ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        int dem = 0;
        for (int i = 0; i < listsv.size(); i++) {
            sv = (SinhVien) listsv.get(i);
            if (id.equalsIgnoreCase(sv.getID()) == true) {
                listsv.remove(sv);
                savefile();
                System.err.println("Xóa thành công sinh viên có MSSV " + sv.getID() + " !");
                System.out.println("");
                dem++;
            }
        }
        if (dem == 0) {
            System.err.println("Không tìm thấy sinh viên có MSSV " + id + " để xóa !");
            System.out.println("");
        }
    }
    int chiso = 0;
    public void loadfile() {
        try {
            BufferedReader br = null;
            FileReader fr = null;
            listsv = new ArrayList<>();

            fr = new FileReader("thongtinsv.txt");
            br = new BufferedReader(fr);
            String s = null; //Tạo 1 biến s kiểu String
            try {
                while ((s = br.readLine()) != null) {
                    //Cắt chuỗi:
                    String arr[] = s.split("\t");
                    //Khởi tạo
                    SinhVien sv = new SinhVien();
                    sv.setID(arr[0]);
                    sv.setName(arr[1]);
                    sv.setPhone(arr[2]);
                    sv.setEmail(arr[3]);
                    sv.setGender(arr[4]);
                    sv.setBirth(arr[5]);
                    sv.setAdd(arr[6]);
                    listsv.add(sv);
                }
            } catch (IOException ex) {
                Logger.getLogger(QLSV.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QLSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void savefile() {
        try {
            BufferedWriter bw = null;
            FileWriter fw = null;
            String data = "";
            for (int i = 0; i < listsv.size(); i++) {
                String row = "";
                row += listsv.get(i).getID() + "\t";
                row += listsv.get(i).getName() + "\t";
                row += listsv.get(i).getPhone() + "\t";
                row += listsv.get(i).getEmail() + "\t";
                row += listsv.get(i).getGender() + "\t";
                row += listsv.get(i).getBirth() + "\t";
                row += listsv.get(i).getAdd() + "\n";
                data += row;
            }
            fw = new FileWriter("thongtinsv.txt");
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(QLSV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
