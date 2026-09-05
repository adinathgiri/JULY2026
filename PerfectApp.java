import java.util.*;
public class PerfectApp
{
     public static void main(String x[])
	 {
	   Scanner xyz = new Scanner(System.in);
	   System.out.println("Enter number from keyboard");
	   int no=xyz.nextInt();
	   int sum=0;
	   int i=1;
	   while(i<no)
	   {
	      if(no%i==0)
		  {
	        sum  = sum + i;
		  }
		  i++;
	   }
	   if(sum==no)
	   { System.out.println("Number is perfect");
	   }
	   else
	   { System.out.println("Number is not perfect");
	   }
	 }
}