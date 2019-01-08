/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVNU6;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author Hieu Trung
 */
public class Ex5 {
  /*Viết chương trình chuẩn hóa chuỗi nhập vào. Cắt bỏ các khoảng trắng đầu cuối hoặc trong chuỗi
     viết hoa chữ cái đầu tiên của các từ trong chuỗi. Cuối chuỗi có dấu chấm kết thúc chuỗi.*/  
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi:");
        s=sc.nextLine();
        s=s.trim();
        char [] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==' '&& arr[i+1]==' ')
                s=s.replace("  ", " ");
        }
        arr= s.toCharArray();
        arr[0]= toUpperCase(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==' '){
                arr[i+1]= toUpperCase(arr[i+1]);
            }
        }
        String ch = String.valueOf(arr);
        String cham =".";
        System.out.println(ch.concat(cham));
    }
}
