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
public class Payroll {
    Payroll(){
        Scanner S=new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String Name=S.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        int hWork=S.nextInt();
        System.out.println("Enter Hourly Pay Rate: ");
        double rate=S.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double fedral=S.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double tax=S.nextDouble();
        System.out.println("Employ Name: "+Name);
        System.out.println("Hours Workd :"+hWork);
        System.out.println("Pay Rete :$"+rate);
        System.out.println("Gross Pay:$");
        
    }
    
}
