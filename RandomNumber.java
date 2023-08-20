import java.util.*;
public class RandomNumber{
public static void main(String[] args){

boolean b=false;
int marks=0,times=1;
int i,a;

Scanner scan=new Scanner(System.in);

Random rand=new Random();
int r=rand.nextInt(100);
        
System.out.println("You have 5 chances");

do{
for(i=1;i<=5;i++){
    
System.out.println("Enter your guess number");
a=scan.nextInt();

if(r==a){
System.out.println("Your guess is correct");

if(times==1){
if(i==1){
marks=100;
}
if(i==2){
marks=90;
}if(i==3){
marks=80;
}if(i==4){
marks=70;
}if(i==5){
marks=60;
}
}
else if(times==2)
{
if(i==1){
marks=50;
}
if(i==2){
marks=40;
}if(i==3){
marks=30;
}if(i==4){
marks=20;
}if(i==5){
marks=10;
}
}
else
marks=5;


System.out.println("Hurray! You got "+marks+" score");
break;
}
else if(r>a+10){
System.out.println("Your guess is too low");}

else if(r>a){
System.out.println("Your guess is low");}

else if(r>a-10){
System.out.println("Your guess is high");}

else if(r<a){
System.out.println("Your guess is too high");

}
if(i==5 && r!=a){
System.out.println("Sorry,your guess is wrong");
}
}



    System.out.println("Do you want to play again:Yes-true or No-false");
    b =scan.nextBoolean();


times+=1;

}while(b == true);



    }
}