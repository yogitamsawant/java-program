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
	public void multi()
	{
		System.out.println("Multiplication")
	         int a=10;
		int b=10;
		int d=a*b;
		System.out.println("Multiplication is:"+d);
	}
	public void div()
	{
		System.out.println("Division");
		int p=10;
		int q =5;
		int r=p/q;
		System.out.println("divison is"+r);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Process");
		 Calculator_java cj= new Calculator_java();
		 cj.add();
		 cj.sub();
		 cj.multi();
		 cj.div();
	}

}
