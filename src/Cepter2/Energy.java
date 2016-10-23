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
public class Energy {
    Energy(){
        System.out.println("Enter the amount of water in kilograms: ");
        double water=Main.S.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double tem=Main.S.nextDouble();
        System.out.println("Enter the final temperature: ");
        double fTem=Main.S.nextDouble();
        double energy=water*(fTem-tem)*4184;
        System.out.println("The energy needed is "+energy);

    }
}
