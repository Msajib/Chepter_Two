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
public class Triangle {

    public Triangle() {
        System.out.println("Enter three points for a triangle: ");
          System.out.println("Enter x1 & y1: ");
        double x1 = Main.S.nextDouble();
        double y1 = Main.S.nextDouble();
        
        System.out.println("Enter x2 & y2: ");
        double x2 = Main.S.nextDouble();
        double y2 = Main.S.nextDouble();
        
        System.out.println("Enter x3 & y3: ");
        double x3 = Main.S.nextDouble();
        double y3 = Main.S.nextDouble();
        
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
        double side3 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);

        double s = (side1 + side2 + side3)/2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        System.out.printf("The area of the triangle is %.2f ", + area);
    }
    }
    
    

