package pac1;

import java.util.Arrays;
import java.util.List;

public class Aslistmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		//Arrays.asList();   //it always return list, can be of any type
		//always use wrapper class everywhere
		
		String[] arr=new String[] {"a", "aa", "gg"};
		
		List<String> li=Arrays.asList(arr);		
		System.out.println(li);
		
		for(String s:li)
		{
			System.out.println(s);
		}
		
	
		System.out.println("-----------");
		Integer[] arr1=new Integer[] {8, 9, 22, 66};
		List<Integer> ll=Arrays.asList(arr1);
		
		System.out.println(ll);
		
		for(Integer ii:ll)
		{
			System.out.println(ii);
		}
		
		
		
	
		Character[] cc=new Character[] {'v', 'h', 'g'};
		List<Character> los=Arrays.asList(cc);
		for(Character cii:los)
		{
			System.out.println(cii);
		}
		
		
		
	Boolean[] b=new Boolean[] {true, false, true, false, true};
	List<Boolean> lo2s=Arrays.asList(b);
	for(Boolean vv:lo2s)
	{
		System.out.println(vv);
	}
	
		
	
		

		
		
		

	}

}
