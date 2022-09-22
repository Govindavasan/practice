import java.util.Random;
class core10
{
     
	 
	 public static void main(String[]args)
	 { 
	  int randomNum;
	  int userGuessNum;
	  
	  Scanner sc = new Scanner(System.in);
	  Random gen = new Random();
	  
	  randomNum=gen.nextInt(101);
	  
	  System.out.println("Enter your Guess Between 0 to 100:");
	  userGuessNum= sc.nextInt();
	  
	  if(userGuessNum==randomNum)
	  {
	     System.out.println("You Guessed Corrrectly! Great Work! ");
	  }
	  else
	  { 
	     System.out.println("You Guessed InCorrrectly! Try Again! ");
	  }
	  if(userGuessNum < randomNum)
	  {
	     System.out.println("Guess the number which is  Higher ! ");
	  }
      else
	  { 
	     System.out.println("Guess the number which is Lower ! ");
	  }
}
}