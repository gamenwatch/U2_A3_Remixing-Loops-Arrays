/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a3_remixing.loops.arrays;

import java.util.Scanner;

/**
 * Jacob L
 * Oct 26 2018
 * Practicing w/ Loops w/ Arrays
 */
public class U2_A3_RemixingLoopsArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create Scanner
        Scanner keyedInput = new Scanner (System.in);
        
        //Choice Varible
        int runPractice;
        
        //Pick Which Practice to Run
        System.out.println("What practice do you wish to run? (1,2,3)");
        runPractice = keyedInput.nextInt();
        
        switch (runPractice) {
            
            case 1:
                //#1 Take 20 Numbers and Find Their Sum
                int [ ] numbers = new int [20];
                int total = 0;

                System.out.println("Enter ten integers and they will be added together:");
                for (int i = 0; i <= 19; i = i + 1)
                {
                   numbers[i] = keyedInput.nextInt();
                }


                for (int i = 0; i <= 19; i = i + 1)
                {
                     total = total + numbers[i];
                }

                System.out.println("The sum of those numbers is:");
                System.out.println(total);
                break;
                
            case 2:
                //#2 Take 5 Friends and Output the 2,3,4
                String [ ] friends = new String [6];

                System.out.println("Enter the names of five friends:");
                for (int i = 0; i <= 5; i = i + 1)
                {
                    friends[i] = keyedInput.nextLine();
                }

                System.out.println("The second, third, and fourth names listed were:");
                System.out.println("Second: " + friends[2]);
                System.out.println("Third: " + friends[3]);
                System.out.println("Fourth: " + friends[4]);
                break;
                
            case 3:
                //#3 Takes a set of marks and caluclates an average
                double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
                double totalThree = 0;
                double average;

                System.out.println("These are the marks:");
                for (int i = 0; i<=8; i= i + 1)
                {
                   System.out.println(marks[i]);
                }

                for (int i = 0; i<=8; i= i + 1)
                {
                    totalThree = totalThree + marks[i];
                }

                average = totalThree/8;

                average = average * 10;
                average = Math.round(average);
                average = average/10;

                System.out.println("The average mark is:");
                System.out.println(average);
        }
                
        
    }
    
}
