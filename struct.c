#include <stdio.h>  
#include <string.h>  
  
struct student  
{  
    char name[ 30];  
    int roll_no;  
    char state[100];  
    int age;  
};  
struct student s1, s2;
int main()  
{  

    strcpy (s1.name, "John");  
    s1.roll_no = 1101;  
    strcpy (s1.state, "Los Angeles");  
    s1.age = 20;      
        
    strcpy (s2.name, " Mark Douglas");  
    s2.roll_no = 111;  
    strcpy (s2.state, "California");  
    s2.age = 18;  
      
    printf (" Name of the student s1 is: %s\t ", s1.name);  
    printf (" \n Roll No. of the student s1 is: %d\t ", s1.roll_no);  
    printf (" \n The state of the student s1 is: %s\t ", s1.state);  
    printf (" \n Age of the student s1 is: %d\t ", s1.age);  
      
    printf ("\n Name of the student s1 is: %s\t ", s2.name);  
    printf (" \n Roll No. of the student s1 is: %d\t ", s2.roll_no);  
    printf (" \n The state of the student s1 is: %s\t ", s2.state);  
    printf (" \n Age of the student s1 is: %d\t ", s2.age);  
    return 0;  
}  