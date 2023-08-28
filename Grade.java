import java.util.*;
public class Grade{
public static void main(String[] args)
{
float sum=0;
Scanner scan=new Scanner(System.in);
System.out.print("How many subjects:");
int sub =scan.nextInt();
System.out.println("Enter your " +sub+" subject Marks:");
for(int i=1;i<=sub;i++)
{

int a=scan.nextInt();
sum+=a;  
}
System.out.println("Your total marks = "+sum+" out of "+sub*100);
float b=sum/sub;
System.out.println("Average = "+b);
if(b>=90)
System.out.println("Grade = A");
else if(b>=80)
System.out.println("Grade = B");
else if(b>=70)
System.out.println("Grade = C");
else if(b>=60)
System.out.println("Grade = D");
else
System.out.println("Grade = E");

}
}
