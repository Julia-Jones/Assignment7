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
public class A7Q6 {

    //calculating/finding the last number and returning it 
    public static int lastDigit(int number){
        return Math.abs(number % 10);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //creating a variable for the number that will be entered
        System.out.println("Please enter in an integer");
        int number = input.nextInt();
        
        //output statement 
        System.out.println(" ");
        System.out.println("The last digit is:" + lastDigit(number));
        
       
        
    }
}
