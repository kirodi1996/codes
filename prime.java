import java.io.*;
class primes
{
	static boolean prim(long num)
	{
		boolean isprime=true;
		for(int i=2;i<=num-1;i++)
			if(num%i==0) isprime=false;
		return isprime;
	}
	static void generate(long max)
	{
		long c=1,num=2;
		while(c<=max)
		{
			if(prim(num))
			{
				System.out.println(num);
				++c;
			}
			++num;
		}
	}

}
class prime
{
	public static void main(Sstring args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many primes");
		int max=Integer.parseInt(br.readLine());
		primes.generate(max); 
	}
}