import java.util.*;
public class ArmApp
{    public static void main(String x [ ] )
       {  Scanner xyz = new Scanner(System.in);
           int no,temp, sum=0,rem,count=0;
       System.out.println("Enter number from keyboard");
         no=xyz.nextInt();
         temp=no;
         while(no!=0)
         {
                    no=no/10;
                   ++count;
         }
	   no=temp;
      while(no!=0) //153
     {
               rem = no % 10;   
               no = no/10;   
               int p=1; 
			   int j=1;
			   while(j<=count)  
			   { p = p*rem;   
				  j++;
			   }
			  sum=sum+p;
      } 
	  if(sum==temp)
	  { System.out.println("Number is armstrong");
	  }
	  else{
		  System.out.println("Number is not armstrong");
	  }

     }
}
