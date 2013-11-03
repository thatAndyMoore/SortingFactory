

public class SortingFactory
{
	public static ISort FindSortingClass(int[] a)
	{
		if (a.length <5)
		{
			return new InsertionSort();
			
		}
		
		if (5 <= a.length && a.length < 10)
		{
			return new SelectionSort();
		}
		
		else return new BubbleSort();
	
	}
	
	public static ISortComparable FindComparableSortingClass(Comparable[] a)
	{
		if (a.length <5)
		{
			return new InsertionSort();
			
		}
		
		if (5 <= a.length && a.length < 10)
		{
			return new SelectionSort();
		}
		
		if(a.length >= 10 && a.length <15)
		{
			return new BubbleSort();
		}
		
		if(a.length >=15 && a.length < 20)
		{
			return new MergeSort();
		}
		
		else
			return new QuickSort();
	}
}
