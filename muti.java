class div{
	int i;
	double divide;
	div(int ik,double divided){
		i=ik;
		divide=divided;
	}

}
class muti{
	static div getmuti (int i,int j){
		return new div(i*j,(double)(i/j));
	}
	public static void main(String args[]){
		div v= getmuti(100,200);
		//	div v=new div();
		/*muti.fun(100,200);*/
		System.out.println(v.i+" "+v.divide);

	}
}