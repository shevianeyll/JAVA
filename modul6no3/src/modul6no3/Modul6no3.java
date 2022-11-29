/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6no3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Modul6no3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int a=4;
    int b=9;
    int i=30;
    int total= 0;
    System.out.println("Deret Aritmatikanya Adalah : ");
    for(int n=14;n<=i;n++){
        int SukuAngka = a +((n-1) * b); //rumus menghitung rumus angka
        total= total + SukuAngka;
        System.out.println(SukuAngka +"\t");
            
    }
         System.out.println();
         System.out.println("Jumlah Deret Aritmatikanya Adalah : "+total); 

}
        }



