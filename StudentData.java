class StudentData{
	String name;
	static String colgname;
	int rollno;
	//static void college;
	static void setcollege(String col){
		colgname=col;
	}
	void setName(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	void display(){
		System.out.println("Name="+name+"Roll No="+rollno+"college="+colgname);
	}
	public static void main(String [] args){
		StudentData sd1 = new StudentData();
		StudentData sd2 = new StudentData();
		sd1.setcollege("IIIT Una");
		sd2.setcollege("NIT Hamirpur");
		
		sd1.setName("kirodi",14110);
		sd2.setName("rishabh",14205);
		sd1.display();
		sd2.display();
	}
}