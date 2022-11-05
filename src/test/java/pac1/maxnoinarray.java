package pac1;

public class maxnoinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=maxnoinarray.maxno();
		System.out.println(y);

	}
	
	public static int maxno()
	{
		
		
		   int[] agg= {3, 6, 7, 23, 0, 70, 5};
		   int temp;
		   
			for(int i=0;i<=agg.length-1;i++)
			{
				for(int j=i+1;j<=agg.length-1;j++)	
				{
					
					if(agg[i]>agg[j])
					{
						temp=agg[i];
						agg[i]=agg[j];
						agg[j]=temp;
						
						
					}
				}
				
				
			}
			return agg[6];   
	}
		
		
		
	}


