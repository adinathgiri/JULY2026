import java.util.*;
public class PalimApp
{
    public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
       int temp,rev=0;	  
 	  System.out.println("Enter number from keyboard");
	   int no=xyz.nextInt();
	   temp=no;
	   while(no!=0)
	   { 
	     int rem = no % 10;
		 no  = no /10;
		 rev=rev*10+rem;
	   }
	   if(rev==temp)
	   {  System.out.println("Number is palindrome");
	   }
	   else
	   { System.out.println("Number is not palindrome");
	   }
	}
}