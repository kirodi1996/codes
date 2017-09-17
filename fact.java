import java.io.*;
class method
{
	long fact=1;
	void factorial(int num)
	{
		while(num>=1)
		{
			fact*=num;
			num--;
			
			
		}
		System.out.println("factorial="+fact);
	}
}
class fact
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a no");
		int num=Integer.parseInt(br.readLine());
		method cal=new method();
		cal.factorial(num);
		
	}
}