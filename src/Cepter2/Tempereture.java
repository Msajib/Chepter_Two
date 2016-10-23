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
public class Tempereture {

    Tempereture() {
        System.out.println("Enter the temperature in Fahrenheit: ");
        double tem=Main.S.nextDouble();
        System.out.println("Enter the wind speed miles per hour:");
        int wind=Main.S.nextInt();
        double windChil = 35.74 + 0.6215*tem - 35.75*Math.pow(wind,0.16) + 0.4275*tem*Math.pow (wind,0.16);
        System.out.println("The wind chill index is "+windChil);

    }
    
    
}
