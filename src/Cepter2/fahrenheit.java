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
public class fahrenheit {
  
    fahrenheit(){
        System.out.print("Enter a Digree in celsius:");
        Scanner sc = new Scanner(System.in);
        int Celsius=sc.nextInt();
        double fahrenheit=((9.0/5)*Celsius+32);
                
        System.out.println(Celsius+" Celsius is "+fahrenheit+" Fahrenheit");
        
    }
    
}
