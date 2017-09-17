import java.io.*;
class loop1
{
	public static void main(String args[])throws Exception
	{
		int i;
		char k;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a no."+"\n"+"enter @ for exit");
		
		for(int j=0;;)
		{
		i=Integer.parseInt(br.readLine());
		if(i>0)
		{
			System.out.println("i is positive");
		}
		else if(i==0)
		{
			System.out.println("no is zero");

		}
		
		else if(i<=0)
		{
			System.out.println("no. is negative");
		}
		else 
		{
			k=(char)br.read();
			if(k=='@')
				{break;}
			else
			{
				System.out.println("invalid entry");
			}
			break;
		}
}
	} 
}