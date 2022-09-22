class J
{
	static int value=100; // static variable or class level variable  
	static String stringValue="Raja";
	static boolean booleanValue=true;
	static char charvalue;
	static double doublevalue;
	static float floatvalue;
	public static void main(String[]args)
	{
		 int i=10;
			
				
		String stringValue ="anudip";//local 		
		System.out.println(value);
		System.out.println(stringValue);
		System.out.println(booleanValue);
		System.out.println(charvalue);
		System.out.println(doublevalue);
		System.out.println("float val"+floatvalue);		
		method1();
		method2();
		
		J obj = new J(); //creating object 
		
		System.out.println("Using class "+J.value);
		System.out.println("Using class "+J.stringValue);
	
	
	
	}
	
	public static void method1(){
		System.out.println(value);
		System.out.println(stringValue);
		System.out.println(booleanValue);
		System.out.println(doublevalue);
		
	}
	
	public static void method2(){
		System.out.println(value);
		System.out.println(stringValue);
		System.out.println(charvalue);
		System.out.println(doublevalue);
		
	}

}