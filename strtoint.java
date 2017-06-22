import java.io.*;
import java.util.*;
public class strtoint
{
 public static void main(String[] args)
 {
   String str;
   Scanner in=new Scanner(System.in);
   System.out.println("Enter the string:");
   str=in.nextLine();
   int n=Integer.parseInt(str);
   System.out.println("The result is"+n);
 }
}
