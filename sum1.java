import java.util.*;
import java.lang.*;
import java.io.*;
class sum1
{
  public static void main (String[] args) throws java.lang.Exception
  {
    int n,result;
    System.out.println("Enter the value of n:");
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    result=n*(n+1)/2;
    System.out.println("The sum of the n values is"+result);
  }
}
