/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas7for;

/**
 *
 * @author ASUS
 */
public class Progdas7For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Menampilkan tulisan SMK Telkom Malang 10x increment
        for(int i=0; i<10; i++){
            System.out.println("SMK Telkom Malang");
        }
        //Menampilkan tulisan SMK Telkom Malang 10x decrement
        for(int j=10; j>0; j--){
            System.out.println("SMK Telkom Malang");
        }
        
        System.out.println("\n");
        for(int a=10; a<=50; a+=10){
            System.out.println(a);
        }
    }
    
}
