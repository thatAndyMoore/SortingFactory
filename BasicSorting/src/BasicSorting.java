
public class BasicSorting 
{
	public void InsertionSort(int[]a)
	{
		System.out.println("Insertion Sort");
		System.out.println("-------------------");
		
		for (int i = 1; i<a.length; i++)
		{
			int t = a[i];
		
			int j;
			for (j = i -1; (j>=0) && t<a[j]; j--)
			{
				a[j+1] = a[j];
			}
			
		
			a[j+1]=t;
			DSutil.printArray(a);
			
		}
	}
	
	    
		
		
		public void selectionInsertion(int[]a)
		{
			System.out.println("Selection Sort:");
			System.out.println("---------------------");
			
			int j;
			int lowindex;
			for (int i = 0; i <a.length-1;i++)
			{
				lowindex = i;
				for (j=a.length-1; j>=i; j--)
				{
					if (a[j] < a[lowindex])
					{
						lowindex=j;
					}
					DSutil.Swap(a, i, lowindex);
					
				}
				DSutil.printArray(a);
			}
			
			
		}
		
		public void bubbleSort(int[]a)
		{
			
			System.out.println("Bubble Sort:");
			System.out.println("---------------------");
			
			int lowindex = 0;
			
			for (int i = 0; i<a.length;i++)
			{
				for(int j=a.length-1; j>i;j--)
				{
					lowindex = j;
					if (a[j] < a[j-1])
					{
						lowindex = j -1;
						
					}
					DSutil.Swap(a, j, lowindex);
				}
			DSutil.printArray(a);
				
		}
		
		
	}

}
	
