/*
2)write a program to find out whether a student is pass or fail;
if it requires total 40% AND AT LEAST 33% in each subject to pass.
assume 3 subjects and take marks as an input from the user.
*/

import java.util.Scanner;

public class loops_prcatice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur chemistry sub marks");
        int chem=sc.nextInt();
        System.out.println("Enter ur physics sub marks");
        int phy=sc.nextInt();
        System.out.println("Enter ur maths sub marks");
        int math=sc.nextInt();
        int total=(chem+phy+math)/3;
        if(math>=33 && phy>=33 && chem>=33)
        {
                System.out.println("PASS");
        }
        else
        {
            if (total >= 40)
            {
                System.out.println("PASS");
            }
            else
            {
                System.out.println("FAIL");
            }
        }
    }
}
