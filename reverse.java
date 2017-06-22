import java.lang.*;
import java.io.*;
import java.util.*;
class reverse
{
    public static void main(String[] args)
    {
        String input;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string:");
        input=in.nextLine();
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1 = input1.reverse();
        for (int i=0; i<input1.length(); i++)
            System.out.print(input1.charAt(i));
    }
}
