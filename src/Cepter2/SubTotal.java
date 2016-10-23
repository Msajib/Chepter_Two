/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cepter2;

import java.util.Scanner;

/**
 *
 * @author sajib
 */
public class SubTotal {
    Scanner S=new Scanner(System.in);
    SubTotal(){
        System.out.print("Enter the subtotal and a gratuity rate:");   
    double D=S.nextDouble();
    int I=S.nextInt();
    double total=(D*I)/100;
        System.out.println("The gratuity is "+total+" And Total Is "+(D+total));
    }
    
}
