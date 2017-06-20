import java.util.*;
import java.lang.*;
import java.io.*;
class sum
{
  public static void main (String[] args) throws java.lang.Exception
  {
    int n,i,result=0;
    System.out.println("Enter the value of n:");
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    for(i=1;i<=n;i++)
     {
      result=result+i;
     }
     System.out.println("The sum of the n values is"+result);
  }
}
