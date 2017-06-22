import java.io.*;
import java.util.*;
public class swap
{
 public static void main(String[] args)
 {
   int n,i;
   char temp;
   String str;
   System.out.println("Enter the string:");
   Scanner in=new Scanner(System.in);
   str=in.nextLine();
   n=str.length();
   char[] ar=new char[n];
   for( i=0;i<n;i++)
   {
     ar[i] =str.charAt(i);
   }
   for(i=0;i<n;i=i+2)
   {
     temp=ar[i];
     ar[i]=ar[i+1];
     ar[i+1]=temp;
   }
   System.out.println("Swapped string");
   for(i=0;i<n;i++)
   {
     System.out.println(ar[i]);
   }
  }
}
