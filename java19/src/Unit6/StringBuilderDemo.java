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
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Zent Group");
        System.out.println(sb);

        sb.append("Be all you can be");
        System.out.println(sb);
        sb.insert(0, "Hi,");
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
