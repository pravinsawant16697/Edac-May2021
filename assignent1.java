//Prg-1

class hello1
{
   public static void main(String args[])
   { 
     System.out.println("Hello");
	 System.out.print("Pravin");
   }
}   

//Prg-2

import java.util.*;
class Sum1
{
   public static void main(String args[])
   {
	    
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter two numbers for addition");
	 float i=sc.nextFloat();
     float j=sc.nextFloat();
     float k=i+j; 
     System.out.println("SUM="+k);
   }
}   
     	 
//Prg-3

import java.util.*;
class Division1
{
   public static void main(String args[])
   {  
     System.out.println("enter the two numbers to perform division");
     Scanner sc= new Scanner(System.in);
	 float i=sc.nextFloat();
     float j=sc.nextFloat();
     float k=i/j;
      
     System.out.println("Division="+k);
   }
}

//Prg-4

class Evaluation1
{
   public static void main(String args[])
   {
        int a=-5+(8*6);
        int b=(55+9)%9;
        int c=20 + (-3*5) / 8;
        int d=5 + 15 / 3 * 2 - 8 % 3;		
	    System.out.println("evaluation of (-5 + 8 * 6 )= " +a);
        System.out.println("evaluation of ((55+9) % 9)= " +b);
		System.out.println("evaluation of (20 + -3*5 / 8)= " +c);
		System.out.println("evaluation of (5 + 15 / 3 * 2 - 8 % 3)= " +d);
   }
}

//Prg-5

import java.util.*;

class Product1
{ 
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Input First Number");
	 int i=sc.nextInt();
	 System.out.println("Input Second Number");
	 int j=sc.nextInt();
	 
	 int k=i*j;
	 System.out.println("Product of two numbers="+k);
   } 
} 

//Prg-6

import java.util.*;
class operation1
{
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Input first number");
	 int i=sc.nextInt();
	 System.out.println("Input second number");
     int j=sc.nextInt();
     
	 int a=i+j;
     int s=i-j;
     int m=i*j;
     int d=i/j;
     int r=i%j;  	 
     
	 System.out.println(i+ " + "+ j+" = "+a);
	 System.out.println(i+ " - "+ j+" = "+s);
	 System.out.println(i+ " * "+ j+" = "+m);
	 System.out.println(i+ " / "+ j+" = "+d);
	 System.out.println(i+ " mod "+ j+" = "+r);
   }
}        	

//Prg-7

import java.util.*;
class table1
{
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Input a number ");
	 int n =sc.nextInt();
	 for(int i=1;i<=10;i++)
	 {
		int k=n*i; 
	    System.out.println(n+"*"+i+"="+k);
     }		
	    
   }	
}

//prg-8

class Java1
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=25;j++)
			{
				if(i==1 & j==4 | i==2 & j==4 |i==2 & j==4 | i==3 & j==1 | i==3 & j==4 | i==4 & j==2 | i==4 & j==3)
				{
					System.out.print("J");
				}
				else if(i==1 & j==8 | i==2 & j==7 | i==2 & j==9 | i==3 & j==6 |  i==3 & j==7 |  i==3 & j==8 |  i==3 & j==9 | i==3 & j==10 | i==4 & j==5 |  i==4  &  j==11 )
				{
					System.out.print("a");
				}
				else if(i==1 & j==12 | i==1 & j==18 | i==2 & j==13 | i==2 & j==17 |  i==3 & j==14 |  i==3 & j==16 | i==4 & j==15 )
				{
					System.out.print("V");
				}
				else if(i==1 & j==22 | i==2 & j==21 | i==2 & j==23 | i==3 & j==20 |  i==3 & j==21 |  i==3 & j==22 |  i==3 & j==23 | i==3 & j==24 | i==4 & j==19 |  i==4  &  j==25 )
				{
					System.out.print("a");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


//Prg-9
class Expression1
{
   public static void main(String args[]) 
   {
      double res=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
	  
	  System.out.println(res);
   }
}

//Prg-10

class Formula1
{
   public static void main(String args[]) 
   {
      double res=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
	  
	  System.out.println(res);
   }
} 

//Prg-11

import java.util.*;
import java.lang.Math.*;
class Circle1
{
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Input a radius");
	 double r=sc.nextDouble();
	 double A=(Math.PI)*(r*r);
	 double P=2*(Math.PI)*r;
     System.out.println("Area of circle= "+A);
     System.out.println("Perimeter of circle= "+P);
   }	
}   

//Prg-12

import java.util.*;
class Avg1
{
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Input first number");
	 float a=sc.nextFloat();
	 System.out.println("Input second number");
	 float b=sc.nextFloat();
	 System.out.println("Input third number");
	 float c=sc.nextFloat();
	 
	 float avg=(a+b+c)/3;
     
	 System.out.println("Average= "+avg);
   }	
} 

//Prg-13

import java.util.*;
class rectangle1
{
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the width");
	 float b=sc.nextFloat();
	 System.out.println("enter the length");
	 float l=sc.nextFloat();
	 
	 float area=l*b;
	 float peri=2*(l+b);
     System.out.println("Area is "+b+" * "+l+" = "+area);
	 System.out.println("Perimeter is 2 *"+"("+b+"+"+l+")= "+peri);
   }	 
}   

//Prg-14

class Flag1
{
    public static void main(String args[])
	{
	    for(int i=1; i<=15; i++)
		{
		   for(int j=1; j<=46; j++)
		   { 
		      if((j==1|j==2|j==3|j==4|j==5|j==6|j==7|j==8|j==9|j==10|j==11)&(i==1|i==2|i==3|i==4|i==5|i==6|i==7|i==8|i==9))
              { 			  
		        if((i+j)%2==0)	
				   System.out.print("*");
                else 
				   System.out.print(" ");
			  }
              else
                System.out.print("=");  			  
		   }
        System.out.println();
   		}
	}	
}

//Prg-15

 import java.util.*;
 
 class Swap1
 {
    public static void main(String args[])
	{
	   Scanner sc= new Scanner(System.in);
       System.out.println("Enter the 1st number");
       int a= sc.nextInt();
  	   System.out.println("Enter the 2nd number");
       int b= sc.nextInt();
	   
	   System.out.println("Before swapping a="+a+" and b="+b);
	   int temp;
	   temp=a;
	   a=b;
	   b=temp;
	   
	   System.out.println("After swapping a="+a+" and b="+b);
	   
	} 
}

//Prg-16
 
class Face1
{
    public static void main(String args[])
    {  int a=34;
           System.out.println("  +"+(char)(a)+(char)(a)+(char)+(a)+(char)(a)+(char)(a)+"+" );
           System.out.println(" [| O O |] ");	   
	   System.out.println("  |  ^  |  ");
	   System.out.println("  | '-' |  ");
	   System.out.println("  +-----+  ");
	}
}			            

   	
