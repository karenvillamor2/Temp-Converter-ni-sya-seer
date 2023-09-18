/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villamor;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class VILLAMOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Temperature Converter ni");
        System.out.println("Press 1 to Celsius to Fahrenheit");
        System.out.println("Press 2 to Fahrenheit to Celsius");
        System.out.println("Press 3 to Kelvin to Fahrenheit");
        System.out.println("Press 4 to Kelvin to Celsius");
        System.out.println("Press 5 to Celsius to Kelvin");
        System.out.println("Press 6 to Fahrenheit to Kelvin");
        
        
        
        System.out.println("Pag enter ug conversion na u gusto");
        int a = input.nextInt();
        
        if (a==1){
            System.out.println("Pag enter ug temperature:");
            double b = input.nextInt();
            System.out.println("chada" + ((b*9/5)+32) +" Fahremheit");
        } else if (a==2){
            System.out.println("Pag enter ug temperature:");
            double b = input.nextInt();
            System.out.println("chada" + ((b-32)*5/9)+ " Celsius");
        } else if (a==3){
            System.out.println("Pag enter ug temperature:");
           double b = input.nextInt();
           System.out.println("chada" + (((b-273.15)*1.8)+ 32) + " Fahrenheit");
        } else if  (a==4){
            System.out.println("Pag enter ug temperature:");
           double b = input.nextInt();
           System.out.println("chada" + (b-273.15)+ " Celsius");
        } else if (a==5){
            System.out.println("Pag enter ug temperature:");
           double b = input.nextInt();
           System.out.println("chada" + (b+273.15) + " Kelvin");
        } else if (a==6) {
             System.out.println("Pag enter ug temperature:");
           double b = input.nextInt();
           System.out.println("chada" + (((b-32)*5/9)+273.15) + " Kelvin");
        } else {
            System.out.println("di day ko");
            
           }
            
        
        




// TODO code application logic here
    }
    
}
