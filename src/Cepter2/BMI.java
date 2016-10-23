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
public class BMI {
    BMI(){
        System.out.println("Enter weight in Pounds: ");
        double weightt=Main.S.nextDouble()* 0.45359237;
        System.out.println("Enter height in inches :");
        double height=Main.S.nextDouble()*0.0254;
        double hei=height*height;
        double BMI=weightt/hei;
        System.out.println("BMI is :"+BMI);
        
          
    }
        
    
}
