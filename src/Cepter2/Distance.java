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
public class Distance {

    public Distance() {
        System.out.println("Enter x1 and y1:");
        double x1=Main.S.nextDouble();
        double y1=Main.S.nextDouble();
        System.out.println("Enter x2 and y2: ");
        int x2=Main.S.nextInt();
        int y2=Main.S.nextInt();
        double a=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        
        
        System.out.println("The distance of the two points is "+Math.pow(a,0.5));//result
        
        
    }
    
}
