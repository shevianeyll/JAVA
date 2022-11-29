/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author ASUS
 */
public class Mobil {
    //atribut --> variabel
    public String bahanbakar = "";
    public int jumlahroda = 0;
    public int kecepatan = 0;
    
    //constructor
    public Mobil (){
        bahanbakar = "Pertalite";
        jumlahroda = 4;
        kecepatan = 60;
        
    }
    
    
    //operasi --> method
    public void tampilan (){
        System.out.println("Bahan Baakr : " + bahanbakar) ;
        System.out.println("Jumlah Roda : " + jumlahroda);
        System.out.println("Kecepatan : " + kecepatan);
        
    }
    public void mogok () {      
        System.out.println("sedang mogok");
    }
    public void berjalan () {       
        System.out.println("sedang berjalan");
    }
    public void diperbaiki () {    
        System.out.println("sedang diperbaiki");
    }
    
    
}
