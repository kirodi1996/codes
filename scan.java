import java.util.Scanner;
class scan{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char gender=sc.next().charAt(0);
		int age=sc.nextInt();
		System.out.println("name="+name+" Gender="+gender+" age="+age);
	}
}