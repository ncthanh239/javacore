/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit7;

import java.util.ArrayList;

/**
 *
 * @author Hieu Trung
 */
public class NhanVienDemo {
    public static void main(String[] args) {
        ArrayList <NhanVien> listNhanVien = new ArrayList<>();
        
        
        NhanVien nv1 = new NhanVien("Nv01", "Thanh");
        NhanVien nv2 = new NhanVien("Nv02", "Thanh2");
        NhanVien nv3 = new NhanVien("Nv03", "Thanh3");
        
        listNhanVien.add(nv1);
        listNhanVien.add(nv2);
        listNhanVien.add(nv3);
        
        System.out.println(listNhanVien);
    
    }
}
