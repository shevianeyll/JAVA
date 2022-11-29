/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5pert2;

/**
 *
 * @author ASUS
 */
public class Modul5pert2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mawar=10, melati=2;
        double harga;
        harga = 4500.5;
        double total, bayar;
        
        /*operator penugasan*/
        melati+=2;
        /* Operator Aritmatika */
        total=mawar+melati;
        bayar=total*harga;
        
        System.out.println("jumlah barang yang dibeli = "+mawar+"+"+melati+"="+total);
        System.out.println("total yang dibayar  = Rp"+bayar);        
    }
    
}