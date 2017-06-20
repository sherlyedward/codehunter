import java.util.*;
import java.lang.*;
import java.io.*;
class sample7
{
  public static void main (String[] args) throws java.lang.Exception
  {
    int num;
    System.out.println("Enter the number to be checked:");
    Scanner in=new Scanner(System.in);
    num=in.nextInt();
    if(num>0)
    {
      System.out.println("The given number is positive");
    }
    else if(num<0)
    {
      System.out.println("The given number is negative");
    }
    else
    {
     System.out.println("The given number is zero");
    }
  }
}                                           
