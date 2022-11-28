/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputanpbo;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class InputanPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner (System.in);
        int a, b;
        System.out.print("Masukkan nilai a :");
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b :");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("Nilai Variabel yang ada pada program :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
