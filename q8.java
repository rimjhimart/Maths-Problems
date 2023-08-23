//1) write a java program to convert a string to lowercase

import java.util.Locale;
import java.util.Scanner;
public class string_practice1 {
    public static void main (String[]args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the String - ");
        String a=sc.nextLine();
        String lower=a.toLowerCase();
        System.out.println(lower);
    }
}
