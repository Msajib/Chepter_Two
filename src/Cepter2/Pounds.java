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
public class Pounds {
    Pounds(){
        Scanner S =new Scanner(System.in);
    System.out.print("Enter The Number in Pounds:");
    double pounds=S.nextDouble();
    
    double Kilogram=pounds*0.454;
    System.out.println(pounds+" Pounds Is "+Kilogram+" Kilogram");
    }
    
}
