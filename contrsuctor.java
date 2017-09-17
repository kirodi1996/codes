import java.io.*;
class test
{
	int i;
	test(int i)
	{
		this.i=i;
		System.out.println("i="+i);
	}
}
class contrsuctor
{
	public static void main(String[] args) {
		test a=new test(5);
	}
}