/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cepter2;

/**
 *
 * @author sajib
 */
public class Interest {
       
    Interest(){
        System.out.println("Enter balance and interest rate ");
        int balance=Main.S.nextInt();
        double interest=Main.S.nextDouble();
        double aInterest=(balance*interest)/1200; 
        System.out.println("The interest is "+aInterest);
        
    }
    
}
