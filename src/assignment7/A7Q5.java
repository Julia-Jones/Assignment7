/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jonej9442
 */
public class A7Q5 {
    public static void random(int rows){
        //generating a random number of stars in each line
        Random random = new Random();
        for(int i = 0; i < rows; i++){
   int randomNum = (int)(Math.random()*(5 - 1 + 1)) + 1;
   //typing them out as *'s.
            System.out.println("  ");
            for(int n = 0; n < randomNum; n++){
                System.out.print("*");
                
            }   
        } 
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //variable for the amount of lines that are needed 
        System.out.println("Enter how many lines you would like to have");
        random(input.nextInt());

        //telling them that its done 
        System.out.println("  ");
        System.out.println("And those are your lines");
        
       
    }
}
