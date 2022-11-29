/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog7foreach;

/**
 *
 * @author ASUS
 */
public class Prog7foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int a=1; a<=3; a++) {
   for (int i =1; i<=a; i++) {
    
           System.out.print("*\t");
       }
       System.out.println();
   }
        for (int a=2; a>=1; a--) {
            for (int i=a; i>=1; i--) {
                System.out.print("*\t");
            }
            
            System.out.println();
        }
    }
    
}
