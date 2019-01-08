/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.internal.util.xml.impl.Input;

/**
 *
 * @author Hieu Trung
 */
public class TextFile {

    public static void main(String[] args) {
        Writer wr = null;
        try {//Nhập dữ liệu
            wr = new FileWriter("NhanVien.txt");
            BufferedWriter bw = new BufferedWriter(wr);
            bw.write("001\tNguyễn Chí Thành");
            bw.newLine();
            bw.write("002\tPhạm Văn Tài");
            bw.newLine();
            bw.write("003\tNguyễn Huy Hiếu");
            bw.newLine();
            bw.close();

            //Đọc dữ liệu
            InputStream in = null;
            in = new FileInputStream("nhanvien.txt");
            Reader read = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(read);
            String s = br.readLine();
            int i = 0;
            while (s != null) {
                i++;
                System.out.println(i + ": " + s);
                s = br.readLine();
            }
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(TextFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(TextFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
