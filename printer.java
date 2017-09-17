import java.io.*;
interface Print{
	void printit(String text);
	void disconnect();
}
class IBMPrinter
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	void disconnect()
	{
		System.out.println("diconnected..............");
	}
}
class EsparonPrinter
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	void disconnect()
	{
		System.out.println("diconnected..............//");
	}
}
class printer
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr=new FileReader("config.txt");
		LineNumberReader inr=new LineNumberReader(fr);
		String printername=inr.readLine();
		System.out.println("Loading...."+printername);
		Class c=Class.forName(printername);
		Print ref=(Print)c.newInstance();
		ref.printit("hello");
		ref.disconnect(); 
	}
}