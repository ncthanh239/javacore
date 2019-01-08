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
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        
        al.add(10);
        al.add("Thanh");
        al.add("Hieu");
        
        System.out.println(al);
        ArrayList al1 = new ArrayList(al);
        al1.add("Thu lam mom");
        System.out.println(al1);
        
        al.add(0, "Tai Cho");//Thêm được một phần từ khác vào vị trí 0
        System.out.println(al);
        al.add(0, al1);// Thêm được 1 arraylist vào vị trí 0
        System.out.println(al);
        
        al1.clear();//xóa hết phần tử trong arraylist
        al1.clone();//Tạo ra 1 arraylist y hệta
        System.out.println(al1);
        System.out.println(al.contains("Hieu1"));
        
        
        System.out.println(al.get(3));
        
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(i+ "-"+ al.get(i));//Lấy giá trị trong arraylist
        }
        System.out.println("------");
        System.out.println(al.indexOf("Thanh"));//tìm vị trí của thành
        System.out.println(al.isEmpty());
        System.out.println(al.lastIndexOf("Hieu"));//trả về vị trí hiếu từ dưới lên
        System.out.println(al.remove("Hieu"));//Xóa bỏ phần tử Hiếu ở trong arraylist (có 2 hiếu thì chỉ xóa phần tử hiếu đầu tiên)
        System.out.println(al);
        System.out.println(al.remove(0));//Xóa bỏ giá trị ở phần tử thứ 0
        System.out.println(al);
        
        System.out.println("-----");
        System.out.println(al);
        al.set(0, "Zent");//Thay thế bằng giá trị này vào vị trí này
        System.out.println(al);
        System.out.println(al.subList(0, 2));//Lấy ra mảng nhỏ từ 0 đến 1
    }
}
