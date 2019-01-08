/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import app.QuanLyNhanVien;
import java.io.IOException;

/**
 *
 * @author Hieu Trung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        qlnv.menu();
        qlnv.save();
    }
}
