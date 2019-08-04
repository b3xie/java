/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author GABZXTH
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        double c, d;
        d = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println(n); // output inútil, coloquei apenas pra ver se estava funcionando
        for(int x = 1; x<=n; x++)
        {
            a = (int) Math.pow(2, x);
            b = (2*x-1)*(2*x+1);
            c = a /((double)b);
            System.out.println(c); // esse também, só pra ver se funciona certinho
            d+=c;
                   
            
        }
        
        System.out.println("Resultado:");
        System.out.println(d); 
                
        
        
        
    
}
}
