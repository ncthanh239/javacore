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

    static boolean flag = true;

    public boolean ktraTenNV(String tennv) {
        for (int i = 0; i < 10; i++) {
            if (tennv.contains(i + "") == true || tennv.equalsIgnoreCase("")) {
                return true;
            }
        }
        return false;
    }

    public boolean ktraSoDT(String sdt) {
        boolean check = false;
        try {
            int soDT = Integer.parseInt(sdt);
            if (sdt.startsWith(0 + "") == false) {
                System.err.println("Số điện thoại phải bắt đầu bằng số 0!");
                check = true;
            } else if (sdt.length() < 10) {
                System.err.print("Số điện thoại phải lớn hơn 10 số!");
                check = true;
            } else if (sdt.length() > 11) {
                System.err.println("Số điện thoại phải nhỏ hơn 11 số!");
                check = true;
            }
        }catch (NumberFormatException ex){
            System.err.println("Số điện thoại không được nhập chữ!");
            check = true;
        }catch (Exception ex){
            System.err.println("Fail"+ ex.getMessage());
            check = true;
        }
        return true;
    }
    public boolean ktraEmail(String email) {
        String dinhDangEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        boolean ktEmail = email.matches(dinhDangEmail);
        if (ktEmail == false) {
            System.err.println("Email sai, nhập lại theo dạng abc@domain.com");
            return true;
        }
        return false;

    }
   
}
