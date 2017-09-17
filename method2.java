import java.io.*;
class test
{
	static int x=10;
	static void display()
	{
		System.out.println("x="+x);
	}
}
class method2
{
	public static void main(String args[])
	{
		test ob1,ob2;
		ob1=new test();
		ob2=new test();
		++ob1.x;
		test.display();
		
		test.display();

	}
}