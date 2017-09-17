import java.io.*;
class stringbuffer
{
	public static void main(String args[])throws IOException
	{
		StringBuffer sb=new StringBuffer();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter surname");
		String sur=br.readLine();
		System.out.println("enter middle name");
		String mid=br.readLine();
		System.out.println("enter the last name");
		String lst=br.readLine();
		sb.append(sur);
		sb.append(" "+lst);
		System.out.println("name="+sb);
		int n=sur.length();
		sb.insert(n,mid);
		System.out.println("full name="+sb);

	}
}