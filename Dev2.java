import java.util.*;
class Dev2
{
     public static void main(String[]args)
     {
       Scanner sc =new Scanner(System.in);
	   
	   System.out.println("Enter the person Age:");
	   int age =sc.nextInt();
	   
	   if (age <10)
	   {
	       System.out.println("You are child");
	   }
	   else if (age<20)
	   {
	      System.out.println("You are too young");
	   }
	   else if (age<30)
	   {
	      System.out.println("You are young");
	   }
	   else if (age<40)
	   {
	      System.out.println("You are older");
	   }
	   else if (age<50)
	   {
	      System.out.println("You are too older");
	   }
	   else if (age<60)
	   {
	      System.out.println("You are oldest");
	   }
	   else 
	   {
	      System.out.println("you are died");
	   }
	   
	}
}	