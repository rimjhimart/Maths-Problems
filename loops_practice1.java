/*
1) what will be the output of the program:
int a=10;
if(a=18)
	sout("i am 18");
else
	sout ("i am not 18");
*/


import java.util.Scanner;
import java.io.*;
public class loops_practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey user enter ur age :");
        int age= sc.nextInt();
        if (age==18)
        {
            System.out.println("I am 11yr old");
        }
        else if (age >18) {
            System.out.println("I am above 11yr");
        } else
            System.out.println("I am below 11yr old");
    }
}
