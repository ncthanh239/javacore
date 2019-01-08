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
public class KhachHang {
    private String makh;
    private String tenkh;
    private String sdt;
    private String email;
    private String diachi;

    public KhachHang() {
    }

    public KhachHang(String makh, String tenkh, String sdt, String email, String diachi) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.email = email;
        this.diachi = diachi;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public void showThongTinKhachHang(){
    System.out.printf("|%10s|%16s|%13s|%21s|%16s|\n", getMakh(), getTenkh(), getSdt(), getEmail(), getDiachi());
}

    @Override
    public String toString() {
        return this.getMakh() + this.getTenkh();
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
