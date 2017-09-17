import java.io.*;
class Employee
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter your id");
		int id=Integer.parseInt(br.readLine());
		System.out.print("enter your sex");
		char sex=(char)br.read();
		br.skip(2);
		System.out.print("enter your name");
		String name=br.readLine();
		System.out.println("your id:"+id);
		System.out.println("your sex:"+sex);
		System.out.println("your name:"+name);
	}
}