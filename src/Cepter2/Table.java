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
public class Table {
    Table(){
        System.out.println("a      b      pow(a, b) ");
        int n1=Main.S.nextInt();
        int n2=Main.S.nextInt();
        System.out.println(n1+"  "+n2+"  "+Math.pow(n1, n2));
    }
    
}
