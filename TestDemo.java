import java.util.*;
import java.io.*;
class TestDemo
{
	public static void main(String args[])throws IOException
	{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Id Name Gender");
			String str=br.readLine();
			StringTokenizer st=new StringTokenizer(str,",");
			String s1=st.nextToken();
			String s2=st.nextToken();
			String s3=st.nextToken();
			System.out.println(s1 +s2+s3);
	}
}