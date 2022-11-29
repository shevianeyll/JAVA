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
public class PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nama class, nama objek, = new namaconstructor ();
        Mobil mobilA = new Mobil ();
        mobilA.bahanbakar = "Pertamax";
        mobilA.jumlahroda = 4;
        mobilA.kecepatan = 100;
        mobilA.berjalan();
        
    }
    
}
