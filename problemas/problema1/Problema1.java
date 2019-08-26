/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;



/**
 *
 * @author Lab
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        int b;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        for(int x = 0; x<n; x++){
            a = (int) Math.pow (2,n);
            b = (2*n-1) * (2*n+1);
            result = ((double) a) / b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(result);

            
            
            

            
        }
        
    }
    
}
