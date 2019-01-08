/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Hieu Trung
 */
public class NhanVien {
    private String manv;
    private String tennv;
    private String sdt;
    private String email;
    private String matkau;
    private String diachi;

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatkau() {
        return matkau;
    }

    public void setMatkau(String matkau) {
        this.matkau = matkau;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
public void showThongTinNhanVien(){
    System.out.printf("|%10s|%16s|%13s|%21s|%16s|%20s|\n", getManv(), getTennv(), getSdt(), getEmail(), getMatkau(), getDiachi());
}
    public NhanVien() {
    }

    public NhanVien(String manv, String tennv, String sdt, String email, String matkau, String diachi) {
        this.manv = manv;
        this.tennv = tennv;
        this.sdt = sdt;
        this.email = email;
        this.matkau = matkau;
        this.diachi = diachi;
    }
    
     @Override
    public String toString() {
        return this.getManv() + this.getTennv();
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
}
