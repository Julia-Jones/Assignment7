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
public class A7Q8 {

    private static String seasons(int month, int day) {
        String season = "";
        //calculating if it is winter 
        if (month <= 3 && day <= 15) {
            season = "Winter";
        } else if (month <= 12 && day <= 16){
            season = "Winter";
            //if it is spring
        }else if (month <= 3 && day <= 15) {
            season = "Spring";
        } else if (month <= 6 && day <= 15) {
            season = "Spring";
            //if it is summer 
        } else if (month <= 6 && day <= 16) {
            season = "Summer";
        } else if (month <= 9 && day <= 15) {
            season = "Summer";
            //if it is Fall
        } else if (month <= 9 && day <= 16) {
            season = "Fall";
        } else if (month <= 12 && day <= 15) {
            season = "Fall";
        }
        //outputing the season 
        return season;
        BROKE
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the Month as a number");
        int month = input.nextInt();
        
        System.out.println("Please enter the Day as a number");
        int day = input.nextInt();
        
        String seasonOutput = seasons(month,day);
        //output order
        
        System.out.println("The season is " + seasonOutput);
    }
}
