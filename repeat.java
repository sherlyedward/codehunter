import java.util.HashSet;
import java.util.Scanner;
public class repeat {
	    static void printFirstRepeating(int arr[])
	    {
	        int min = -1;
	        HashSet<Integer> set = new HashSet<>();
	        for (int i=arr.length-1; i>=0; i--)
	        {
	        	if (set.contains(arr[i]))
	                min = i;
	            else  
	                set.add(arr[i]);
	        }
	        if (min != -1)
	          System.out.println("The first repeating element is " + arr[min]);
	        else
	          System.out.println("There are no repeating elements");
	    }
	    public static void main (String[] args) throws java.lang.Exception
	    {
	    	System.out.println("Enter the no of elements in the array:");
	    	Scanner in=new Scanner(System.in);
	    	int n=in.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter the array elements:");
	        for(int i=0;i<n;i++)
	        {
	        arr[i]=in.nextInt();
	        }
	        printFirstRepeating(arr);
	        
	    }
	}
