/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsijava;

/**
 *
 * @author ASUS
 */
public class Fungsijava {

    /**
     */
    public static void cetak(){
        System.out.println("kelas xr7");
        
    }
    public static int nilai(){
        int hasil = 100;
        return hasil;
    }
    public static int hitung (int a, int b){
        int jumlah = a + b;
        return jumlah;
    }
    public static void main(String[] args) {
        cetak ();
        System.out.println("nilai anda : " + nilai());
        
        System.out.println("jumlah : " + hitung (10, 20));

    }
    
}
