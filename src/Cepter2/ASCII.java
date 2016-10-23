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
public class ASCII {
    ASCII(){
        Scanner S=new Scanner(System.in);
        System.out.println("Enter 65-128 to know ASCII Value");
        int num = S.nextInt();
        String str = Character.toString((char)num);
            System.out.println(str);
        }
    
}
