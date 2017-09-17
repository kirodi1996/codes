import java.io.*;
class array{
	public static void main(String args[]) throws Exception{
		int arr[]=new int[10];
		for (int i=0;i<arr.length ;i++ ) {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String k=br.readLine();
			int j=Integer.parseInt(k);
			arr[i]=j;
			//System.out.println(arr[i]);
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		 for (int k = 0; k < arr.length; k++)
        	 System.out.println("Element at index " + k + " : "+ arr[k]);          
    	
	}
	
}