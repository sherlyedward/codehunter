import java.io.*;
import java.util.*;
public class subset1 
	{
	    static boolean isSubset(int arr1[], int arr2[], int m, int n)
	    {
	        int i = 0;
	        int j = 0; 
	        for (i=0; i<n; i++)
	        {
	            for (j = 0; j<m; j++)
	            {
	               if(arr2[i] == arr1[j])
	                  break;
	            }
	            
                return false;
	        }
	        return true;
	    }
	    public static void main(String args[])
	    {
	    	System.out.println("Enter the m value:");
	    	System.out.println("Enter the first array elements:");
	    	Scanner in=new Scanner(System.in);
	    	int m=in.nextInt();
	    	System.out.println("Enter the n value:");
	    	System.out.println("Enter the second array elements:");
	        int n=in.nextInt();	
	        int []arr1=new int[m];
	        int []arr2=new int[n];
	        for(int i=0;i<m;i++)
	        {
	          arr1[i]=in.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	          arr2[i]=in.nextInt();
	        }
	        if(isSubset(arr1, arr2, m, n))
	          System.out.print("arr2[] is subset of arr1[] ");
	        else
	          System.out.print("arr2[] is not a subset of arr1[]");  
	    }
	}

