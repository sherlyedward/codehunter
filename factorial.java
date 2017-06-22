import java.io.*;
import java.util.*;
class factorial
{
    public static void main(String[] args)
    {
        int n,fact=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=in.nextInt();
        for (int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorail of the number is:"+fact);
    }
}
