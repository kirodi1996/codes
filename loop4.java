import java.io.*;
class loop4
{
	public static void main(String args[])throws IOException
	{
		int row=1;
		int total;
		int space;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the total no of rows");
		total=Integer.parseInt(br.readLine());
		space=total-1;
		for (int k=1;k<=total;k++)
		{
		for (int i=1;i<=space;i++)
		{
		
				System.out.print(" ");
				

		}		
		for(int j=1;j<=(2*row-1);j++)
		{
			System.out.print("*");
		}
			space--;
			row++;
			System.out.println();
		}
		
	
}
}