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
public class A7Q2 {

    public static char examGrade(double mark) {

         
       //initialize your letter 
       char letter = ' ';
       
       // corresponding the number with the letter 
        if (mark >= 80) {
            letter = 'A';
        } else if (mark >= 70) {
            letter = 'B';
        } else if (mark >= 60) {
            letter = 'C';
        } else if (mark >= 50) {
            letter = 'D';
        } else if (mark < 50) {
            letter = 'F';
        }
        return letter;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //asking for the mark
        System.out.println("Please enter your mark");
        double mark = input.nextDouble();

        //output
        System.out.println(" ");
        System.out.println(examGrade(mark));
        

    }
}
