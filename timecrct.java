import java.util.*;
import java.lang.*;
import java.io.*;
public class timecrct
{
 public static void main(String[] args)
 {
  int i, min=0,min1=0,min2=0,a=0;
  String time1[]=new String[3];
  String time2[]=new String[3];
  System.out.println("  *MINUTES BETWEEN TWO TIMES*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter the start time (hh:mm:am/pm)");
  String input1=s.nextLine();
  System.out.println("\nEnter the end time (hh:mm:am/pm)");
  String input2=s.nextLine();
  StringTokenizer st1 = new StringTokenizer(input1,":");
  StringTokenizer st2 = new StringTokenizer(input2,":");
  while (st1.hasMoreTokens())
  {
   for(i=0;i<3;i++)
          time1[i]=st1.nextToken();
        }
  while (st2.hasMoreTokens())
  {
   for(i=0;i<3;i++)
    time2[i]=st2.nextToken();
  }
  time1[2]=time1[2].toLowerCase();
  time2[2]=time2[2].toLowerCase();
  if(!(time1[2].equals("am")||time1[2].equals("pm")||
     time2[2].equals("am")||time2[2].equals("pm")))
  {
   System.out.println("\nPlease specify the am and pm correctly");
   System.exit(0);
  }
  int tim1=Integer.parseInt(time1[0]);
  int tim2=Integer.parseInt(time2[0]);
  int tim1a=Integer.parseInt(time1[1]);
  int tim2a=Integer.parseInt(time2[1]);
  if(!(tim1>0&&tim1<=12&&tim1a>=0&&tim1a<60&&
       tim2>0&&tim2<=12&&tim2a>=0&&tim2a<60))
  {
   System.out.println("\nPlease enter the time in normal format (not as railway format)");
   System.exit(0);
  }
  if(time1[2].equals(time2[2]))
  {
   min1=(tim1*60)+tim1a;
   min2=(tim2*60)+tim2a;
   min=min1-min2;
   min=Math.abs(min);
  }
  else
  {
   if(tim1a>0)
   {
    tim1a=60-tim1a;
    tim1=tim1+1;
   }
   if(tim1==tim2)
   {
    min=tim1a+tim2a+720;
    min=Math.abs(min);
   }
   else
   {
    int tt=tim1-tim2;
    if(tt<0)
    {
     tt=Math.abs(tt);
     a=12+tt;
    }
    else
    {
     tt=Math.abs(tt);
     a=12-tt;
    }
    min=tim1a+tim2a+(a*60);
    min=Math.abs(min);
    if(time1[2].equals("pm")&&min<360)
     min=min+720;
   }
  }
  System.out.println("\nThe minutes between "+input1+" and "+input2+" is "+min);
 }
}
