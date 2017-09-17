import java.io.*;
class refer{
	int i;
	refer(int i){
		this.i=i;
	}
	/*
		public static void swap(refer a1,refer a2){

	}*/
	public static void main(String []args){
		refer a1=new refer(5);
		refer a2=new refer(6);
		refer a3;
		a3=a1;
		
			System.out.print(a3.i);
		
	}
}