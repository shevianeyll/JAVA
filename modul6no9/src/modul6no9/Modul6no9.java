/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6no9;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Modul6no9 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
            int[] angka = {10,20,4,5,8};

            printArray(angka, "masukkan angka ");
            reverse(angka);
            printArray(angka, "mengurutkan dari yang terbesar ");
        }
    private static void reverse(int[] data){
        Arrays.sort(data); // untuk mengurutkan array
        int[] arrayBuffer = Arrays.copyOf(data, data.length);

        for (int i = 0; i < data.length; i++){
            data[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }
    private static void printArray(int[] data, String message){
        System.out.println(message + " = " + Arrays.toString(data));
    }
}
