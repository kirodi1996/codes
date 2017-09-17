class ExceptionHandle{
	public static void main(String [] args){
		try{
			int i=20/0;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString());
		}	
	}
	
}