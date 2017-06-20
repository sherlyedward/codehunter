import java.util.*;
import java.lang.*;
import java.io.*;
class leap
{
  public static void main (String[] args) throws java.lang.Exception
  {
    int year;
    System.out.println("Enter the year to be checked:");
    Scanner in=new Scanner(System.in);
    year=in.nextInt();
    if(year%4==0&&year%100!=0)
     {
      System.out.println("The given year is leap year");
     }
     else
     {
       System.out.println("The given year is not a leap year");
     }
  }
}
