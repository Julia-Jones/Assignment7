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
public class A7Q7 {
    //getting the first number 
    public static int firstDigit(int number){
        while(number > 9){
            number/=10;
        }
        //returning the first number after it was found 
        return number;        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //creating number variable and asking for it 
        System.out.println("Please enter in an integer");
        int number = input.nextInt();
        
        //output
        System.out.println("  ");
        System.out.println("The first digit is: " + firstDigit(number));
    }
}
