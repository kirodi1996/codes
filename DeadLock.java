class BookTicket extends Thread{
	Object train,comp;
	BookTicket(Object train,Object comp){
		this.train=train;
		this.comp=comp;
	}
	public void run(){
		synchronized(train){
			System.out.println("BookTicket lock on train");
			try{
				Thread.sleep(150);
			}
			catch(InterruptedException e){}
			System.out.println("BookTicket now waiting for lock on Compartment");
			synchronized(comp){
				System.out.println("BookTicket lock on Compartment");
			}	
		}
		
	}
}
class CancelTicket extends Thread{
	Object train,comp;
	CancelTicket(Object train,Object comp){
		this.train=train;
		this.comp=comp;
	}
	public void run(){
		synchronized(comp){
			System.out.println("CancelTicket locked on Compartment");
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException e){}
			System.out.println("CancelTicket ticket waiting......");
			synchronized(train){
				System.out.println("CancelTicket lock on train");
			}
		}
	}
}
class DeadLock{
	public static void main(String args[])throws Exception{
		Object train=new Object();
		Object compartment=new Object();
		BookTicket ob1=new BookTicket(train,compartment);
		CancelTicket ob2=new CancelTicket(train,compartment);
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		t2.start();
	}
}