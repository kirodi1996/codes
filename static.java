import java.io.*;
class marks{
	int physics=20;
	int maths=30;
	int chemistry=40;
}
class getMarks{
	public static void main(String [] args){
		marks m1=new marks();
		System.out.println("Physics Marks="+m1.physics);

		marks m2=new marks();
		m2.physics=34;
		System.out.println("Physics Marks="+m2.physics);
		
		marks m3=new marks();
		System.out.println("Physics Marks="+m3.physics);
	

	}
}