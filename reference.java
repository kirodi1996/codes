import java.io.*;
class one
{
	int x;
	two t;
	one(two t)
	{
		this.t=t;
		x=10;
	}
	void display()
	{
		System.out.println("one's="+x);
		t.display();
		System.out.println("two's="+t.y);
	}
}
class two
{
	int y;
	two(int y)
	{
		this.y=y;
	}
	void display()
	{
		System.out.println("two's="+y);
	}
}
class reference
{
	public static void main(String[] args) {
		two obj2=new two(22);
		one obj1=new one(obj2);
		obj1.display();
	}
}