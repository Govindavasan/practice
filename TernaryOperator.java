import java.util.Scanner;
class TernaryOperator
{
     public static void main(String[]args)
	 { 
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR AGE :");
		int age =sc.nextInt();
		
		boolean res = (age>=18)? true:false;    //conditional or TernaryOperator (variable = exp1?exp1:exp2)
		System.out.println(res);
		
	  }
}	  