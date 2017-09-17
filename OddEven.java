import java.util.*;
class OddEven{
	public static void main(String [] args)throws Exception{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(true){
			t--;
			int y;
			//Scanner br=new Scanner(System.in);
			int x=sc.nextInt();
			if(x==1){
				System.out.print("0"+" "+"1"+"\n");
			}
			else if(x%2==0){
				int m=x/2;
				System.out.print((m*(m+1))+" "+(long)Math.pow(m,2)+"\n");
				
			}
			else{
				int m=x/2;
				int n=(x/2)+1;
				System.out.print((m*(m+1))+" "+(long)Math.pow(n,2)+"\n");
				
			}
			if(t==0){
				break;
			}
		}
	}
}