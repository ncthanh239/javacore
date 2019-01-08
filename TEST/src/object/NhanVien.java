/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Hieu Trung
 */
public class NhanVien {
     private String TenNv;
    private String MaNv;
    private String Sdt;
    private String Email;
    private String Matkhau;
    private String DiaChi;

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public NhanVien() {
    }

    public NhanVien(String TenNv, String MaNv, String Sdt, String Email, String DiaChi, String MatKhau) {
        this.TenNv = TenNv;
        this.MaNv = MaNv;
        this.Sdt = Sdt;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.Matkhau = MatKhau;
    }

    public void SapxepThongTin() {
        System.out.printf("|%11s|%18s|%12s|%19s|%15s|%13s|\n", getMaNv(), getTenNv(), getSdt(), getEmail(), getMatkhau(), getDiaChi());
    }

    public String chuanHoaKhoangTrang(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
  public String chuanHoaVietHoa(String str) {
        str = chuanHoaKhoangTrang(str);
        String arr[] = str.split(" ");
        str = "";
        for (int i = 0; i < arr.length; i++) {
            str += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
            if (i < arr.length - 1) {
                str += " ";
            }
        }
        return str;
    }
@Override
    public String toString() {
        return this.MaNv +"\t"+this.TenNv+"\t"+this.Sdt+"\t"+this.Email+"\t"+this.Matkhau+"\t"+this.DiaChi;
    }
}
