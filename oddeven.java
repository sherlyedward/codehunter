import java.util.*;
import java.lang.*;
import java.io.*;
class oddeven
{
  public static void main (String[] args) throws java.lang.Exception
  {
    int num;
    System.out.println("Enter the number to be checked:");
    Scanner in=new Scanner(System.in);
    num=in.nextInt();
    if(num%2==0)
    {
      System.out.println("The given number is even");
    }
    else
    {
     System.out.println("The given number is odd");
    }
  }
}
