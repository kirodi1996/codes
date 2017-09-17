import java.io.*;
import java.util.*;
class sum
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the two no.");
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str,",");
		String s1=st.nextToken();
		String s2=st.nextToken();
		s1=s1.trim();
		s2=s2.trim();
		double n1=Double.parseDouble(s1);
		double n2=Double.parseDouble(s2);
		System.out.print("sum="+(n1+n2));

	}
}
