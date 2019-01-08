/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit7;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap hs = new HashMap();

        hs.put("Hi", "Xin Chào");
        hs.put("Hello", "Xin Chào");
        hs.put("Class", "Lớp");

        System.out.println(hs);

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào từ cần tra:");
        String input = sc.nextLine();
        if (hs.containsKey(input)) {//kiểm tra giá trị có trong hash map 
            System.out.println(input + " có nghĩa là: " + hs.get(input));
        } else {
            System.out.println("Not Found");
        }

        System.out.println(hs.keySet());//xuất ra các giá trị có trong hash map

    }
}
