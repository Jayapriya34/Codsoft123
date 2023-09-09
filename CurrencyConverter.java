import java.util.*;
public class CurrencyConverter{
static double RupeesToDollars(int n){
   double r=n/83.12;
   return r;
}

static double RupeesToEuro(int n){
   double r=n*0.011;
   return r;
}

static double RupeesToYen(int n){
   double r=n*1.78;
   return r;
}

static double RupeesToPound(int n){
   double r=n*0.0097;
   return r;
}

static double DollarsToRupees(int n){
   double r=n*83.12;
   return r;
}

static double DollarsToEuro(int n){
   double r=n*0.928;
   return r;
}

static double DollarsToYen(int n){
   double r=n*147.78;
   return r;
}

static double DollarsToPound(int n){
   double r=n*0.80;
   return r;
}

static double EuroToRupees(int n){
   double r=n*88.92;
   return r;
}

static double EuroToDollars(int n){
   double r=n/0.93;
   return r;
}

static double EuroToYen(int n){
   double r=n*158.36;
   return r;
}

static double EuroToPound(int n){
   double r=n*0.86;
   return r;
}

static double YenToRupees(int n){
   double r=n/1.78;
   return r;
}

static double YenToDollars(int n){
   double r=n/147.78;
   return r;
}

static double YenToEuro(int n){
   double r=n/158.36;
   return r;
}

static double YenToPound(int n){
   double r=n*0.0054;
   return r;
}

static double PoundToRupees(int n){
   double r=n/0.0097;
   return r;
}

static double PoundToDollars(int n){
   double r=n*1.25;
   return r;
}

static double PoundToEuro(int n){
   double r=n/0.86;
   return r;
}

static double PoundToYen(int n){
   double r=n/0.0054;
   return r;
}

public static void main(String args[]){
double c,d,e,f,g,h,i,j,k,l,m,o,p,q,s,t,u,v,w,x;
Scanner scan=new Scanner(System.in);
System.out.println("Enter appropriate number of the currency to convert:\n1.Rupees\n2.Dollars\n3.Euro\n4.Yen\n5.Pound");
int a=scan.nextInt();
System.out.println("Enter appropriate number of any one of the currency:\n1.Rupees\n2.Dollars\n3.Euro\n4.Yen\n5.Pound");
int b=scan.nextInt();
System.out.println("Enter Amount:");
int n=scan.nextInt();

if(a == 1 && b == 2){
c=RupeesToDollars(n);
System.out.println("$"+c);
}
else if(a==1 && b==3){
d=RupeesToEuro(n);
System.out.println(""+d);
}
else if(a==1 && b==4){
e=RupeesToYen(n);
System.out.println("¥"+e);
}
else if(a==1 && b==5){
f=RupeesToPound(n);
System.out.println(f);
}
else if(a==2 && b==1){
g=DollarsToRupees(n);
System.out.println("₹"+g);
}
else if(a==2 && b==3){
h=DollarsToEuro(n);
System.out.println(h);
}
else if(a==2 && b==4){
i=DollarsToYen(n);
System.out.println("¥"+i);
}
else if(a==2 && b==5){
j=DollarsToPound(n);
System.out.println(j);
}
else if(a==3 && b==1){
k=EuroToRupees(n);
System.out.println("₹"+k);
}
else if(a==3 && b==2){
l=EuroToDollars(n);
System.out.println("$"+l);
}
else if(a==3 && b==4){
m=EuroToYen(n);
System.out.println("¥"+m);
}
else if(a==3 && b==5){
x=EuroToPound(n);
System.out.println(x);
}
else if(a==4 && b==1){
o=YenToRupees(n);
System.out.println("₹"+o);
}
else if(a==4 && b==2){
p=YenToDollars(n);
System.out.println("$"+p);
}
else if(a==4 && b==3){
q=YenToEuro(n);
System.out.println(q);
}
else if(a==4 && b==5){
s=YenToPound(n);
System.out.println(s);
}
else if(a==5 && b==1){
t=PoundToRupees(n);
System.out.println("₹"+t);
}
else if(a==5 && b==2){
u=PoundToDollars(n);
System.out.println("$"+u);
}
else if(a==5 && b==3){
v=PoundToEuro(n);
System.out.println(v);
}
else if(a==5 && b==4){
w=PoundToYen(n);
System.out.println("¥"+w);
}
else
System.out.println("Not Available");

}
}
