package javarevision;

public class NewClass {

	
	
	 public static class A{
	        public static void print()
	        {
	            System.out.println("print in superclass.");
	        }
	    }
	 
	 
	  public static class B extends A {
	        public static void print()
	        {
	            System.out.println("print in subclass.");
	        }
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A a1=new B();
//		a1.print();
		
		
		A a1=new B();
		B b1=(B) a1;
		
b1.print();
		a1.print();

	}

}
