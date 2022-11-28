/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author ASUS
 */
public class Gaji extends Identitas {
    int gaji = 1_200_000;
    int bonus = gaji * 2;
    
    public void nama (){
        System.out.println("Nama pegawai \t : "+super.nama);
    }
    public void gender (){
        System.out.println("Jenis Kelamin \t : "+super.gender);
    }   
    void ID (){
        System.out.println("Nomor Pegawai : 0053313100");
    }
    void jabatan (){
        System.out.println("Bekerja di bagian Admin");
    }
    
    void gaji (){
        System.out.println("Gaji Utama yang Didapat \t : "+gaji);
        
    }
    void bonus (){
        System.out.println("Gaji yang Didapat Jika Bekerja Secara Baik Menjadi \t : "+bonus);
    }
       
}
