import java.util.*;
import java.io.*;
import java.lang.*;
class Student{
	String name,address;
	int rollNo;
	public Student(int rollNo,String name,String address){
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
	}
	public String toString(){
		return this.rollNo+ " " +this.name+" "+this.address;
	}
}
class Sortbyroll implements Comparator <Student>{
	public int compare(Student a,Student b ){
		return a.rollNo-b.rollNo;

	}
}
class Sortbyname implements Comparator <Student>{
	public int compare(Student a,Student b ){
		return a.name.compareTo(b.name);
		
	}
}
class Sorting{
	public static void main(String args[]){
		ArrayList <Student> ar=new ArrayList<Student>();
		ar.add(new Student(111,"bbb","london"));
		ar.add(new Student(131,"aaa","nyc"));
		ar.add(new Student(121,"cccc","jaipur"));
		System.out.println("unsorted");
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		Collections.sort(ar,new Sortbyroll());
		for (int i=0;i<ar.size() ;i++ ) {
			System.out.println(ar.get(i));
		}
	}
}