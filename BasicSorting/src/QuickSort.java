

public class QuickSort implements ISortComparable
{
	public void QuickSort()
	{
		
	}
	
	public void doQuickSort(Comparable[] a, int i, int j)
	{
		int pivotindex = findpivot(a, i, j);
		DSutil.Swap(a, pivotindex, j);
		int k = partition(a, i-1, j, a[j]);
		DSutil.Swap(a, k, j);
		if((k-i) > 1) doQuickSort(a, i, k-1);
		if ((j-k) > 1) doQuickSort(a, k+1, j);
	}
	
	
	int findpivot(Comparable[] a, int i, int j)
	{
		return(i+j)/2;
	}
	
	 int partition(Comparable[] a, int l, int r, Comparable pivot)
	{
		do
		{
			while(a[++l].compareTo(pivot)<0);
			while((r!=0) && (a[--r].compareTo(pivot)>0));
			DSutil.Swap(a, l, r);
		}while(l<r);
		DSutil.Swap(a, l, r);
		return l;
		
		
	}
	

	@Override
	public void SortComparable(Comparable[] a)
	{
		this.doQuickSort(a, 0, a.length -1);
	}
	
	
}