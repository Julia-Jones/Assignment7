package assignment7;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonej9442
 */
public class A7Q3 {

    public static void factors(int number) {
       
        // calculating the factors of each number
        System.out.println("The factors of " + number + " are. ");
        for (int i = 1; i <= number; i++) {
            double factor = number/i; 
        //check for remaining
        //sout here so no return
            // outputting those that divide evenly into the number
        if (number % i == 0) {
            System.out.println((int)factor);
    }
  }
}
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //asking for the number and creating a variable
        System.out.println("Please enter the number");
        int number = (int) input.nextDouble();

        factors(number);

    }
  }
