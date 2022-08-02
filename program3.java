/* 
           Note:-
	            2 types of Unary Operations:
				          1. Increment (identifier++)
					          1. pre-increment(++identifier)
						  2. post-increment(identifier++)
						  
					  2.decrement (identifier)
						  1. pre-decrement(--identifier)
						  2. post-decrement(identifie--)
*/

class program3
{
     public static void main(String[]args)
	 { 
	   int value =10;
	   int value1=20;
	   System.out.println(value);    //10
	   System.out.println(++value);  //11
           System.out.println(++value);  //12
	   System.out.println(++value);	 //13	
           System.out.println(value);    //13
           System.out.println(--value);  //12
           System.out.println(--value);  //11
           System.out.println(value);	 //11  
           System.out.println(value++);  //11
           System.out.println(value++);  //12
           System.out.println(value++);  //13
	  }
}