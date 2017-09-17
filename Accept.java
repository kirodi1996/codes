import java.io.*;
class Accept
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter a integer");
		boolean n=Boolean.parseBoolean(br.readLine());
		System.out.println("you entered:"+n);
	}
}