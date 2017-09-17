import java.io.*;
interface interface1 {
	final int i=10;
	void fun();
}
class intr implements interface1{
	public void fun(){
		System.out.println("hi");
	}
	public void display(){
		System.out.println(i);
	}
	public static void main(String [] args){
		intr it=new intr();
		it.display();
	}
}