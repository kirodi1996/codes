import java.io.*;
class sw{
	static void swap(int i,int j){
		int temp;
		temp=i;
		i=j;
		j=temp;
	}
	public static void main(String args[])throws IOException{
		int i=5,j= 6;
		sw.swap(i,j);
		System.out.println(i);
	}
}