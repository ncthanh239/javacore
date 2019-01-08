/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6;

/**
 *
 * @author Hieu Trung
 */
public class StringDemo {

    public static void main(String[] args) {
        String s = "Zent Group G G";
        String slogan = " Let's change !";
        System.out.println(s.charAt(4));//tìm ra kí tự thứ 4
        System.out.println(s.concat(slogan));//nối chuỗi 
        System.out.println(s.contains("Zent"));// thuộc trong chuỗi
        System.out.println(s.equals("zent Group"));// so sánh 
        System.out.println(s.equalsIgnoreCase("zent Group"));// so sánh bỏ qua k phân biệt chữ hoa chữ thường

        System.out.println(s.indexOf("G"));//chỉ số của chữ G
        System.out.println(s.indexOf("G", 12));//chỉ số của chữ G từ vị trí thứ 12
        System.out.println(s.isEmpty());// chuỗi rỗng
        System.out.println(s.lastIndexOf("G"));//chạy ngược lại chỉ số của chữ G
        System.out.println(s.lastIndexOf("G", 12));//chạy ngược lại tìm chỉ số của chữ G từ vị trí thứ 12
        System.out.println(s.length());//độ dài chuỗi

        System.out.println(s.replace("G", "T"));

        String info = "Nguyen Chi Thanh\t01657839922\tmichellenguyen239@gmail.com";
        String arr[] = info.split("\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-" + arr[i]);
        }

        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 6));// cắt từ vị trí thứ 4 đến 6
        System.out.println(s.toLowerCase());//viết thường chuỗi
        System.out.println(s.toUpperCase());//viết hoa chuỗi
        System.out.println(s.trim());
        
    }
}
