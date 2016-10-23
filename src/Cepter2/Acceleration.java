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
public class Acceleration {
     Acceleration(){
         System.out.println("Enter v0, v1, and t: ");
     double vo=Main.S.nextDouble();
     double v1=Main.S.nextDouble();
     double t=Main.S.nextDouble();
     double a=(v1-vo)/t;
         System.out.println("The average acceleration is "+a);
     }
}
