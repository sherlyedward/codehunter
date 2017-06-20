import java.util.*;
import java.lang.*;
import java.io.*;
class large
{
  public static void main (String[] args) throws java.lang.Exception
  {
    int num1,num2,num3;
    System.out.println("Enter the first number:");
    Scanner in=new Scanner(System.in);
    num1=in.nextInt();
    System.out.println("Enter the second number:");
    Scanner in1=new Scanner(System.in);
    num2=in1.nextInt();
    System.out.println("Enter the third number:");
    Scanner in2=new Scanner(System.in);
    num3=in2.nextInt();
    if(num1>num2&&num1>num3)
     {
      System.out.println("Number 1 is the largest");
     }
     else
     {
      if(num2>num3)
      {
       System.out.println("Number 2 is the largest");
      }
      else
      {
       System.out.println("Number 3 is the largest");
      }
     }
  }
}
