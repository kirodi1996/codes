import java.io.*;
class Matrix
{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the no. of rows and column");
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int a[][]=new int[m][n];
		System.out.println("enter the elements of array");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			{
				a[i][j]=Integer.parseInt(br.readLine());
			}
		for(int i=0;i<m;i++)
			{for(int j=0;j<n;j++)
				{System.out.print(a[i][j]+"\t");}
			System.out.println();}
			System.out.println("Transpose of a matrix");
		for(int i=0;i<n;i++)
			{for(int j=0;j<m;j++)
				{System.out.print(a[j][i]+"\t");}
			System.out.println();}
	}
}