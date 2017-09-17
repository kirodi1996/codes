class state{
	
	static void m1(){
		static int g=5;
		System.out.println("inside static block "+g);
	}
	public static void main(String [] args){
		m1();
	}
}