package pac1;

import java.util.ArrayList;
import java.util.List;

public class Collectionconversion {

	public static void main(String[] args) {
		
		//list to array
		//array to list
		
		
		//need to chk 
		List<String> list=new ArrayList<String>();
		list.add("k");
		list.add("l");
		list.add("rr");
		
		
		String[] s=new String[list.size()];
				
			list.toArray(s);
  
			
			for(String y:s)
			{
				System.out.println(y);
				
			}

	}

}
