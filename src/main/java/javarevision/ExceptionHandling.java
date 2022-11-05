package javarevision;

public class ExceptionHandling {

	public static void main(String[] args) {
				
		try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }

     

		catch(NumberFormatException ex)
        {
            //Compile time error
            //This block becomes unreachable as
            //exception is already caught by above catch blockx`x`
        }
		
		
   catch(ArithmeticException e)
		{
	e.printStackTrace();
		}
		
		
 catch(ArrayIndexOutOfBoundsException e)
		{
	 e.printStackTrace();
		}


        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }
		
}
}