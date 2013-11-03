
public class MergeSort implements ISortComparable
{

	int[] a;
	
	public MergeSort()
	{
		
	}
	
	public void DoMergeSort(Comparable[] a, Comparable[] temp, int l, int r)
	{
		int mid = (l+r)/2;
		if (l == r) return;
		DoMergeSort(a, temp, l, mid);
		DoMergeSort(a, temp, mid+1, r);
		
		for (int i=l; i<=r; i++)
			temp[i] = a[i];
		
		int i1 = l; int i2 = mid+1;
		for(int curr=l; curr<=r; curr++)
		{
			if (i1 == mid+1)
				a[curr] = temp[i2++];
			else if (i2 >r)
				a[curr] = temp[i1++];
			else if (temp[i1].compareTo(temp[i2])<0)
				a[curr] = temp[i1++];
			else a[curr] = temp[i2++];
		}
		
	}
	@Override
	public void SortComparable(Comparable[] a)
	{
		this.DoMergeSort(a, new Comparable[a.length], 0, a.length -1);
		
	}

}
