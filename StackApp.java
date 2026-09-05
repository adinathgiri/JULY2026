import java.util.*;
public class StackApp
{
    public static void main(String x[])
	{
	    Scanner xyz  = new Scanner(System.in);
		int arr[]=new int[5];
		int top=-1,choice=0;
		do{
		  System.out.println("1:PUSH");
		  System.out.println("2:POP");
		  System.out.println("3:Display");
		  System.out.println("4:Peek");
		  System.out.println("5:Exit");
		  System.out.println("Enter your choice");
		 choice=xyz.nextInt();
		  switch(choice)
		  {
		      case 1:
			   if(top==(arr.length-1))
			   { System.out.println("Stack is overflow");
			   }
			   else{
			     System.out.println("Enter value from keyboard");
				 int value=xyz.nextInt();
				 top=top+1;
				 arr[top]=value;
			   }
			  break;
			  case 2:
			  if(top==-1)
			  { System.out.println("Stack is underflow");
			  }
			  else{
			    int value=arr[top];
				top=top-1;
				System.out.println("deleted value is  "+value);
			  }
			  break;
			  case 3:
			  if(top==-1)
			  { System.out.println("Stack is underflow");
			  }
			  else{
			     for(int i=top; i>=0; i--)
				 { System.out.printf("%d\n",arr[i]);
				 }
			  }
			  break;
			  case 4:
			  if(top==-1)
			  { System.out.println("Stack is underflow");
			  }
			  else{
			    int value=arr[top];
			 	System.out.println("topmost  value is  "+value);
			  }
			  break;
			  default:
			  System.out.println("Wrong choice");
		  }
		}while(choice!=5);
	}
}