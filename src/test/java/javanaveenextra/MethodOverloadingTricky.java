package javanaveenextra;

public class MethodOverloadingTricky {
	
	//int, long, Interger, int... always this seq ll be maintained 
	//if u want long/Integer only then explicitly u need to mention it typecast it 
	
	public void dis(int a)
	{
		System.out.println("h1");
		
	}
	
	public void dis(Integer a)
	{
		System.out.println("h2");
		
	}
	
	public void dis(int... a)  //internally it ll take as int[] 
	{
		System.out.println("h3");
		
	}
	
	public void dis(long a)
	{
		System.out.println("h4");
		
	}
		

	public static void main(String[] args) {
		
		 MethodOverloadingTricky m1=new  MethodOverloadingTricky();
		//m1.dis(10); 
		
		 
		m1.dis((Integer)(10));  //h2
		 
		 
		
		
		
		

	}
	

}
