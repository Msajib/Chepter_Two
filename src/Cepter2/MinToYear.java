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
public class MinToYear {
    MinToYear(){
    Scanner S=new Scanner(System.in);
    int input=S.nextInt();
    int year=input/60/24/365;
    int Day=input/60/24%365;
    int Hours=input/60%24;
    int min = input%60;
    
        System.out.println(input+" Minutes is Approximately "+year+" Year "+Day+" Day "+Hours+" Hour "+min+" Min");
    
    }
    
    
    
}
