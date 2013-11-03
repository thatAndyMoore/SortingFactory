


public class SelectionSort implements ISort, ISortComparable
{

	int[] a;
	
	public SelectionSort()
	{
	}
	
	/*
	public SelectionSort(int[] array)
	{
		this.a = array;
	}
	*/
	public void Sort(int[] a)
	{
		this.DoSelectionInsertion(a);
	}
	
	public void DoSelectionInsertion(int[] a)
	{
		System.out.println("Selection Sort:");
		System.out.println("---------------------");
		
		//int j;
		//int lowindex;
		for (int i = 0; i <a.length-1;i++)
		{
			int lowindex = i;
			int j;
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
		
		public void DoSelectionInsertion(Comparable[] a)
		{
			System.out.println("Selection Sort");
			System.out.println("--------------");
			for (int i=0; i<a.length; i++)
			{
				int lowindex = i;
				for (int j = a.length-1; j>i; j--)
				{
					if (a[j].compareTo(a[lowindex]) < 0)
					{
						lowindex = j;
					}
					DSutil.Swap(a, i, lowindex);
				}
			}
		}
		
		
		
	
		
		
	
public void SortComparable(Comparable[] a)
{
	DoSelectionInsertion(a);
	
}
}
