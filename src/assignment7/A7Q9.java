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
public class A7Q9 {

    public static boolean allDigitsOdd (int[] numbers){
        //if the numbers are all odd then its true  
         boolean odd = true;
        //if numbers aren't odd then return false statement 
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                odd = false;
            }
        }
       // if it's true or false
        return odd;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //vairable and statement asking for the number(s)
        System.out.println("Please enter your number");
        String temp = Integer.toString(input.nextInt());
        int [] numbers= new int[temp.length()];
        
        //for loop to see if the number is odd or not 
        for(int i = 0; i < temp.length(); i++){
            numbers[i] = temp.charAt(i) - '0';
        }
        //if odd types out this statement 
        if(allDigitsOdd(numbers)){
            System.out.println("The numbers are all odd");
            //if even types out this statement 
        }else{
            System.out.println("Not all the numbers are odd");
        }
      
    }
}
