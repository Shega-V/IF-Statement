/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement;

import java.util.Scanner;


/**
 *
 * @author shegavala
 */
public class IfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner( System.in);
        System.out.println("Enter the grade:");
        
        int number = scanner.nextInt();
       
        
        if (number >= 90 && number <= 100) {
            System.out.println("A");
        } else if (number >= 80 && number <= 90){
            System.out.println("B");
        } else if (number >= 70 && number <= 80){
            System.out.println("C");
        } else if (number >= 65 && number < 70){
            System.out.println("D");
        }else if (number >= 0 && number < 65){
            System.out.println("F");
            
        } else { 
            System.out.println("The number is not in the range");
        }
            
    }
    
}
