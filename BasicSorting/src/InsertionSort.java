
public class InsertionSort implements ISort, ISortComparable
{
	
	public InsertionSort()
	{
	}
	
	public void Sort(int[] a)
	{
		this.DoInsertionSort(a);
	}
	private void DoInsertionSort(int[]a)
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
	
	private void DoInsertionSort(Comparable[] a)
	{
		System.out.println("Insertion Sort");
		System.out.println("-------------------");
		
		for (int i = 1; i<a.length; i++)
		{
		
			for (int j = i; (j>0) && (a[j].compareTo(a[j-1])<0); j--)
				DSutil.Swap(a, j, j-1);
				
		}
	}

	@Override
	public void SortComparable(Comparable[] a)
	{
		DoInsertionSort(a);
		
	}
}
