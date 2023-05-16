package Com.Git;

public class Calculator_java 
{
	public void add()
	{
		System.out.println("Addition");
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("Addition is :" +c);
	}
	public void sub()
	{
		System.out.println("Subtraction");
		int x=20;
		int y=10;
		int z= x-y;
		System.out.println("Subtraction is :" +z);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Process");
		 Calculator_java cj= new Calculator_java();
		 cj.add();
		 cj.sub();
	}

}
