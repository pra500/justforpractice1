package pac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

public class Stringprac {

	public static void main(String[] args) {
		/*
		
		String str="pragtiig";
		
		char[] arr=str.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		 
		for(Character c:arr)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
	
			}
			
			else
				hm.put(c, 1);
		}
			
		
		Set<Map.Entry<Character, Integer>> set1=hm.entrySet();
		
		for(Map.Entry<Character, Integer> mm:set1)
		{
			System.out.println(mm.getKey() + ":" +mm.getValue());
			
//			if(mm.getValue()>1)
//			{
//				
//				
//			}
//				
		}
		
		*/
		
		/*
		
	String str="madam";
	String str1="";
	
for(int i=str.length()-1;i>=0;i--)
{
	str1=str1+str.charAt(i);	
	
}
	if(str.equalsIgnoreCase(str1))
	{
		System.out.println("palin");
	}
	else
	{
		System.out.println("not palin");
	}
	
	
	*/
		
		/*
		String sth="silent";
		String sth1="lisent";
		
		
		if(sth.length()==sth1.length())
		{
		
		char[] arr=sth.toCharArray();
		
		Arrays.sort(arr);
		
		char[] arr1=sth1.toCharArray();
		Arrays.sort(arr1);
	
		
		if(Arrays.equals(arr,arr1))
		
		System.out.println("ana");
		
		else
			System.out.println("not ana");
		
		
		}
		
		*/
		
		/*
		String str="java is esry";
		
		String[] arr=str.split(" ");
		
		String a1="";
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String st=arr[i];
			String st1="";
			for(int j=st.length()-1;j>=0;j--)
			{
				
				st1=st1+st.charAt(j);
				
				
			}
			
			a1=a1+st1+" ";
			
		}
		
		
		System.out.println(a1);
		
		*/
	
		
		/*
		
		//how to convert list to set		
		List<String> ls=new ArrayList<String>();
		ls.add("q");
		ls.add("q1");
		
		Set<String> set1=new HashSet<String>(ls);
		for(String s:set1)
		{
			System.out.println(s);
		}
		*/
		
		/*		
		//how to convert arraylist to array		
		List<String> lis=new ArrayList<String>();
		lis.add("w");
		lis.add("w1");
		lis.add("w2");
				
		Object[] g=lis.toArray();
		for(Object o:g)
		{
			System.out.println(o);
		}
		*/
			
		/*
			
		String str="pragti us pragti";
		String[] arr=str.split(" ");
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		for(String s1:arr)
		{
			
			if(hm.containsKey(s1))
			{
				hm.put(s1, hm.get(s1)+1);
			}
			else
				
			 hm.put(s1, 1);
			
		}
		
		Set<Map.Entry<String, Integer>> s1=hm.entrySet();
		for(Map.Entry<String, Integer> ms:s1)
		{
			
			if(ms.getValue()>1)
			{
				System.out.println(ms.getKey()+ ":" +ms.getValue());
			}			
			
			
		}
		*/
		
		/*
		List<String> lis=new ArrayList<String>();
		lis.add("s");
		lis.add("s1");
		
		Set<String> s1=new HashSet<String>(lis);
		for(String ss:s1)
		{
			System.out.println(ss);
		}
		*/
			
		
	/*	
	List<String> lis=new ArrayList<String>();
	lis.add("d");
	lis.add("d3");
	
	Object[] r=lis.toArray();
	for(Object s:r)
	{
		System.out.println(s);
	}
	
		*/		
	
	
	
	//int[] arr= {3, 8, 1};
	
	/*	
	String sth="anbmr";
	char[] arr5=sth.toCharArray();
	char temp;
	
	for(int i=0;i<=arr5.length-1;i++)
	{
		for(int j=i+1;j<=arr5.length-1;j++)
		{
			if(arr5[i]>arr5[j])
			{
			 temp=arr5[i];
			 arr5[i]=arr5[j];
			 arr5[j]=temp;
			 
			}
			
		}
		
	}
	
	for(char c:arr5)
	    System.out.println(c);
				
				
	*/
	/*
	String th="prga is a";
		
	String[] arr=th.split(" ");
	System.out.println(arr.length);
	*/
	
		/*
		int[] a= {0,1, 1, 0, 1, 1, 1, 0};
		int temp;
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
				
			}
		}
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		
	*/
		
		/*
		String str="my name is pragti gupta";	
		
		char[] arr1=str.toCharArray();

		Map<Character, Integer> mp=new HashMap<Character, Integer>();

		for(Character c:arr1)
		{

		  if(mp.containsKey(c))
		{

		mp.put(c, mp.get(c)+1);
		}
		else
		{
		mp.put(c, 1);
		}
		}



		Set<Map.Entry<Character, Integer>> set1=mp.entrySet();

		for(Map.Entry<Character, Integer> m2:set1)
		{
		   if(m2.getValue()==1)
		{
			   System.out.println(m2.getKey() + ":" +m2.getValue());
		 

		}

		}
	*/
		
		
		/*e:1
n:1
r:1
s:1
u:1
y:1

		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	
	
		
		/*
		String str1="my name is pragti gupta";


		for(int i=0;i<=str1.length()-1;i++)
		{
		sout(str1.length()-(str1.replace("a","").length()));
		}
	*/
		/*
		String str3="java is a";
		
		System.out.println(str3.toUpperCase());  //JAVA IS A
		System.out.println(str3.toLowerCase());   //java is a
		
		*/
		
		//then do the previous pgm's 
		
		
		
		
		/*
		String str="my namye";	
		String str1=str.toUpperCase();	
		String str2="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
			
		}
		
		
		System.out.println(str2);
		*/
		
		
//		
//		String str="this s";
//		String str1=str.toUpperCase();			
//		System.out.println(str1.length()-str1.replace("S", "").length());   //2
//		
//		
//		
//		String stg="ppah";
//		String stg1=stg.toUpperCase();
//		System.out.println(stg1.length()-stg1.replace("P","").length());   //2
		
		/*
		
		String str="java is platform";
		String str1=str.toUpperCase();		
		String[] arr=str1.split(" ");
		String stx="";
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			
			String s1=arr[i];
			String s2="";
			for(int j=s1.length()-1;j>=0;j--)
			{
				s2=s2+s1.charAt(j);
				
			}
			
			stx=stx+s2+" ";
			
		}
		
		
		
		System.out.println(stx);  //AVAJ SI MROFTALP
		
		*/
		
		
		
		
		//specila char count, count the words , prime no, dup ele in an array
		//remove all special char
		
		/*
		String str="prga89##$$((loPL";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				
				System.out.println(str.charAt(i));
				
				
			}
		}
		*/
		
		
		/*
		String str="pragti is pragti is good";				
		String[] arr=str.split(" ");
		System.out.println(arr.length);  
		*/
		
	/*	
	int n=3, a1=1;
	
	for(int i=2;i<=n-1;i++)
	{		
	if(n%i==0)
	{
		a1=0;
	    break;
	}	
	
	}
		
	if(a1==1)
	{
		System.out.println("p");
	}
		
	else
		System.out.println("not p");
	
	*/
		
		/*
		String str="%^jkllLLL@$098";
		
	String str1=str.replaceAll("[^a-zA-Z0-9]", "");
	
	
		System.out.println(str1);
		
		*/
		
		/*
	//dupl ele in array				
		int[] arr= {8, 0, 7, 45, 0, 45};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
				
			{
				
				if(arr[i]==arr[j])
				{					
					
					System.out.println(arr[j]);
					
				}
							
								
			}
		}
		
	*/
		/*
	int y=123;
	String str=Integer.toString(y);	
	String str1="";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		
		str1=str1+str.charAt(i);
		
		
	}
		
		
	System.out.println(str1);
		
		*/
		
		
		
	/*
	String sth="java is easy";
	
	System.out.println(sth.replace(" ", ""));		//javaiseasy
	*/
	
	/*
	String sth1="javaplatform";
	
	for(int i=0;i<=sth1.length()-1;i++)
	{
		sth1=sth1.charAt(i)+" ";
		
	}
	
	System.out.println(sth1);
		
	*/
		
		
	/*	
		
    String str="madam";
    String str1="";
    
for(int i=str.length()-1;i>=0;i--)
 {
	 
	 str1=str1+str.charAt(i);
	 
 }
   
if(str.equalsIgnoreCase(str1))		
	System.out.println("palin");

else
	System.out.println("non palin");
		
*/
/*

String s1="pragti";
String s2="gupta";

s1=s1.concat(s2);

s2=s1.replace(s2, "");
s1=s1.replace(s2,  "");


System.out.println(s2);
System.out.println(s1);
	
*/
		
		/*
		
		Map<String, Integer> map=new HashMap<String, Integer>();		
		map.put("b", 1);
		map.put("ba", 2);
		map.put("bac", 3);
		
		for(Map.Entry<String, Integer> m3:map.entrySet())
		{
			System.out.println(m3.getKey() + ":" +m3.getValue());
			
		}

		
		String sth="sele is open";		
		String[] arr=sth.split(" ");
		
		StringBuilder sb=new StringBuilder(); 
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			sb.append(arr[i]);
			sb.append(" ");
			
					
		}
		
		System.out.println(sb.toString().trim());
		
		
		//swap, map , add in list, set, 2 string pgm's 
		
		String str="pragti";
		
		String str1="hello";
				
				
		str=str.concat(str1);
	    str1=str.replace(str1,  "");
	    str=str.replace(str1, "");
	    
	    System.out.println(str);
	    System.out.println(str1);
	    */
	    	    
	    
	    /*
	    String sth="  jjppp jks pragti ";
		
		System.out.println(sth.trim());
		
		
		/*
		String str="silent";
		String str1="lisent";
		
		if(str.length()==str1.length())
		{
		
		char[] arr=str.toCharArray();
		
		Arrays.sort(arr);
		
		char[] arr1=str1.toCharArray();
		
		Arrays.sort(arr1);
		
		
		
	if(Arrays.equals(arr,  arr1))
	{
		System.out.println("ana");
	}
		
	else
	{
		System.out.println("not ana");
	}
		
		
		}
		
		
		*/
		
		/*
		String str="java";
		char[] arr=str.toCharArray();
		Map<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(Character c:arr)
		{
			if(hm.containsKey(c))
			{
			   hm.put(c, hm.get(c) +1);
				
			}
			else
				hm.put(c, 1);
			
		}
	
	Set<Map.Entry<Character, Integer>> set1 =hm.entrySet();
	
  for(Map.Entry<Character, Integer> mm:set1)
  {
	  if(mm.getValue()==1)
	  {
		  System.out.println(mm.getKey() + ":" + mm.getValue());
	  }
  }
	*/
	
  //swap,fibbo, adding in list , hasmmap 
 /*
  String str = "pragti";
  String str1="sharma";
  
  
  str=str.concat(str1);
  
  str1=str.replace(str1, "");
  str=str.replace(str1, "");
  
  System.out.println(str1);
  System.out.println(str);
  */
  
  /*
     int n=0,n1=1,total=20, n3, a1; 
     System.out.println(n);
     System.out.println(n1);
     
     for(int i=2; i<=total-2; i++)
     {
    	 
    n3=n+n1;
    System.out.println(n3);
    
    n=n1;
    n1=n3;
    	 
     }
  
  
     List<String> list=new ArrayList<String>();
     list.add("s");
     list.add("t");
     list.add("u");
     list.add("u");
     
     
     for(String st:list)
     {
    	 System.out.println(st);
     }
    	 
     
    // int[[]]
  
//  Set<String> set1=new HashSet<String>();
//  set1.add("s1");
//  set1.add("s2");
//  set1.add("s1");

		*/
     /*
     Map<String, Integer> map=new TreeMap<String, Integer>();
     map.put("jan", 1);
     map.put("feb", 2);
     map.put("march", 3);
     
     for(Map.Entry<String, Integer> mm:map.entrySet())
    		 {    	 
    	 
    	 System.out.println(mm.getKey()+ ":" +mm.getValue());
    	     	 
    		 }
     
     
    //need to chk again 
    Set<String> set1=new HashSet<String>();
    set1.add("a");
    set1.add("a1");
    set1.add("a1");
    for(String ss:set1)
    {
    	System.out.println(ss);
    }
     
     */
		
		
     //sorting, swap, java is , hashmap
	/*	
    int[] arr= {12, 9,4};
    int temp;
   
  for(int i=0;i<=arr.length-1;i++)
  {
	  
	  for(int j=i+1;j<=arr.length-1;j++)
	  {
		  
		  if(arr[i]>arr[j])
		  {
			  
			  temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
		  }
	  }
  }
    
    
    for(int i:arr)
    {
    	System.out.println(i);
    }
    
    */
		/*
		
		String str="hello";
		String str1="world";
		
		str=str.concat(str1);
		
		
		str1=str.replace(str1,  "");
		str=str.replace(str1,  "");
		
	System.out.println(str1);
	System.out.println(str);
	
	*/
		
		/*
		String str="java is";		
		
		String[] arr=str.split(" ");
		
		String str5="";
		for(int i=0;i<=arr.length-1;i++)
		{
			
			String s1=arr[i];				
			String s2="";
			
						
			for(int j=s1.length()-1;j>=0;j--)
			{
				s2=s2+s1.charAt(j);
			}
					
					
				str5=str5+s2+" ";	
					
		}
		
	System.out.println(str5);
		*/
		/*
	int[] aff= {7, 0, 4, 7};
	int sum=0;
	
	for(int i=0;i<=aff.length-1;i++)
	{
		sum=sum+aff[i];		
		
	}
   System.out.println(sum);
    
	*/		
		
   		
/*
		
		Map<Integer, Character> map=new HashMap<Integer, Character>();
		map.put(6, 'k');
        map.put(5, 'i');
        map.put(7, 'r');
        
        
      for(Map.Entry<Integer, Character> mp:map.entrySet())
      {
    	  System.out.println(mp.getKey() + ":" + mp.getValue());
    	  
    	  
      }
 */
		
		
		//Write a Java program to check the equality of two arrays?
	
     
      
      
		
		//counting words, set to list , list to set 
		
		/*
		String str="java java is easy";
		
		String[] arr=str.split(" ");
		
	   Map<String, Integer> map=new HashMap<String, Integer>();
	   
	  for(String s:arr)
	  {
		  
		  if(map.containsKey(s))
		  {
			  map.put(s, map.get(s)+1); 			  
		  }
		  else
		  {
			  map.put(s, 1);
		  }
			  
	  }
		
		
	  Set<Map.Entry<String, Integer>> set1=map.entrySet();
	  for(Map.Entry<String, Integer> m1:set1)
	  {
		  if(m1.getValue()>1)
		  {
			  System.out.println(m1.getKey() + ":" + m1.getValue());
		  }
		  
	  }
	  
	  */
		
		/*
		
	  List<String> list=new ArrayList<String>();
	  list.add("a");
	  list.add("b");
	  System.out.println(list);    //[a, b]
	  
	  Set<String> set1=new HashSet<String>(list);
	  System.out.println(set1);    //[a, b]

//	  for(String st1:set1)    
//	  {
//		  System.out.println(st1);
//	  }
		
	  
		
		for(String str1:set1)
		{
			System.out.println(str1);
		}
	  
	  */
		/*
		
		Set<String> set1=new HashSet<String>();
		set1.add("e");
		set1.add("k");
		set1.add("d");
		
		  List<String> list=new ArrayList<String>(set1);		

				for(String str1:list)
				{
					System.out.println(str1);
				}
				
		*/
				
		//prime no, array to list, list to array, string reversal, string swap
				
		/*	
		String str="prag";
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		
		System.out.println(str1);
		*/
		
		/*
		String s1="saurabh";
		String s2="gupta";
		
		s1=s1.concat(s2);
		s2=s1.replace(s2, "");
		s1=s1.replace(s2, "");
		
	System.out.println(s1);
	System.out.println(s2);
	*/
	
	/*
	int t=17, a=1;
	for(int i=2;i<=t-1;i++)
	{
		if(t%i==0)
		{ 
			a=0;
			break;
		}	
		
	}
		
	if(a==1)
	System.out.println("p");
	else
		System.out.println("not p");
	
	
*/		
	
	
	
		
		//array to list, list to array, java is easy, java 2
		/*
		String str="java is easy";
		
		String[] arr=str.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			sb.append(arr[i]);
			sb.append(" ");
			
		}		
		
		System.out.println(sb.toString().trim());
		*/
		
		/*
		//ll do later //get mtd
		List<String> list=new ArrayList<String>();
		list.add("r");
		list.add("l");
		list.add("a");
		System.out.println(list);
		
		//String[] arr=new String[list.size()];
		
		int t=list.size();
		
		for(int i=0;i<=t-1;i++)
		{
			list.get(i);
		}
		*/
		
		
		//array sorting, string palin, selenium
		
		/*
		//need to chk again
		int[] arr= {7,0, 3};
		int temp;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}									
				
			}
		}
		
		for(int i:arr)
		{
			System.out.println(arr[i]);
		}
		*/
		
		/*
		
		String s1="madam";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			
			s2=s2+s1.charAt(i);
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("pa");
		}
		else
			System.out.println("not pa");
		
		*/
		
		

		/*
	//dup words in string	
	String str="pragt pragt nice girl nice";
	String[] arr=str.split(" ");
	
	
	
	HashMap<String, Integer> hm=new HashMap<String, Integer>();
	
	for(String s:arr)
	{
		if(hm.containsKey(s))
		{
			hm.put(s, hm.get(s)+1);
		}
		else
		{
			hm.put(s, 1);
		}
		
	}
	
	
	
	Set<Map.Entry<String, Integer>> set1=hm.entrySet();
	for(Map.Entry<String, Integer> mapp:set1)
	{
	         if(mapp.getValue()>1)
	         {
	        	 System.out.println(mapp.getKey() + ":" +mapp.getValue());
	         }
	}
	
			
	
	String t1="gupta";
	String t2="sharma";
	
	
	t1=t1.concat(t2);
	
	t2=t1.replace(t2,  "");
	t1=t1.replace(t2,  "");
	
	System.out.println(t1);
	System.out.println(t2);
	
	
	
	*/
	
	/*
	int vi=123;
	
	String s=Integer.toString(vi);
	
	String s11="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		s11=s11+s.charAt(i);
	}

	System.out.println(s11);	
	*/
	
	
	
	
	//list addition, removal, get, bubble sort, prime no
	
	
	/*
	List<String> list=new ArrayList<String>();
	list.add("a");
	list.add("a1");
	list.add("a2");
	list.add("a3");
	
	for(String s:list)
	{
		System.out.println(s);
	}
	
	
	System.out.println(list.get(1));  //a1
	
	list.remove(2);
	System.out.println(list); //a, a1, a3
	
	*/
	
	
	/*
	
	int[] arr= {12, 0, 5, 8, 3};
	int tem;
	
	
	for(int i=0;i<=arr.length-1;i++)
	{
		
		for(int j=i+1;j<=arr.length-1;j++)
		{
			
			if(arr[i]>arr[j])
			{
				
				tem=arr[i];
				arr[i]=arr[j];
				arr[j]=tem;
				
				
			}
			
			
		}
	}
	
	for(int  i:arr)
	{
		System.out.println(i);
	}
	
	*/
	
	/*
	//prime no:	
		
	int n=7, a=1;
	
	for(int i=2;i<=n-1;i++)
	{
		if(n%i==0)
		{
			a=0;
			break;
			
		}
	}
	
	if(a==1)
         System.out.println("pr");
	else
		System.out.println("not pr");
	

	
	//anagram
	String s1= "silent";
	String s2= "lisent";
	
	if(s1.length()==s2.length())
	{
		
		char[] aa=s1.toCharArray();
	Arrays.sort(aa);
	
	
	char[] aa1=s2.toCharArray();
Arrays.sort(aa1);


if(Arrays.equals(aa, aa1))
{
	System.out.println("ana");
}

else
	System.out.println("not ana");	

		
	}
	
	
	
	

	
	//bubble sort, string reversal, duplicate char, find how many lowercase letter in a string, print only specila char
	
 int[] arr= {7, 0, 23, 1};
 int temp;
 for(int i=0;i<=arr.length-1;i++)
 {
	 	 
	 for(int j=i+1;j<=arr.length-1;j++)
	 {
		 if(arr[i]>arr[j])
		 {
			 
			 temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;		 
			 
			 
		 }	 
		 		 
	 } 
	 
 }
	
 for(int i=0;i<=arr.length-1;i++)
 {
	 System.out.println(arr[i]);
 }
	 
 
 
 /*	 
 String str="pragPRG0987";
 char[] arr1=str.toCharArray();
 
 
 for(int i=0;i<=arr1.length-1;i++)
 {
	 
	 if(arr1[i]==)
 }
*/
 
 /*
 
 String s5="gupta"; 
 String s6="";
 
 for(int i=s5.length()-1;i>=0;i--)
 {
	 s6=s6+s5.charAt(i);
	 
 }
	System.out.println(s6);	
	
	
	
	
String s7="praggtit";  

char[] a1=s7.toCharArray();

Map<Character, Integer> map=new HashMap<Character, Integer>();

for(Character c:a1)
{
	if(map.containsKey(c))
	{
		
		map.put(c, map.get(c) + 1);		
		
	}
	else
	{
		map.put(c, 1);
		
	}
		
}




Set<Map.Entry<Character, Integer>> set1=map.entrySet();
for(Map.Entry<Character, Integer> ms:set1)
{
	if(ms.getValue()>1)
	{
		System.out.println(ms.getKey() + ":" +ms.getValue());
	}
}


	System.out.println("---------------------");	
	
String stt="ppBG80";
 for(int i=0;i<=stt.length()-1;i++)
 {
	 if(stt.charAt(i)>=65 && stt.charAt(i)<=90)
	 {
		 System.out.println(stt.charAt(i));
	 }
 }

 /*
  * star pattern
  /**********
  *
  * *
  * **
  * ***
  * ****
  //88888888888888888888
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  */
 
		
int row=5;

for(int i=0;i<=row-1;i++)
{
	
	for(int j=0;j<=i;j++)
	{
		System.out.print("*");
	}
	
	System.out.println();
}

	

//star pattern, dupl char in a string, map/set insertion, map deletion, int long prac, "hello" 'hello', replace all special char 
/*
System.out.println("----------------");
System.out.println("----------------");
int r=5;
for(int i=0;i<=r-1;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print("*");
	}
	
	System.out.println();
}



System.out.println("***********************");
String sth="aaplth";
char[] arr=sth.toCharArray();
Map<Character, Integer> map=new HashMap<Character, Integer>();


for(Character c:arr)
{
	if(map.containsKey(c))
	{
		map.put(c, map.get(c)+1);
	}
	else
	{
		map.put(c, 1);
	}		
	
}


Set<Map.Entry<Character, Integer>> set1=map.entrySet();
for(Map.Entry<Character, Integer> mss:set1)
{
	if(mss.getValue()>1)
	{
	System.out.println(mss.getKey() + ":" +mss.getValue());
	
	}
}
*/


/*

Map<String, String> ma1=new HashMap<String, String>();
ma1.put("aa", "aaa");
ma1.put("bb", "bbb");
ma1.put("cc", "ccc");

for(Map.Entry<String, String> ma:ma1.entrySet())
{
	System.out.println(ma.getKey() + ":" +ma.getValue());
}


ma1.remove("aa");
System.out.println(ma1);


Set<String> settt=new HashSet<String>();
settt.add("x");
settt.add("x1");
settt.add("x2");

for(String h:settt)
{
	System.out.println(h);
}

settt.remove("x1");
System.out.println(settt);





//arrays sort, prime no, fibbo





int[] arr= {4, 8, 2};
int temp;

for(int i=0;i<=arr.length-1;i++)
{
	for(int j=i+1;j<=arr.length-1;j++)
	{
		if(arr[i]>arr[j])
		{
			
			
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
		}
	}
}

for(int i:arr)
{
	System.out.println(i);
}

*/


/*
int n=3, a=1;

for(int i=1;i<=n-1;i++)
{
	if(n%2==0)
	{
		a=0;
		break;
	}
}

if(a==1)

	System.out.println("pri");



else
	System.out.println("not pri");

*/



/*
String str1="java is easy";
String[] arr=str1.split(" ");

StringBuilder sb=new StringBuilder();

for(int i=arr.length-1;i>=0;i--)
{
	sb.append(arr[i]);
	sb.append(" ");
}

System.out.println(sb.toString().trim());
*/




/*
String str2="pragti is good";
String str3="";

char[] arr=str2.toCharArray();

for(int i=0;i<=arr.length-1;i++)
{
	char srr=arr[i];
	String srr1="";
	
	for(int j=srr.length()-1;j>=0;j--)
	{
		srr1=srr1+srr.charAt(i);
	}
	
	
	
	str3=str3+srr1+" ";
	
	
}
System.out.println(str3);

*/


//reversing, duplicate, palindrome, java is easy, occurance of a char

//
//String str="parta";
//String str1="";
//
//for(int i=str.length()-1;i>=0;i--)
//{
//	str1=str1+str.charAt(i);
//	
//}
//System.out.println(str1);

/*
String str="madam";
String str1="";

for(int i=str.length()-1;i>=0;i--)
{
	str1=str1+str.charAt(i);
}

if(str.equalsIgnoreCase(str1))
{
	System.out.println("palin");
}
else
{
	System.out.println("not palin");
}


String sth="pppagr";
System.out.println(sth.length()-sth.replace("p","").length());


/*
//duplicate
String s2="paagatthoyy";
char[] arr=s2.toCharArray();

Map<Character, Integer> mp=new HashMap<Character, Integer>();

for(Character c:arr)
{
	if(mp.containsKey(c))
	{
		mp.put(c, mp.get(c)+1);
	}
	
	else
	{
		mp.put(c, 1);
	}
	
}

Set<Map.Entry<Character, Integer>> set1=mp.entrySet();
for(Map.Entry<Character, Integer> mm:set1)
{
   if(mm.getValue()>1)
   {
	   System.out.println(mm.getKey()+ ":" +mm.getValue());
   }
}
*/


/*

String sh="java is easy";

String[] arr=sh.split(" ");
StringBuilder sb=new StringBuilder();

for(int i=arr.length-1;i>=0;i--)
{
	sb.append(arr[i]);
	sb.append(" ");
}

System.out.println(sb.toString().trim());


*/

//array sorting, naveen sir any video, pattern

/*
System.out.println("-------------");
int[] arr= {3,9, 5, 1};
int temp;

for(int i=0;i<=arr.length-1;i++)
{
	for(int j=i+1;j<=arr.length-1;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
		}
	}
}


for(int i:arr)
{
	System.out.println(i);
}


*/



//anagram, dupli words, occurance, how many disits 


/*
String st="silent";
String st1="lisent";

char[] arr=st.toCharArray();
char[] arr1=st1.toCharArray();

Arrays.sort(arr);
Arrays.sort(arr1);

if(arr.length==arr1.length)
	
System.out.println("ana yes");

else
	System.out.println("ana no");

*/


/*
String sth="java is java is a platform";
String[] arr=sth.split(" ");

Map<String, Integer> map=new HashMap<String, Integer>();
for(String s:arr)
{
	if(map.containsKey(s))
	{
		map.put(s, map.get(s)+1);		
	}
	else
		map.put(s, 1);
		
}

Set<Map.Entry<String, Integer>> set1=map.entrySet();
for(Map.Entry<String, Integer> mm:set1)
{
	if(mm.getValue()>1)
	{
		System.out.println(mm.getKey() + ":" +mm.getValue());
	}
}

*/

//String s3="ppghkk";
//s3.len




//prime, fibbo, even/odd, print only disits


/*
int n=3, a=1;

for(int i=2;i<=n-1;i++)
{
	if(n%i==0)
	{
		a=0;
		break;
	}
}

if(a==1)
System.out.println("prit");
else
	System.out.println("not prit");

*/

//int n1=0, n2=1, n4, x=10;
//
//System.out.println(n1);
//System.out.println(n2);
//
//for(int i=1;i<=x-1;i++)
//{
//	n4=n1+n2;
//	System.out.println(n4);
//	
//	n1=n2;
//	n2=n4;
//}
//



//int n6=24;
//if(n6%2 == 0)
//	System.out.println("even");
//else
//	System.out.println("odd");
//	
//	
	
	
String sh="puiPOL890$$@#uui";

//for(int i=0;i<=sh.length()-1;i++)
//{
//	if(sh.charAt(i)>=48 && sh.charAt(i)<=57)
//	{
//		System.out.println(sh.charAt(i));
//	}	
//	
//}

/*
String sss=sh.replaceAll("[^$$@#]", "");
System.out.println(sss);



int i=9;
String h=Integer.toString(i);
System.out.println(h);


String h1="8";

int gg=Integer.parseInt(h1);
System.out.println(gg);



String sth="jabm%%*$KL88";
sth.replaceAll("[^a-zA-Z0-9]", "");

*/

//occurance, print only uppercase, reversal of each word, one line inter q


/*
String sh1="PPkkl%^%^67";
for(int i=0;i<=sh1.length()-1;i++)
{	
	
	if(sh1.charAt(i)>=97 && sh1.charAt(i)<=122)
	{
		System.out.println(sh1.charAt(i));
	}
		
}





String sh8="ppab56";
System.out.println(sh8.length()-sh8.replace("p", "").length());

String k="HJiil";
String hh=k.toLowerCase();
System.out.println(hh);


String a1="LLpop";
String h2=a1.toUpperCase();
System.out.println(h2);


//String ss="java is oops";
//char[] c=ss.toCharArray();
*/

/*
//reversal, pattern both
String s1="pragti";
String s2="";

for(int i=s1.length()-1;i>=0;i--)
{	
	s2=s2+s1.charAt(i);	
	
}

System.out.println(s2);

System.out.println(s2.length());
*/


/*
int n1=4;

for(int i=0;i<=n1-1;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print("*");
	}
	
	System.out.println();
}

*/


/*
System.out.println("-----------------------");
List<String> lis=new ArrayList<String>();
lis.add("a");
lis.add("a1");
lis.add("a2");

for(String s:lis)
{
	System.out.println(s);
}


System.out.println("-------");

int row11=5;
for(int i=0;i<=row11-1;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print("*");
	}
}
System.out.println();




System.out.println("(((((((((((((((((((");
int row1=5;

for(int i=0;i<=row1-1;i++)
{
	
	for(int j=0;j<=i;j++)
	{
		System.out.print("*");
	}
	
	System.out.println();
}


System.out.println(")))))))))))))))))))))))))))");

String h="pragti";
String h1="";

for(int i=h.length()-1;i>=0;i--)
{
	h1=h1+h.charAt(i);
}

System.out.println(h1);


String s4="java is platform";

String[] arr=s4.split(" ");

StringBuilder sb=new StringBuilder();

//for(in)




System.out.println("--------------------");
//hashmap add, pattern, string reversal of each word

*/


//string dupl, prime no, * pattern, preincrement

/*
String s1="pragtii";
char[] arr=s1.toCharArray();

Map<Character,Integer> map=new HashMap<Character, Integer>();
for(Character c:arr)
{
	if(map.containsKey(c))
			{
		map.put(c, map.get(c)+1);		
		
			}
	
	else
	{
		map.put(c, 1);
	}
}


Set<Map.Entry<Character,Integer>> s=map.entrySet();
{
	for(Map.Entry<Character,Integer> m1:s)
	{
		if(m1.getValue()>1)
		{
			System.out.println(m1.getKey() + ":" +m1.getValue());
		}
		
	}
}

*/

/*int p=5, a=1;
for(int i=2;i<=p-1;i++)
{
	if(p%i==0)
	{
		a=0;
		break;
		
	}
}

if(a==1)
	System.out.println("prime");
else
	System.out.println("not prime");
*/


/*
 * int t=5; for(int i=0;i<=t-1;i++) { for(int j=0;j<=i;j++) {
 * System.out.print("*"); } System.out.println(); }
 */

int b=4;

/*
 * int a=b++; System.out.println(a);//4 System.out.println(b);//5
 * 
 */


//b++;

//System.out.println(b);//5

//int c=++b;
//
//System.out.println(c);
//System.out.println(b);

++b;
System.out.println(b);











    
	}

}
