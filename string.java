import java.io.*;
class string
{
	public static void main(String args[]) 
	{
		String s1="hello";
		String s2=new String("java");
		char arr[]={'w','e','l','c','o','m','e'};
		String s3=new String(arr);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("length of s1="+s1.length());
		System.out.println("concatination of s2 and s3="+s2.concat(" "+s3));
		boolean x=s2.startsWith("j");
		if(x)System.out.println("s2 starts with h");
		else System.out.println("s2 not start with h");
		String p=s2.substring(0,3);
		String q=s3.substring(0,4);
		System.out.println(p+q);
		System.out.println("upper case="+s3.toUpperCase());
		System.out.println("lower case="+s3.toLowerCase());
	} 
}