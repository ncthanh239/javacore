/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVienDemo;

/**
 *
 * @author Hieu Trung
 */
public class SinhVien {
     private String ID;
    private String name;
    private String phone;
    private String email;
    private String gender;
    private String birth;
    private String add;

    public SinhVien() {
    }

    public SinhVien(String ID, String name, String phone, String email, String gender, String birth, String add) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
        this.add = add;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    
    public void inTT()
    {
        System.out.printf("|%9s|%18s|%11s|%20s|%9s|%10s|%18s|\n",this.getID(),this.getName(), this.getPhone(), this.getEmail(),this.getGender(),this.getBirth(),this.getAdd());
    }

    @Override
    public String toString() {
        return this.getID() + this.getName();
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
