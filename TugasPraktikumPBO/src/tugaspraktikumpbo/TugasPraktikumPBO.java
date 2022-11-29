/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class TugasPraktikumPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner myobj = new Scanner(System.in);
        System.out.println("Masukkan Nilai Jari-jari : ");
        int jari = myobj.nextInt();

        System.out.println(
                TugasPraktikumPBO.hitung(jari)
        );
    }
    static double hitung(int r){
        return 4 * Math.PI * Math.pow(r, 2); // return L=4*phi*r^2
    }
}

    
