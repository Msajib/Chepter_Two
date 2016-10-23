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
public class LengthP {
    LengthP(){
        System.out.println("Enter v and a: ");
        int v=Main.S.nextInt();
        double a=Main.S.nextDouble();
        double length=(v*v)/(2*a);
        System.out.println("The minimum runway length for this airplane is "+length);
    }
}
