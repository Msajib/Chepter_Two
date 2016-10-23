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
public class Meters {
Meters(){
    Scanner S =new Scanner(System.in);
    System.out.print("Enter The Value For Feet:");
    int feet=S.nextInt();
    
    double meter=feet*0.305;
    System.out.println(feet+" Feet Is "+meter+" Meters");
}    
}
