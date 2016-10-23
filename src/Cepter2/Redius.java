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
public class Redius {
    Redius(){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter The Redius and length of a cylinder:");
        double R=S.nextDouble();
        double L=S.nextDouble();
        double area=R*R*3.14159;
        double volume=area*L;
        System.out.println("The Area Is "+area);
        System.out.println("The Valume Is "+volume);
    }
    
}
