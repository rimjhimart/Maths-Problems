/*
3) CALCULATE income tax paid by an employee to the government as per the slabs mentioned below:
income slab 	tax
2.5L-5.0L   	5%
5.0L-10.0L  	20%
Above 10.0L 	30%
*/

import java.util.Scanner;
public class loops_practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income tax paid :");
        float tax=sc.nextFloat();
        if(tax>2.5) {
            if (tax > 2.5 && tax < 5.0) {
                System.out.println("Tax paid is 5%");
            } else if (tax > 5.0 && tax < 10.0) {
                System.out.println("Tax paid is 20%");
            } else {
                System.out.println("Tax paid is 30%");
            }
        }
        else{
            System.out.println("No tax paid ");
        }
    }
}
