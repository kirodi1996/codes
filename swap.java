import java.io.*;
class car{
	int name;
	car(int name){
		this.name=name;
	}
}
class swapWrapper{
	car c;
	swapWrapper(car c){
		this.c=c;	
	}
}
class swap{
	  void swaps(swapWrapper c1,swapWrapper c2){
		car temp;
		temp=c1.c;
		c1.c=c2.c;
		c2.c=temp;

	}
	public static void main(String [] args){
		car c1=new car(5);
		car c2=new car(6);
		swapWrapper cw1=new swapWrapper (c1);
		swapWrapper cw2=new swapWrapper (c2);
		swap s=new swap();

		s.swaps(cw1,cw2);
		System.out.println("c1="+cw1.c.name);
		System.out.println("c2="+cw2.c.name);
	}
}