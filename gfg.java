import java.io.*;
abstract class Shape{
	String objectName= " " ;
	Shape(String name){
		this.objectName=name;
	}
	public void moveTo(int x,int y){
		System.out.println(this.objectName+" "+"has been move to"+" x= "+x+"and y= "+y);
	}
	abstract public double area();
	abstract public void draw();
}
class Rectangle extends Shape{
	int length,width;
	Rectangle(int length,int width,String name){
		super(name);
		this.length=length;
		this.width=width;
	}
	public void draw(){
		System.out.println("Rectangle has been drawn");
	}
	public  double area(){
		return (double)length*width;
	}

}
class Circle extends Shape{
	double pi=3.14;
	int radius;
	Circle(int radius,String name){
		super(name);
		this.radius =radius;
	}
	public void draw(){
		System.out.println("Circle has been drawn");
	}
	public double area(){
		return (double)(pi*radius*radius)/2;
	}
}
class gfg{
	public static void main(String args[]){
		Shape rect=new Rectangle(2,3,"Rectangle");
		System.out.println("Area of rectangle"+rect.area());
		rect.moveTo(1,2);
		Shape circle=new Circle(2,"Circle");
		System.out.println("Area of circle"+circle.area());
		circle.moveTo(2,4);
	}
}