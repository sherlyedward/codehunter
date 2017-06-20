import java.util.*;
import java.lang.*;
import java.io.*;
class count
{
  public static void main (String[] args) throws java.lang.Exception
  {
    int n;
    System.out.println("Enter the value of n:");
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    int result=Integer.toString(n).length();
    System.out.println("The count of digits is"+result);
  }
}
