/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author jonej9442
 */
public class A7Q4 {

    public static double compoundInterest(double principal, double rate, int years) {
        //B=P(1+r)^n where B is the balance, 
        //P is the principle (initial amount),
        //r is the interest rate, and n is the number of years.
        
        
        // calculating the compound interest
        double balance = principal*Math.pow(1 + rate, years);
        return balance;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        //creating variable and asking for principal
        System.out.println("Please enter the principle");
        double principal = input.nextDouble();
        
        //creating variable and asking for the rate
        System.out.println(" ");
        System.out.println("Please enter the interest rate in decimal form");
        double rate = input.nextDouble();
        
        //creating variable and asking for the amount of years
        System.out.println(" ");
        System.out.println("Please enter the number of years ");
        int years = input.nextInt();

        //output
        System.out.println("The compound Interest is " + compoundInterest(principal,rate, years));


    }
}
