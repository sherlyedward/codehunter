import java.util.*;
import java.lang.*;
import java.io.*;
class alpha
{
  public static void main (String[] args) throws java.lang.Exception
  {
    char ch;
    System.out.println("Enter the character to be checked:");
    Scanner in=new Scanner(System.in);
    ch=in.next().charAt(0);
    if(ch>=65&&ch<=97||ch>=90&&ch<=122)
    {
      System.out.println("The given character is a alphabet");
    }
    else
    {
     System.out.println("The given character is not a alphabet");
    }
  }
}
