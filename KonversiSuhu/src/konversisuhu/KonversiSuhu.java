/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

/**
 *
 * @author ASUS
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             var c = 78;
        System.out.println("Convert Celcius to Reamur : " +CtoR(c));
        System.out.println("Convert Celcius to Fahrenheit : " +CtoF(c));
        System.out.println("Convert Celcius to Kelven : " +CtoK(c));

    }

    static double CtoR (double c){
      return 0.8*c;
    }
    static double CtoF (double c) {
        return 1.8*c+32;
    }
    static double CtoK (double c) {
        return c+273;
    }
}
    