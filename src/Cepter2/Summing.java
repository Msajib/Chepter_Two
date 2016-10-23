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
public class Summing {
    Scanner S=new Scanner(System.in);
    Summing(){
     int input=S.nextInt();
     int result=input%10;
     int result1=(input/10)%10;
     int result2=input/10;
     int result3=(result2/10)%10;
        System.out.println(result+result1+result3);
        
     
    }
    
}
