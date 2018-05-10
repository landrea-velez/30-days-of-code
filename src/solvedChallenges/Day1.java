package solvedChallenges;

import java.util.Scanner;

public class Day1 {

    public static void main(String [] args){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;


        /* Read and save an integer, double, and String to your variables.*/
        String si = scan.nextLine();
        i2 = Integer.parseInt(si);

        String sd2 = scan.nextLine();
        d2 = Double.parseDouble(sd2);

        s2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.printf("%d\n", i + i2);

        /* Print the sum of the double variables on a new line. */
        System.out.printf("%.1f\n", d + d2);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        s += s2;
        System.out.println(s);

        scan.close();
    }
}
