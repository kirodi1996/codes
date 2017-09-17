import java.io.*;
interface imp{
	void connect();
	void disconnect();
}
class oracle implements imp{
	public void connect()
	{
		System.out.println("connect to oracle");
	}
	public void disconnect()
	{
		System.out.println("disconnect to oracle");

	}
}
class sybase implements imp{
	public void connect()
	{
		System.out.println("connect to sybase");
	}
	public void disconnect()
	{
		System.out.println("disconnect to sybase");
	}

}
class implement{
	public static void main(String args[])throws Exception
	{
		Class c=Class.forName(args[0]) ;
		imp im=(imp)c.newInstance();
		im.connect();
		im.disconnect();
			}
}