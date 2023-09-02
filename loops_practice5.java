/*
Write a java program to find wether a year entered by the user is a leap year or not
*/

import java.util.Scanner;
public class loops_practice5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year :");
        int yr=sc.nextInt();
        if(yr/4==0){
            if (yr/100==0){
                if (yr/400==0)
                {
                    System.out.println("LEAP YEAR ");
                }
                System.out.println("Not a leap year");
            }
            System.out.println("leap year ");
        }
        else
        {
            System.out.println("Not leap year ");
        }

    }
}
