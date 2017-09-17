class Pointer{
	public static void main(String [] args){
		try{

			String a=null;

			//a.chatAt(0);
			System.out.println(a.charAt(0));	
		}
		catch(NullPointerException e){
			System.out.println("Null pointer Exception");
		}
	}
}