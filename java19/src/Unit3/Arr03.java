/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

/**
 *
 * @author Hieu Trung
 */
public class Arr03 {

    public static void main(String[] args) {
        int arr01[] = {1, 2, 3};
        int arr02[] = {4, 5, 6};
        int arr_x[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int i = 0; i < arr_x.length; i++) {
            for (int j = 0; j < arr_x[i].length; j++) {
                System.out.print("\t" + arr_x[i][j]);
            }
            System.out.println("");
        }
    }

}
