import java.io.*;
class loop3
{
	public static void main(String args[])throws IOException
	{
		int row=1;
		int total;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the total no of rows");
		total=Integer.parseInt(br.readLine());
		for (int j=row;j<=total;j++,row++)
		{
		for(int i=1;i<=row;i++)
		{
				System.out.print("*");
		}

		System.out.println();
	}
	for(int j=total-1;j>=1;j--,total--)
	{
		for(int i=total-1;i>=1;i--)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}
}