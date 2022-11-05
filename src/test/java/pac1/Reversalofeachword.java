package pac1;

import java.util.HashMap;
import java.util.Map;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

public class Reversalofeachword {
		
	public static void main(String[] args) {
	/*
		String s1="weather is nice";		
		String s2="";		
		String[] arr=s1.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			String ss=arr[i];
			String ss1="";
			for(int j=ss.length()-1;j>=0;j--)
			{
				ss1=ss1+ss.charAt(j);
			}
		
			s2=s2+ss1+" ";
			
		}
		System.out.println(s2);
		
		*/
		
		
		System.out.println("---------");
		
		/*int n=5;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
	
		
		
		Map<String, String> hm=new HashMap<String, String>();
		hm.put("aa", "aaa");
		hm.put("bb", "bbb");
		hm.put("cc", "ccc");
		
		
		for(Map.Entry<String, String> mm:hm.entrySet())
		{
			System.out.println(mm.getKey() + ":" +mm.getValue());
		}
				
		
		
	}
		



}
