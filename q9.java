//2) write a java program to replace space with underscores

import java.util.Scanner;
public class string_practice2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String - ");
        String str=sc.nextLine();
        System.out.println(str.replace(' ','_'));
    }
}
