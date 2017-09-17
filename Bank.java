class MyException extends Exception{
	MyException(String str){
		super(str);
	}
}
class Bank {
	String name;
	int balance;
	Bank(String name,int balance){
		this.name=name;
		this.balance=balance;
	}
	
	public static void main(String args[]){
		Bank b1=new Bank("Rishabh",1000);
		Bank b2=new Bank("Raman",100);
		Bank b3 =new Bank("raka",50);
		try{
			if(b1.balance<1000){
				MyException me=new MyException("Balance is less than 1000")	;
				throw me;
			}	
			System.out.println(b1.name+" "+b1.balance);
		}
		catch(MyException e){
			e.printStackTrace();
		}
		
	}
}