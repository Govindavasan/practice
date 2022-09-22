class L
{
	/*
	NON-STATIC Variable OR INSTANCE Variable

	*/
	
	/*
		create object
		
		--> Using new keyword we can create objects for particular class
		
		--   ClassName identifier = new ClassName();  syntax of creating objects
	
	*/
	static int value;
	int i;//Non static variable 
	
	
	public static void main(String[]args)
	{
		int i=10;
		
		L obj = new L();// new L object is creating 
	
		System.out.println(obj.i);
		
		obj.i=500;
		
		obj.method1();
		
		
		System.out.println(obj.i);
	}
	
	public void method1()
	{
		System.out.println("Non -static method" +i +", "+value);
	}
	
	


}