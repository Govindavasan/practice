class program4

{
     public static void main(String[]args)
     { 
    int X=0;
	int Y=0;
	int Z=0;
	 
	 Z= ++X + X++ + --Y + ++Y + X-- + --Y + ++X + X++ + ++Y + Y++ + --Y + X-- +Y+X+Y-- + X++ + Y-- + X;
    
	    System.out.println(X);
        System.out.println(Y);
        System.out.println(Z);
	 }
}