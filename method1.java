import java.io.*;
class sample
{
	private double num1,num2;
	sample(double x,double y)
	{
		num1=x;
		num2=y;
	}
	void sum()
	{
		double res=num1+num2;
		System.out.println("sum= "+res);
	}
}
class method1
{
	public static void main(String args[])
	{
		sample s=new sample(10,22.5);
		s.sum();
	}
}