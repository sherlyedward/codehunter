import java.io.*;
import java.util.*;
public  class revdigits
{
  public static void main(String[] args)
  {
    int n,mod,reverse=0;
    System.out.println("Enter the number to be reversed:");
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    while( n != 0 )
      {
          reverse=reverse*10;
          reverse=reverse+n%10;
          n = n/10;
      }
     System.out.println("The reversed digits in the number is:"+reverse);
    }
}
