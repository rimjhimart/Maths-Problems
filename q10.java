//3) write a java program to fill in a letter template which bots like below:
//letter="dear <!name!> ,thanks a lot "
//replace <! name !> with a string(some name)

import java.util.Scanner;
public class string_practice3 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String xyz ="... DEAR <! name !> , Thanks a lot ...";
        System.out.print("Enter the name - ");
        String name = sc.nextLine();
        System.out.println(xyz.replace("<! name !>",name));


    }
}
