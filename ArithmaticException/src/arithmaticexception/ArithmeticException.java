/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmaticexception;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class ArithmeticException {
    public static void main(String[] args) {
        //int a=100;
    //     System.out.println("Enter the value for b");
         Scanner console = new Scanner(System.in);
    // int b = console.nextInt();
    
       

    // Exception Handling
        try  {
           System.out.println("Enter the value for c");  
    int c = console.nextInt();
        int res=c/0;
        // 10/(b-c);    
        System.out.println(" The result is "+res);
        } 
        catch (Exception exception_message){
            System.out.println("adalah = "+exception_message);
        }
    }
}

