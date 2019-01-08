/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author Hieu Trung
 */
public class CheckData {

    public boolean kiemTraTen(String ten) {
        for (int i = 0; i < 10; i++) {
            if (ten.contains(i + "") == true || (ten.equals("")) == true) {
                System.out.println("Tên nhân viên không được chứa số");
                return true;

            }
        }

        return false;

    }

    public boolean kiemTraTen1(String ten) {
        for (int i = 0; i < 10; i++) {
            if ((ten.equals("")) == true) {
                System.out.println("Tên nhân viên không được rỗng");
                return true;

            }
        }

        return false;

    }

    public boolean kiemtraMa(String id) {
        for (int i = 0; i < 10; i++) {
            if (id.equals("") == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraEmail(String email) {
        String dinhDangEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        boolean ktEmail = email.matches(dinhDangEmail);
        if (ktEmail == false) {
            System.err.println(" Email sai, nhập lại theo dạng abc@domain.com!");
            return true;
        }
        return false;
    }

    public boolean kiemTraSDT(String soDienThoai) {
        boolean check = false;
        try {
            long SDT = Long.parseLong(soDienThoai);
            if (!soDienThoai.startsWith(0 + "")) {
                System.err.println(" Số điện thoại phải bắt đầu bằng số 0!");
                check = true;
            } else if (soDienThoai.length() < 10) {
                System.err.println(" Số điện thoại phải lớn hơn hoặc bằng 10 số!");
                check = true;
            } else if (soDienThoai.length() > 11) {
                System.err.println(" Số điện thoại phải bé hơn hoặc bằng 11 số!");
                check = true;
            }
        } catch (NumberFormatException ex) {
            System.err.println(" Số điện thoại không được nhập chữ!");
            check = true;
        } catch (Exception ex) {
            System.err.println("Fail" + ex.getMessage());
            check = true;
        }
        return check;
    }

    public boolean kiemTraGia(String giaSanPham) {
        boolean check = false;
        int gia = Integer.parseInt(giaSanPham);
        try {
            //int gia = Integer.parseInt(giaSanPham);
            if (gia <= 0) {
                System.err.println(" Giá sản phẩm phải lớn hơn 0!");
                check = true;
            }
        } catch (NumberFormatException ex) {
            System.err.println(" Giá sản phẩm không được chứa chữ!");
            check = true;
        } catch (Exception ex) {
            System.out.println("Fail" + ex.getMessage());
            check = true;
        }
        return check;
    }

    public boolean kiemSoluong(String soLuong) {
        boolean check = false;
        int sl = Integer.parseInt(soLuong);
        try {
            //int sl = Integer.parseInt(soLuong);
            if (sl <= 0) {
                System.err.println(" Số lượng phải lớn hơn 0!");
                check = true;
            }
        } catch (NumberFormatException ex) {
            System.err.println(" Số lượng không được chứa chữ!");
            check = true;
        } catch (Exception ex) {
            System.out.println("Fail" + ex.getMessage());
            check = true;
        }
        return check;
    }
}
