import java.io.*;
class Person
{
	private int age;
	private String name;
	 void setName(String name)
	{
		this.name=name;
	}
	 void setAge(int age)
	{
		this.age=age;
	}
 	String getName()
	{
		return name;
	}
	int getAge()
	{
		return ++age;
	}
}
class instance
{
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("rishabh");
		p1.setAge(20);
		System.out.println("name="+ p1.getName());
		System.out.println("age="+ p1.getAge());
	}
}