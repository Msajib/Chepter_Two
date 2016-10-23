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
public class Hexagon {
    Hexagon(){
        System.out.println("Enter the side: ");
        double s=Main.S.nextDouble();
        double result=(3*(Math.pow(3,0.5)))/2*Math.pow(s,2);
        System.out.println("The area of the hexagon is "+result);
        
    }
    
}
