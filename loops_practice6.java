import java.util.Scanner;
public class loops_practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is on orgizantional website");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("This is an Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
    }
}
