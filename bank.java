import java.io.*;
class bankacct 
{
	private double bal;
	bankacct(double b)
	{
		bal=b;
	}
	void contact(double r) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter password");
		String passwrd=br.readLine();
		if(passwrd.equals("xyz123"))
		{
			Interest in=new Interest(r);
			in.calculateInterest();
		} 
		else
		{
			System.out.println("sorry");
			return;
		}
	}
	private class Interest
	{
		private double rate;
		Interest(double r)
		{
			rate=r;
		}
		void calculateInterest()
		{
			double interest=bal*rate/100;
			bal +=interest;
			System.out.println("update balance="+bal);
		}
	}
}
class bank
{
	public static void main(String[] args)  throws IOException
	{
		bankacct account=new bankacct(10000);
		account.contact(9.5);
	}
}