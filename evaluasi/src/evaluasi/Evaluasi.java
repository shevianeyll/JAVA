/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluasi;

/**
 *
 * @author ASUS
 */
public class Evaluasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int laptop, hardisk, mouse;
        laptop = 7;
        hardisk = 11;
        mouse = 21;
        
        long harga_laptop, harga_hardisk, harga_mouse;
        harga_laptop = 10000000;
        harga_hardisk = 1500000;
        harga_mouse = 150000;
        
        long total_barang;
        total_barang = laptop+hardisk+mouse;
        System.out.println("Total barang : " +total_barang);
        
        long total_laptop, total_hardisk, total_mouse;
        total_laptop = laptop*=harga_laptop;
        total_hardisk = hardisk*=harga_hardisk;
        total_mouse = mouse*=harga_mouse;
        
        
        System.out.println("Total harga laptop : " +total_laptop);
        System.out.println("Total harga hardisk : " +total_hardisk);
        System.out.println("Total harga mouse : " +total_mouse);
        
        long total_aset;
        total_aset = total_mouse+total_hardisk+total_laptop;
        System.out.println("Total aset : " +total_aset);
        // TODO code application logic here
    }
    
}
