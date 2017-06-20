import java.util.*;
import java.lang.*;
import java.io.*;
class vowels
{
  public static void main (String[] args) throws java.lang.Exception
  {
    char ch;
    System.out.println("Enter the character to be checked:");
    Scanner in=new Scanner(System.in);
    ch=in.next().charAt(0);
    if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
    {
      System.out.println("The given character is a vowel");
    }
    else
    {
     System.out.println("The given character is a consonant");
    }
  }
}
