/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jonej9442
 */
public class A7Q1 {

    public static double circleArea(double radius) {

        //squaring (base, power) 
        double rSquared = Math.pow(radius, 2);
        //multiplying all together
        double area = Math.PI * rSquared;
        return area; //sends back an answer
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // asking and creating variable 
        System.out.println("Enter the radius");
        double radius = input.nextDouble();

        //DecimalFormat n = new DecimalFormat("###.##");
        System.out.println("The radius is " + circleArea(radius));


    }
}
