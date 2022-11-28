/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.kalkulator;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class ChallengeKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner masukan = new Scanner (System.in);
        int a, b;
        System.out.print("Masukkan nilai a = ");
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b = ");
        b = masukan.nextInt();
        
        int hasiljumlah =  a + b;
        int hasilkurang =  a - b;
        int hasilkali =  a * b;
        int hasilbagi =  a / b;
        
        System.out.println("Hasil Penjumlahan = " +hasiljumlah);
        System.out.println("Hasil Pengurangan = " +hasilkurang);
        System.out.println("Hasil Perkalian = " +hasilkali);
        System.out.println("Hasil Pembagian = " +hasilbagi);
    }
    
}
